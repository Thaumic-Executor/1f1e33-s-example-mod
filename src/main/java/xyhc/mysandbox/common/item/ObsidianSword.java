package xyhc.mysandbox.common.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import xyhc.mysandbox.Mysandbox;
import xyhc.mysandbox.common.registries.AlterCreativeTab;

public class ObsidianSword extends SwordItem {
    static String ObsidianSwordId="obsidian_sword";
    public ObsidianSword(){
        super(ItemTierObsidian.OBSIDIAN,
                -2,0.5F,new Item.Properties().fireResistant().tab(AlterCreativeTab.SANDBOX_TAB));
    }
    @SubscribeEvent
    public static void onRegisterItem( RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new ObsidianSword().setRegistryName(Mysandbox.MOD_ID,ObsidianSwordId));
    }
}
