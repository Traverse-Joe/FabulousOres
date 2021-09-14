package com.traverse.fabulousores.init;

import com.traverse.fabulousores.blocks.BaseNetherOre;
import com.traverse.fabulousores.blocks.BaseOreBlock;
import net.minecraft.block.Block;

public class OreManager {

    public static BaseOreBlock COPPER_ORE;
    public static BaseOreBlock TIN_ORE;
    public static BaseOreBlock LEAD_ORE;
    public static BaseOreBlock OSMIUM_ORE;
    public static BaseNetherOre NETHER_COPPER_ORE;
    public static BaseOreBlock END_TIN_ORE;
    public static BaseOreBlock DENSE_IRON_ORE;
    public static BaseOreBlock DENSE_COPPER_ORE;

    public static void init() {
        //MODDED ORES
        COPPER_ORE = new BaseOreBlock("copper",1, 0xff4d00);
        TIN_ORE = new BaseOreBlock("tin", 1, 0xcfddff);
        LEAD_ORE = new BaseOreBlock("lead", 2, 0x9F8EFF);
        OSMIUM_ORE = new BaseOreBlock("osmium", 1, 0x96BCFF);

        //NETHER ORES
        NETHER_COPPER_ORE = new BaseNetherOre("nether_copper", 1, COPPER_ORE.getColor(), 1.0F, 0.05);

        //END ORES
        END_TIN_ORE = new BaseOreBlock("end_tin", 1, TIN_ORE.getColor());

        //DENSE ORES
        DENSE_IRON_ORE = new BaseOreBlock("dense_iron", 1, 0xffd8b5);
        DENSE_COPPER_ORE = new BaseOreBlock("dense_copper_ore", 1, COPPER_ORE.getColor());
    }
}
