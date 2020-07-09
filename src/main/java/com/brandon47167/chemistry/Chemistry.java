package com.brandon47167.chemistry;

import com.brandon47167.chemistry.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("chemistry")
@Mod.EventBusSubscriber(modid = Chemistry.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Chemistry
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "chemistry";
    public Chemistry() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);


        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("nonmetals"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(RegistryHandler.Neon_Block_Item.get());
        }
    };

}
