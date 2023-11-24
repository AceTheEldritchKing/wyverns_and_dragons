package net.acetheeldritchking.wyverns_and_dragons.item;

import net.acetheeldritchking.wyverns_and_dragons.WyvernsAndDragons;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WADItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WyvernsAndDragons.MOD_ID);

    public static final RegistryObject<Item> GREEN_WYVERN_SCALE = ITEMS.register("green_wyvern_scale",
            () -> new Item(new Item.Properties().tab(WADCreativeModeTab.WAD_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
