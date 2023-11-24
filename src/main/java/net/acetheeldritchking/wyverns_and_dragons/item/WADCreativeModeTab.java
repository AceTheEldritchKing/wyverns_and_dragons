package net.acetheeldritchking.wyverns_and_dragons.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WADCreativeModeTab {
    public static final CreativeModeTab WAD_TAB = new CreativeModeTab("wyverns_and_dragons_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(WADItems.GREEN_WYVERN_SCALE.get());
        }
    };

}
