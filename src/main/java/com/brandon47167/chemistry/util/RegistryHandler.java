package com.brandon47167.chemistry.util;


import com.brandon47167.chemistry.Chemistry;

import com.brandon47167.chemistry.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.brandon47167.chemistry.items.ItemBase;
public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Chemistry.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Chemistry.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item>  sulfur = ITEMS.register( "sulfur", ItemBase::new);
    public static final RegistryObject<Item>  carbon = ITEMS.register( "carbon", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block>  Neon_Block = BLOCKS.register("neon_block", NeonBlock:: new);
    public static final RegistryObject<Block>  Carbon_Block = BLOCKS.register("carbon_block", CarbonBlock:: new);

    public static final RegistryObject<Block>  Silicon_Block = BLOCKS.register("silicon_block", SiliconBlock:: new);
    public static final RegistryObject<Block>  Germanium_Block = BLOCKS.register("germanium_block", GermaniumBlock:: new);
    public static final RegistryObject<Block>  Boron_Block = BLOCKS.register("boron_block", BoronBlock:: new);
    public static final RegistryObject<Block>  Arsenic_Block = BLOCKS.register("arsenic_block", ArsenicBlock:: new);

    // Block Items
    public static final RegistryObject<Item> Neon_Block_Item = ITEMS.register("neon_block", () -> new BlockItemBase(Neon_Block.get()));
    public static final RegistryObject<Item> Carbon_Block_Item = ITEMS.register("carbon_block", () -> new BlockItemBase(Carbon_Block.get()));

    public static final RegistryObject<Item> Silicon_Block_Item = ITEMS.register("silicon_block", () -> new BlockItemBase2(Silicon_Block.get()));
    public static final RegistryObject<Item> Germanium_Block_Item = ITEMS.register("germanium_block", () -> new BlockItemBase2(Germanium_Block.get()));
    public static final RegistryObject<Item> Boron_Block_Item = ITEMS.register("boron_block", () -> new BlockItemBase2(Boron_Block.get()));
    public static final RegistryObject<Item> Arsenic_Block_Item = ITEMS.register("arsenic_block", () -> new BlockItemBase2(Arsenic_Block.get()));
}
