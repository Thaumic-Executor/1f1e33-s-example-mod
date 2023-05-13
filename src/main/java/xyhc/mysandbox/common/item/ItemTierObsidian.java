package xyhc.mysandbox.common.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ItemTierObsidian implements Tier {

    OBSIDIAN(3,3000,9.0F,4.0F,12);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantmentVal;


    ItemTierObsidian(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantmentVal = enchantabilityIn;
    }

    @Override
    public int getUses(){
        return this.maxUses;
    }

    @Override
    public float getAttackDamageBonus(){
        return this.attackDamage;
    }

    @Override
    public float getSpeed(){
        return this.efficiency;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentVal;
    }

    @Override
    public Ingredient getRepairIngredient(){
        return Ingredient.of(Items.OBSIDIAN);
    }

}
