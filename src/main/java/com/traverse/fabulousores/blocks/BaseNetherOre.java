package com.traverse.fabulousores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.Random;

public class BaseNetherOre extends Ore {

    float radius;
    double percentage;

    public BaseNetherOre(String name, int harvestLevel, int color, float radius, double percentage) {
        super(name, harvestLevel, color);
        this.radius = radius;
        this.percentage = percentage;
    }

    @Override
    public void playerDestroy(World world, PlayerEntity player, BlockPos blockPos, BlockState state, TileEntity te, ItemStack stack) {
        if(!world.isClientSide()) {
            if(!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, stack) > 0)) {
                Random random = new Random();
                int percent = (int) (percentage * 100);
                if (random.nextInt(100) < percent) {
                    Block block = state.getBlock();
                    block.destroy(world, blockPos, state);
                    world.explode(player, blockPos.getX(), blockPos.getY(), blockPos.getZ(), radius, Explosion.Mode.DESTROY);
                }
            }

        }
        super.playerDestroy(world, player, blockPos, state, te, stack);
    }
}
