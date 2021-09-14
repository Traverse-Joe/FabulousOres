package com.traverse.fabulousores.init;

import com.traverse.fabulousores.FabulousOres;
import com.traverse.fabulousores.blocks.BaseBlock;
import com.traverse.fabulousores.items.BaseBlockItem;
import com.traverse.fabulousores.items.BaseIngot;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;


@Mod.EventBusSubscriber(bus = MOD)
public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, FabulousOres.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =  DeferredRegister.create(ForgeRegistries.BLOCKS, FabulousOres.MOD_ID);

    //MODDED ORES
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> OreManager.COPPER_ORE);
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> OreManager.TIN_ORE);
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> OreManager.LEAD_ORE);

    //NETHER ORES
    public static final RegistryObject<Block> NETHER_COPPER_ORE = BLOCKS.register("nether_copper_ore", () -> OreManager.NETHER_COPPER_ORE);

    //END ORES
    public static final RegistryObject<Block> END_TIN_ORE = BLOCKS.register("end_tin_ore", () -> OreManager.END_TIN_ORE);

    //DENSE ORES
    public static final RegistryObject<Block> DENSE_IRON_ORE = BLOCKS.register("dense_iron_ore", () -> OreManager.DENSE_IRON_ORE);
    public static final RegistryObject<Block> DENSE_COPPER_ORE = BLOCKS.register("dense_copper_ore", () -> OreManager.DENSE_COPPER_ORE);

    //METAL BLOCKS
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", BaseBlock::new);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", BaseBlock::new);
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", BaseBlock::new);

    //ORE ITEMS
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BaseBlockItem(COPPER_ORE.get()));
    public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BaseBlockItem(TIN_ORE.get()));
    public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BaseBlockItem(LEAD_ORE.get()));
    public static final RegistryObject<Item> NETHER_COPPER_ORE_ITEM = ITEMS.register("nether_copper_ore", () -> new BaseBlockItem(NETHER_COPPER_ORE.get()));
    public static final RegistryObject<Item> END_TIN_ORE_ITEM = ITEMS.register("end_tin_ore", () -> new BaseBlockItem(END_TIN_ORE.get()));
    public static final RegistryObject<Item> DENSE_IRON_ORE_ITEM = ITEMS.register("dense_iron_ore", () -> new BaseBlockItem(DENSE_IRON_ORE.get()));
    public static final RegistryObject<Item> DENSE_COPPER_ORE_ITEM = ITEMS.register("dense_copper_ore", () -> new BaseBlockItem(DENSE_COPPER_ORE.get()));

    //METAL BLOCK ITEM
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BaseBlockItem(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BaseBlockItem(TIN_BLOCK.get()));
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block", () -> new BaseBlockItem(LEAD_BLOCK.get()));

    //Ingots
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", BaseIngot::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", BaseIngot::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", BaseIngot::new);

    //Nuggets


    @OnlyIn(Dist.CLIENT)
    public static void registerRenderer() {
        //Items
        registerBlockRenderer(OreManager.COPPER_ORE.getColor(), COPPER_ORE.get());
        registerBlockRenderer(OreManager.TIN_ORE.getColor(), TIN_ORE.get());
        registerBlockRenderer(OreManager.LEAD_ORE.getColor(), LEAD_ORE.get());
        registerBlockRenderer(OreManager.NETHER_COPPER_ORE.getColor(),NETHER_COPPER_ORE.get());
        registerBlockRenderer(OreManager.END_TIN_ORE.getColor(),END_TIN_ORE.get());
        registerBlockRenderer(OreManager.DENSE_IRON_ORE.getColor(),DENSE_IRON_ORE.get());
        registerBlockRenderer(OreManager.DENSE_COPPER_ORE.getColor(),DENSE_COPPER_ORE.get());
        
        registerBlockRenderer(OreManager.COPPER_ORE.getColor(), COPPER_BLOCK.get());
        registerBlockRenderer(OreManager.TIN_ORE.getColor(), TIN_BLOCK.get());
        registerBlockRenderer(OreManager.LEAD_ORE.getColor(), LEAD_BLOCK.get());

        //Items
        registerItemRenderer(OreManager.COPPER_ORE.getColor(), COPPER_INGOT.get());
        registerItemRenderer(OreManager.TIN_ORE.getColor(), TIN_INGOT.get());
        registerItemRenderer(OreManager.LEAD_ORE.getColor(), LEAD_INGOT.get());
    }

    public static void registerBlockRenderer(int color, Block block) {
        Minecraft.getInstance().getItemColors().register((stack, tintIndex) -> tintIndex > 0 ? -1 : color, block.getBlock().asItem());
        Minecraft.getInstance().getBlockColors().register((state, reader, blockPos, tintIndex) -> tintIndex > 0 ? -1 : color, block);
        RenderTypeLookup.setRenderLayer(block, RenderType.cutoutMipped());
    }

    public static void registerItemRenderer(int color, Item item) {
        Minecraft.getInstance().getItemColors().register((stack, tintIndex) -> tintIndex > 0 ? -1 : color, item);
    }
}
