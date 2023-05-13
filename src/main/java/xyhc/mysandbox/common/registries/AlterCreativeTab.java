package xyhc.mysandbox.common.registries;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AlterCreativeTab {
    public static final CreativeModeTab SANDBOX_TAB = new CreativeModeTab("tab_sandbox") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.ITEM_FRAME);
        }
    };
}
