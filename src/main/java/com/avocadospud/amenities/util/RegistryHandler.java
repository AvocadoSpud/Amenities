package com.avocadospud.amenities.util;

import com.avocadospud.amenities.Amenities;
import com.avocadospud.amenities.blocks.BlockItemBase;
import com.avocadospud.amenities.blocks.OakTableBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Amenities.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Amenities.MOD_ID);

    public static void init() {

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    // Items

    // Blocks
    public static final RegistryObject<Block> OAK_TABLE = BLOCKS.register("oak_table", OakTableBlock::new);

    // Block Items
    public static final RegistryObject<Item> OAK_TABLE_ITEM = ITEMS.register("oak_table", () -> new BlockItemBase(OAK_TABLE.get()));
}
