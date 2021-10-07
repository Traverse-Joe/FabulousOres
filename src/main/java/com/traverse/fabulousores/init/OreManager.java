package com.traverse.fabulousores.init;

import com.traverse.fabulousores.blocks.BaseEndOre;
import com.traverse.fabulousores.blocks.BaseNetherOre;
import com.traverse.fabulousores.blocks.BaseOreBlock;
import net.minecraft.block.Block;

public class OreManager {
    public static BaseOreBlock ALUMINUM_ORE;
    public static BaseOreBlock COPPER_ORE;
    public static BaseOreBlock LEAD_ORE;
    public static BaseOreBlock NICKEL_ORE;
    public static BaseOreBlock OSMIUM_ORE;
    public static BaseOreBlock PLATINUM_ORE;
    public static BaseOreBlock SILVER_ORE;
    public static BaseOreBlock TIN_ORE;
    public static BaseOreBlock URANIUM_ORE;
    public static BaseOreBlock ZINC_ORE;

    public static BaseNetherOre NETHER_ALUMINUM_ORE;
    public static BaseNetherOre NETHER_COAL_ORE;
    public static BaseNetherOre NETHER_COPPER_ORE;
    public static BaseNetherOre NETHER_DIAMOND_ORE;
    public static BaseNetherOre NETHER_EMERALD_ORE;
    public static BaseNetherOre NETHER_IRON_ORE;
    public static BaseNetherOre NETHER_LAPIS_ORE;
    public static BaseNetherOre NETHER_LEAD_ORE;
    public static BaseNetherOre NETHER_NICKEL_ORE;
    public static BaseNetherOre NETHER_OSMIUM_ORE;
    public static BaseNetherOre NETHER_PLATINUM_ORE;
    public static BaseNetherOre NETHER_SILVER_ORE;
    public static BaseNetherOre NETHER_TIN_ORE;
    public static BaseNetherOre NETHER_URANIUM_ORE;
    public static BaseNetherOre NETHER_ZINC_ORE;

    public static BaseOreBlock END_ALUMINUM_ORE;
    public static BaseOreBlock END_COAL_ORE;
    public static BaseOreBlock END_COPPER_ORE;
    public static BaseOreBlock END_DIAMOND_ORE;
    public static BaseOreBlock END_EMERALD_ORE;
    public static BaseOreBlock END_GOLD_ORE;
    public static BaseOreBlock END_IRON_ORE;
    public static BaseOreBlock END_LAPIS_ORE;
    public static BaseOreBlock END_LEAD_ORE;
    public static BaseOreBlock END_NICKEL_ORE;
    public static BaseOreBlock END_OSMIUM_ORE;
    public static BaseOreBlock END_PLATINUM_ORE;
    public static BaseOreBlock END_SILVER_ORE;
    public static BaseOreBlock END_TIN_ORE;
    public static BaseOreBlock END_URANIUM_ORE;
    public static BaseOreBlock END_ZINC_ORE;

    public static BaseOreBlock DENSE_ALUMINUM_ORE;
    public static BaseOreBlock DENSE_COAL_ORE;
    public static BaseOreBlock DENSE_COPPER_ORE;
    public static BaseOreBlock DENSE_DIAMOND_ORE;
    public static BaseOreBlock DENSE_EMERALD_ORE;
    public static BaseOreBlock DENSE_GOLD_ORE;
    public static BaseOreBlock DENSE_IRON_ORE;
    public static BaseOreBlock DENSE_LAPIS_ORE;
    public static BaseOreBlock DENSE_LEAD_ORE;
    public static BaseOreBlock DENSE_NICKEL_ORE;
    public static BaseOreBlock DENSE_OSMIUM_ORE;
    public static BaseOreBlock DENSE_PLATINUM_ORE;
    public static BaseOreBlock DENSE_SILVER_ORE;
    public static BaseOreBlock DENSE_TIN_ORE;
    public static BaseOreBlock DENSE_URANIUM_ORE;
    public static BaseOreBlock DENSE_ZINC_ORE;

    public static void init() {
        //MODDED ORES
        ALUMINUM_ORE = new BaseOreBlock("aluminum",1);
        COPPER_ORE = new BaseOreBlock("copper",1);
        LEAD_ORE = new BaseOreBlock("lead", 2);
        NICKEL_ORE = new BaseOreBlock("nickel", 2);
        OSMIUM_ORE = new BaseOreBlock("osmium", 1);
        PLATINUM_ORE = new BaseOreBlock("platinum", 3);
        SILVER_ORE = new BaseOreBlock("silver", 2);
        TIN_ORE = new BaseOreBlock("tin", 1);
        URANIUM_ORE = new BaseOreBlock("uranium", 2);
        ZINC_ORE = new BaseOreBlock("zinc", 2);

        //NETHER ORES
        NETHER_ALUMINUM_ORE = new BaseNetherOre("nether_aluminum", ALUMINUM_ORE);
        NETHER_COAL_ORE = new BaseNetherOre("nether_coal", 1);
        NETHER_COPPER_ORE = new BaseNetherOre("nether_copper", COPPER_ORE);
        NETHER_DIAMOND_ORE = new BaseNetherOre("nether_diamond", 2);
        NETHER_EMERALD_ORE =new BaseNetherOre("nether_emerald", 2);
        NETHER_IRON_ORE = new BaseNetherOre("nether_iron", 1);
        NETHER_LAPIS_ORE = new BaseNetherOre("nether_lapis", 1);
        NETHER_LEAD_ORE = new BaseNetherOre("nether_lead", LEAD_ORE);
        NETHER_NICKEL_ORE = new BaseNetherOre("nether_nickel", NICKEL_ORE);
        NETHER_OSMIUM_ORE = new BaseNetherOre("nether_osmium", OSMIUM_ORE);
        NETHER_PLATINUM_ORE = new BaseNetherOre("nether_platinum_", PLATINUM_ORE);
        NETHER_SILVER_ORE = new BaseNetherOre("nether_silver", SILVER_ORE);
        NETHER_TIN_ORE = new BaseNetherOre("nether_tin", TIN_ORE);
        NETHER_URANIUM_ORE = new BaseNetherOre("nether_uranium", URANIUM_ORE);
        NETHER_ZINC_ORE = new BaseNetherOre("nether_zinc", ZINC_ORE);

        //END ORES
        END_ALUMINUM_ORE = new BaseEndOre("end_aluminum", ALUMINUM_ORE);
        END_COAL_ORE = new BaseEndOre("end_coal", NETHER_COAL_ORE);
        END_COPPER_ORE = new BaseEndOre("end_copper", COPPER_ORE);
        END_DIAMOND_ORE = new BaseEndOre("end_diamond", NETHER_DIAMOND_ORE);
        END_EMERALD_ORE =new BaseEndOre("end_emerald", NETHER_EMERALD_ORE);
        END_GOLD_ORE = new BaseEndOre("end_gold", 2);
        END_IRON_ORE = new BaseEndOre("end_iron", NETHER_IRON_ORE);
        END_LAPIS_ORE = new BaseEndOre("end_lapis", NETHER_LAPIS_ORE);
        END_LEAD_ORE = new BaseEndOre("end_lead", LEAD_ORE);
        END_NICKEL_ORE = new BaseEndOre("end_nickel", NICKEL_ORE);
        END_OSMIUM_ORE = new BaseEndOre("end_osmium", OSMIUM_ORE);
        END_PLATINUM_ORE = new BaseEndOre("end_platinum_", PLATINUM_ORE);
        END_SILVER_ORE = new BaseEndOre("end_silver", SILVER_ORE);
        END_TIN_ORE = new BaseEndOre("end_tin", TIN_ORE);
        END_URANIUM_ORE = new BaseEndOre("end_uranium", URANIUM_ORE);
        END_ZINC_ORE = new BaseEndOre("end_zinc", ZINC_ORE);
        END_TIN_ORE = new BaseEndOre("end_tin", TIN_ORE);

        //DENSE ORES
        DENSE_ALUMINUM_ORE = new BaseEndOre("dense_aluminum_ore", ALUMINUM_ORE);
        DENSE_COAL_ORE = new BaseEndOre("dense_coal", NETHER_COAL_ORE);
        DENSE_COPPER_ORE = new BaseEndOre("dense_copper", COPPER_ORE);
        DENSE_DIAMOND_ORE = new BaseEndOre("dense_diamond", NETHER_DIAMOND_ORE);
        DENSE_EMERALD_ORE =new BaseEndOre("dense_emerald", NETHER_EMERALD_ORE);
        DENSE_GOLD_ORE = new BaseEndOre("dense_gold", END_GOLD_ORE);
        DENSE_IRON_ORE = new BaseEndOre("dense_iron", NETHER_IRON_ORE);
        DENSE_LAPIS_ORE = new BaseEndOre("dense_lapis", NETHER_LAPIS_ORE);
        DENSE_LEAD_ORE = new BaseEndOre("dense_lead", LEAD_ORE);
        DENSE_NICKEL_ORE = new BaseEndOre("dense_nickel", NICKEL_ORE);
        DENSE_OSMIUM_ORE = new BaseEndOre("dense_osmium", OSMIUM_ORE);
        DENSE_PLATINUM_ORE = new BaseEndOre("dense_platinum_", PLATINUM_ORE);
        DENSE_SILVER_ORE = new BaseEndOre("dense_silver", SILVER_ORE);
        DENSE_TIN_ORE = new BaseEndOre("dense_tin", TIN_ORE);
        DENSE_URANIUM_ORE = new BaseEndOre("dense_uranium", URANIUM_ORE);
        DENSE_ZINC_ORE = new BaseEndOre("dense_zinc", ZINC_ORE);
        DENSE_TIN_ORE = new BaseEndOre("dense_tin", TIN_ORE);
    }
}
