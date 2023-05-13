package xyhc.mysandbox.common.registries;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyhc.mysandbox.Mysandbox;
import xyhc.mysandbox.common.item.DiamondApple;
import xyhc.mysandbox.common.item.ObsidianSword;
import xyhc.mysandbox.common.item.ShouterItem;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,Mysandbox.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mysandbox.MOD_ID);
    public static final RegistryObject<Item> SALT_ITEM =
            ITEMS.register("salt_item", ()->new Item( new Item.Properties().tab(SandboxTab.SANDBOX_TAB) ) );
    public static final RegistryObject<Item> SHOUTER_ITEM =
            ITEMS.register("shouter_item", ()->new ShouterItem());
    public static final RegistryObject<Item> OBSIDIAN_SWORD =
            ITEMS.register("obsidian_sword",()->new ObsidianSword());
    public static final RegistryObject<Item> DIAMOND_APPLE =
            ITEMS.register("diamond_apple",()->new DiamondApple());
    public static final RegistryObject<Block> SALT_BLOCK =
            BLOCKS.register("salt_block.json",()->new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2F)));
    public static final RegistryObject<BlockItem> SALT_BLOCK_ITEM =
            ITEMS.register("salt_block_item",()->new BlockItem(SALT_BLOCK.get(),new Item.Properties().tab(SandboxTab.SANDBOX_TAB)));
}
