package xyhc.mysandbox.common.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import xyhc.mysandbox.common.registries.SandboxTab;

public class DiamondApple extends Item {
    private static final FoodProperties foodProp= (new FoodProperties.Builder())
            .saturationMod(7.2F).nutrition(10)
            .effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE ,5*60*20,4),1)
            .effect(()->new MobEffectInstance(MobEffects.FIRE_RESISTANCE,15*60*20,4),1)
            .alwaysEat().build();
    public DiamondApple(){
        super(new Item.Properties().food(foodProp).rarity(Rarity.EPIC).tab(SandboxTab.SANDBOX_TAB));
    }
}
