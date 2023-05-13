package xyhc.mysandbox.common.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import xyhc.mysandbox.common.registries.SandboxTab;

public class ObsidianSword extends SwordItem {
    public ObsidianSword(){
        super(ItemTierObsidian.OBSIDIAN,
                5,-1.0F,new Item.Properties().fireResistant().tab(SandboxTab.SANDBOX_TAB));
    }
}
