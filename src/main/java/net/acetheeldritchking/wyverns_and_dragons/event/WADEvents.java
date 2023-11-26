package net.acetheeldritchking.wyverns_and_dragons.event;

import net.acetheeldritchking.wyverns_and_dragons.WyvernsAndDragons;
import net.acetheeldritchking.wyverns_and_dragons.entity.WADEntities;
import net.acetheeldritchking.wyverns_and_dragons.entity.dragon.DragonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class WADEvents {
    @Mod.EventBusSubscriber(modid = WyvernsAndDragons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class WADEventBusEvents
    {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event)
        {
            event.put(WADEntities.DRAGON.get(), DragonEntity.setAttributes());
        }
    }
}
