package com.traverse.fabulousores.worldgen;

import com.traverse.fabulousores.init.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FabulousOresFeature {

    public static void addOres(final BiomeLoadingEvent evt) {

        //MODDED ORES
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ALUMINUM_ORE.get().defaultBlockState(), 10, 40, 70, 7);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.COPPER_ORE.get().defaultBlockState(), 10, 30, 64, 7);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.LEAD_ORE.get().defaultBlockState(), 8, 20, 40, 7);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.NICKEL_ORE.get().defaultBlockState(), 8, 1, 25, 7);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.OSMIUM_ORE.get().defaultBlockState(), 8, 20, 40, 7);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PLATINUM_ORE.get().defaultBlockState(), 6, 1, 25, 3);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.SILVER_ORE.get().defaultBlockState(), 8, 1, 25, 5);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.TIN_ORE.get().defaultBlockState(), 10, 30, 60, 7);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.URANIUM_ORE.get().defaultBlockState(), 6, 1, 25, 7);
        addOre(evt, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ZINC_ORE.get().defaultBlockState(), 10, 30, 60, 7);

        //add
    }

    public static void addOre(final BiomeLoadingEvent evt, RuleTest test, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        evt.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(test, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(amount));
    }
}
