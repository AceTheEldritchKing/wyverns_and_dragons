package net.acetheeldritchking.wyverns_and_dragons;

import com.mojang.logging.LogUtils;
import net.acetheeldritchking.wyverns_and_dragons.entity.DragonEntity;
import net.acetheeldritchking.wyverns_and_dragons.entity.DragonRenderer;
import net.acetheeldritchking.wyverns_and_dragons.entity.WADEntities;
import net.acetheeldritchking.wyverns_and_dragons.item.WADItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WyvernsAndDragons.MOD_ID)
public class WyvernsAndDragons
{
    public static final String MOD_ID = "wyverns_and_dragons";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WyvernsAndDragons()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        WADItems.register(modEventBus);
        WADEntities.ENTITIES.register(modEventBus);

        // Geckolib
        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        //I love commonSetup -Ben
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            //This does clientStuff, I normally call it clientStuff but this isnt my mod -Ben


            //!!!!!!!!!!!!!!!!!!!!!!!
            // THE GAME WILL CRASH IF YOU DO NOT DO THIS
            EntityRenderers.register(WADEntities.DRAGON.get(), DragonRenderer::new);

        }
    }
}
