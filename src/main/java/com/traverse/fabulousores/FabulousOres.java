package com.traverse.fabulousores;

import com.traverse.fabulousores.init.OreManager;
import com.traverse.fabulousores.init.RegistryHandler;
import com.traverse.fabulousores.worldgen.FabulousOresFeature;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.traverse.fabulousores.FabulousOres.MOD_ID;

@Mod(MOD_ID)
public class FabulousOres {

    public static final String MOD_ID = "fabulousores";
    public static ItemGroup TAB = new ItemGroup("fabulousOresTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.DENSE_IRON_ORE_ITEM.get());
        }
    };

    public FabulousOres() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        OreManager.init();
        RegistryHandler.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        RegistryHandler.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FabulousOresFeature::addOres);

    }

    private void setup(FMLCommonSetupEvent evt) {

    }

    private void clientSetup(FMLClientSetupEvent evt) {
        RegistryHandler.registerRenderer();
    }
}
