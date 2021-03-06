package com.traverse.fabulousores.blocks;

import com.traverse.fabulousores.FabulousOres;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public abstract class Ore extends Block {

    protected ResourceLocation id;
    protected  int harvestLevel;

    public Ore(String name, int harvestLevel) {
        super(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F));
        this.id = new ResourceLocation(FabulousOres.MOD_ID, name);
        this.harvestLevel = harvestLevel;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return harvestLevel;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public ResourceLocation getId() {
        return id;
    }

}
