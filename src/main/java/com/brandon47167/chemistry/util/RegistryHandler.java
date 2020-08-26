package com.brandon47167.chemistry.util;


import com.brandon47167.chemistry.Chemistry;

import com.brandon47167.chemistry.blocks.*;
import com.brandon47167.chemistry.blocks.metaloids.*;
import com.brandon47167.chemistry.blocks.nonmetals.CarbonBlock;
import com.brandon47167.chemistry.blocks.nonmetals.NeonBlock;
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
    public static final RegistryObject<Item> sulfur = ITEMS.register("sulfur", ItemBase::new);
    public static final RegistryObject<Item> carbon = ITEMS.register("carbon", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> Neon_Block = BLOCKS.register("neon_block", NeonBlock::new);
    public static final RegistryObject<Block> Carbon_Block = BLOCKS.register("carbon_block", CarbonBlock::new);
    public static final RegistryObject<Block> Hydrogen_Block = BLOCKS.register("hydrogen_block", NeonBlock::new);
    public static final RegistryObject<Block> Helium_Block = BLOCKS.register("helium_block", CarbonBlock::new);
    public static final RegistryObject<Block> Nitrogen_Block = BLOCKS.register("nitrogen_block", NeonBlock::new);
    public static final RegistryObject<Block> Oxygen_Block = BLOCKS.register("oxygen_block", CarbonBlock::new);
    public static final RegistryObject<Block> Fluorine_Block = BLOCKS.register("fluorine_block", NeonBlock::new);
    public static final RegistryObject<Block> Phosphorus_Block = BLOCKS.register("phosphorus_block", CarbonBlock::new);


    public static final RegistryObject<Block> Silicon_Block = BLOCKS.register("silicon_block", SiliconBlock::new);
    public static final RegistryObject<Block> Germanium_Block = BLOCKS.register("germanium_block", GermaniumBlock::new);
    public static final RegistryObject<Block> Boron_Block = BLOCKS.register("boron_block", BoronBlock::new);
    public static final RegistryObject<Block> Arsenic_Block = BLOCKS.register("arsenic_block", ArsenicBlock::new);
    public static final RegistryObject<Block> Antimony_Block = BLOCKS.register("antimony_block", AntimonyBlock::new);
    public static final RegistryObject<Block> Tellurium_Block = BLOCKS.register("tellurium_block", TelluriumBlock::new);
    public static final RegistryObject<Block> Polonium_Block = BLOCKS.register("polonium_block", PoloniumBlock::new);

    // Block Items
    public static final RegistryObject<Item> Neon_Block_Item = ITEMS.register("neon_block", () -> new BlockItemBase(Neon_Block.get()));
    public static final RegistryObject<Item> Carbon_Block_Item = ITEMS.register("carbon_block", () -> new BlockItemBase(Carbon_Block.get()));
    public static final RegistryObject<Item> Hydrogen_Block_Item = ITEMS.register("hydrogen_block", () -> new BlockItemBase(Hydrogen_Block.get()));
    public static final RegistryObject<Item> Helium_Block_Item = ITEMS.register("helium_block", () -> new BlockItemBase(Helium_Block.get()));
    public static final RegistryObject<Item> Nitrogen_Block_Item = ITEMS.register("nitrogen_block", () -> new BlockItemBase(Nitrogen_Block.get()));
    public static final RegistryObject<Item> Oxygen_Block_Item = ITEMS.register("oxygen_block", () -> new BlockItemBase(Oxygen_Block.get()));
    public static final RegistryObject<Item> Fluorine_Block_Item = ITEMS.register("fluorine_block", () -> new BlockItemBase(Fluorine_Block.get()));
    public static final RegistryObject<Item> Phosphorus_Block_Item = ITEMS.register("phosphorus_block", () -> new BlockItemBase(Phosphorus_Block.get()));



    public static final RegistryObject<Item> Silicon_Block_Item = ITEMS.register("silicon_block", () -> new BlockItemBase2(Silicon_Block.get()));
    public static final RegistryObject<Item> Germanium_Block_Item = ITEMS.register("germanium_block", () -> new BlockItemBase2(Germanium_Block.get()));
    public static final RegistryObject<Item> Boron_Block_Item = ITEMS.register("boron_block", () -> new BlockItemBase2(Boron_Block.get()));
    public static final RegistryObject<Item> Arsenic_Block_Item = ITEMS.register("arsenic_block", () -> new BlockItemBase2(Arsenic_Block.get()));
    public static final RegistryObject<Item> Antimony_Block_Item = ITEMS.register("antimony_block", () -> new BlockItemBase2(Antimony_Block.get()));
    public static final RegistryObject<Item> Tellurium_Block_Item = ITEMS.register("tellurium_block", () -> new BlockItemBase2(Tellurium_Block.get()));
    public static final RegistryObject<Item> Polonium_Block_Item = ITEMS.register("polonium_block", () -> new BlockItemBase2(Polonium_Block.get()));
}
