package xyhc.mysandbox.common.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import xyhc.mysandbox.common.registries.SandboxTab;

import java.util.Random;

public class ShouterItem extends Item {
    Random myRand = new Random();

    public ShouterItem(){
        super(new Item.Properties().fireResistant().durability(114).tab(SandboxTab.SANDBOX_TAB));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        pLevel.playSound(null, pPlayer.getOnPos(), SoundEvents.GHAST_SCREAM, SoundSource.NEUTRAL,0.7F,0.4F / (myRand.nextFloat() * 0.4F + 0.8F));
        ItemStack thisItem=pPlayer.getItemInHand(pUsedHand);
        damageItem(thisItem,1, pPlayer, null);
        return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
    }

}