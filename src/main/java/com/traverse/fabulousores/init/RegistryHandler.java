package com.traverse.fabulousores.init;

import com.traverse.fabulousores.FabulousOres;
import com.traverse.fabulousores.blocks.BaseBlock;
import com.traverse.fabulousores.blocks.Ore;
import com.traverse.fabulousores.items.BaseBlockItem;
import com.traverse.fabulousores.items.BaseIngot;
import com.traverse.fabulousores.items.BaseNugget;
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
import org.lwjgl.system.windows.DISPLAY_DEVICE;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;


@Mod.EventBusSubscriber(bus = MOD)
public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, FabulousOres.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =  DeferredRegister.create(ForgeRegistries.BLOCKS, FabulousOres.MOD_ID);

    //BLOCKS ----------------------------------------------------------------

    //MODDED ORES
    public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", () -> OreManager.ALUMINUM_ORE);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> OreManager.COPPER_ORE);
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> OreManager.LEAD_ORE);
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () -> OreManager.NICKEL_ORE);
    public static final RegistryObject<Block> OSMIUM_ORE = BLOCKS.register("osmium_ore", () -> OreManager.OSMIUM_ORE);
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> OreManager.PLATINUM_ORE);
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> OreManager.SILVER_ORE);
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> OreManager.TIN_ORE);
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () -> OreManager.URANIUM_ORE);
    public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore", () -> OreManager.ZINC_ORE);

    //NETHER ORES
    public static final RegistryObject<Block> NETHER_COPPER_ORE = BLOCKS.register("nether_copper_ore", () -> OreManager.NETHER_COPPER_ORE);

    //END ORES
    public static final RegistryObject<Block> END_TIN_ORE = BLOCKS.register("end_tin_ore", () -> OreManager.END_TIN_ORE);

    //DENSE ORES
    public static final RegistryObject<Block> DENSE_IRON_ORE = BLOCKS.register("dense_iron_ore", () -> OreManager.DENSE_IRON_ORE);
    public static final RegistryObject<Block> DENSE_COPPER_ORE = BLOCKS.register("dense_copper_ore", () -> OreManager.DENSE_COPPER_ORE);

    //METAL BLOCKS
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", BaseBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", BaseBlock::new);
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", BaseBlock::new);
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", BaseBlock::new);
    public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block", BaseBlock::new);
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", BaseBlock::new);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", BaseBlock::new);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", BaseBlock::new);
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", BaseBlock::new);
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", BaseBlock::new);

    //ITEMS ----------------------------------------------------------------

    //MODDED ORE ITEMS
    public static final RegistryObject<Item> ALUMINUM_ORE_ITEM = ITEMS.register("aluminum_ore", () -> new BaseBlockItem(ALUMINUM_ORE.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BaseBlockItem(COPPER_ORE.get()));
    public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BaseBlockItem(LEAD_ORE.get()));
    public static final RegistryObject<Item> NICKEL_ORE_ITEM = ITEMS.register("nickel_ore", () -> new BaseBlockItem(NICKEL_ORE.get()));
    public static final RegistryObject<Item> OSMIUM_ORE_ITEM = ITEMS.register("osmium_ore", () -> new BaseBlockItem(OSMIUM_ORE.get()));
    public static final RegistryObject<Item> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore", () -> new BaseBlockItem(PLATINUM_ORE.get()));
    public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BaseBlockItem(SILVER_ORE.get()));
    public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BaseBlockItem(TIN_ORE.get()));
    public static final RegistryObject<Item> URANIUM_ORE_ITEM = ITEMS.register("uranium_ore", () -> new BaseBlockItem(URANIUM_ORE.get()));
    public static final RegistryObject<Item> ZINC_ORE_ITEM = ITEMS.register("zinc_ore", () -> new BaseBlockItem(ZINC_ORE.get()));

   //NETHER ORE ITEMS
    public static final RegistryObject<Item> NETHER_COPPER_ORE_ITEM = ITEMS.register("nether_copper_ore", () -> new BaseBlockItem(NETHER_COPPER_ORE.get()));

   //END ORES ITEMS
    public static final RegistryObject<Item> END_TIN_ORE_ITEM = ITEMS.register("end_tin_ore", () -> new BaseBlockItem(END_TIN_ORE.get()));

    //DENSE ORES ITEMS
    public static final RegistryObject<Item> DENSE_IRON_ORE_ITEM = ITEMS.register("dense_iron_ore", () -> new BaseBlockItem(DENSE_IRON_ORE.get()));
    public static final RegistryObject<Item> DENSE_COPPER_ORE_ITEM = ITEMS.register("dense_copper_ore", () -> new BaseBlockItem(DENSE_COPPER_ORE.get()));

    //METAL BLOCK ITEMS
    public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = ITEMS.register("aluminum_block", () -> new BaseBlockItem(ALUMINUM_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BaseBlockItem(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block", () -> new BaseBlockItem(LEAD_BLOCK.get()));
    public static final RegistryObject<Item> NICKEL_BLOCK_ITEM = ITEMS.register("nickel_block", () -> new BaseBlockItem(NICKEL_BLOCK.get()));
    public static final RegistryObject<Item> OSMIUM_BLOCK_ITEM = ITEMS.register("osmium_block", () -> new BaseBlockItem(OSMIUM_BLOCK.get()));
    public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block", () -> new BaseBlockItem(PLATINUM_BLOCK.get()));
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BaseBlockItem(SILVER_BLOCK.get()));
    public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BaseBlockItem(TIN_BLOCK.get()));
    public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = ITEMS.register("uranium_block", () -> new BaseBlockItem(URANIUM_BLOCK.get()));
    public static final RegistryObject<Item> ZINC_BLOCK_ITEM = ITEMS.register("zinc_block", () -> new BaseBlockItem(ZINC_BLOCK.get()));

    //Ingots
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", BaseIngot::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", BaseIngot::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", BaseIngot::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", BaseIngot::new);
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", BaseIngot::new);
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", BaseIngot::new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", BaseIngot::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", BaseIngot::new);
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", BaseIngot::new);
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", BaseIngot::new);

    //Nuggets
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", BaseNugget::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", BaseNugget::new);
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", BaseNugget::new);
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", BaseNugget::new);
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", BaseNugget::new);
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", BaseNugget::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", BaseNugget::new);
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", BaseNugget::new);
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", BaseNugget::new);
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", BaseNugget::new);

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderer() {
        //Blocks
        for(RegistryObject<Block> block:BLOCKS.getEntries()) {
            if (block.get() instanceof Ore) {
                registerBlockRenderer(((Ore) block.get()).getColor(), block.get());
            }
        }

        //Items
        registerItemRenderer(OreManager.ALUMINUM_ORE.getColor(), ALUMINUM_INGOT.get(), ALUMINUM_NUGGET.get());
        registerItemRenderer(OreManager.COPPER_ORE.getColor(), COPPER_INGOT.get(), COPPER_NUGGET.get());
        registerItemRenderer(OreManager.LEAD_ORE.getColor(), LEAD_INGOT.get(), LEAD_NUGGET.get());
        registerItemRenderer(OreManager.NICKEL_ORE.getColor(), NICKEL_INGOT.get(), NICKEL_NUGGET.get());
        registerItemRenderer(OreManager.OSMIUM_ORE.getColor(), OSMIUM_INGOT.get(), OSMIUM_NUGGET.get());
        registerItemRenderer(OreManager.PLATINUM_ORE.getColor(), PLATINUM_INGOT.get(), PLATINUM_NUGGET.get());
        registerItemRenderer(OreManager.SILVER_ORE.getColor(), SILVER_INGOT.get(), SILVER_NUGGET.get());
        registerItemRenderer(OreManager.TIN_ORE.getColor(), TIN_INGOT.get(), TIN_NUGGET.get());
        registerItemRenderer(OreManager.URANIUM_ORE.getColor(), URANIUM_INGOT.get(), URANIUM_NUGGET.get());
        registerItemRenderer(OreManager.ZINC_ORE.getColor(), ZINC_INGOT.get(), ZINC_NUGGET.get());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerBlockRenderer(int color, Block block) {
        Minecraft.getInstance().getItemColors().register((stack, tintIndex) -> tintIndex > 0 ? -1 : color, block.getBlock().asItem());
        Minecraft.getInstance().getBlockColors().register((state, reader, blockPos, tintIndex) -> tintIndex > 0 ? -1 : color, block);
        RenderTypeLookup.setRenderLayer(block, RenderType.cutoutMipped());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerItemRenderer(int color, Item ingot, Item nugget) {
        Minecraft.getInstance().getItemColors().register((stack, tintIndex) -> tintIndex > 0 ? -1 : color, ingot);
        Minecraft.getInstance().getItemColors().register((stack, tintIndex) -> tintIndex > 0 ? -1 : color, nugget);
    }
}
