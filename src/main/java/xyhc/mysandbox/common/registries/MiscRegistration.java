package xyhc.mysandbox.common.registries;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyhc.mysandbox.Mysandbox;

public class MiscRegistration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mysandbox.MOD_ID);
    public static final RegistryObject<Item> SALT_ITEM =
            ITEMS.register("salt_item", ()->new Item( new Item.Properties().tab(SandboxTab.SANDBOX_TAB) ) );

}
