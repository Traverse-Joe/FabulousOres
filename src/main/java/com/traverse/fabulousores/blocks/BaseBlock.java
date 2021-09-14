package com.traverse.fabulousores.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block {

    public BaseBlock() {
        super(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F));
    }
}
