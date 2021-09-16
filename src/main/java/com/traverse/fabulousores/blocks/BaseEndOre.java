package com.traverse.fabulousores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BaseEndOre extends BaseOreBlock {

    public BaseEndOre(String name, int harvestLevel, int color) {
        super(name, harvestLevel, color);
    }

    public BaseEndOre(String name, BaseOreBlock base) {
        super(name, base.harvestLevel, base.color);
    }

    @Override
    public void playerDestroy(World world, PlayerEntity player, BlockPos blockPos, BlockState state, TileEntity te, ItemStack stack) {
        if(!world.isClientSide()) {
            if(!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, stack) > 0)) {
                Random random = new Random();
                int percent = (int) (0.05 * 100);
                if (random.nextInt(100) < percent) {
                    Block block = state.getBlock();
                    block.destroy(world, blockPos, state);
                    EndermiteEntity endermite = new EndermiteEntity(EntityType.ENDERMITE, world);
                    endermite.getAttribute(Attributes.MAX_HEALTH).setBaseValue(10);
                    endermite.setHealth(10);
                    endermite.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(4);
                    endermite.setPos(blockPos.getX(), blockPos.getY(), blockPos.getZ());
                    world.addFreshEntity(endermite);
                }
            }

        }
        super.playerDestroy(world, player, blockPos, state, te, stack);
    }
}
