package com.traverse.fabulousores.items;

import com.traverse.fabulousores.FabulousOres;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BaseBlockItem extends BlockItem {

    public BaseBlockItem(Block block) {
        super(block, new Properties().tab(FabulousOres.TAB));
    }
}
