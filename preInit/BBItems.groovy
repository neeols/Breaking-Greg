import net.minecraft.item.EnumRarity
import net.minecraft.item.ItemStack
import net.minecraft.init.MobEffects
import net.minecraft.potion.PotionEffect
import net.minecraft.potion.Potion
import net.minecraft.item.Item
import static Util.createItem

// items

createItem("emptysyringe")
createItem("methsyringe")
createItem("plunger")
createItem("needle")

// drugs

String [] drugs = [
    "crystalmeth"
]

Potion [] potions = [
    MobEffects.STRENGTH,
    MobEffects.NAUSEA,
    MobEffects.SPEED,
    MobEffects.HASTE
]

for (String drugName : drugs) {

    Item drug = new ItemDrug(0, 0, content.getDefaultTab()).setRarity(EnumRarity.EPIC)

    for (Potion potion : potions) {
        drug.addPotionEffect(potion, 1200, 5)
    }

    content.registerItem(drugName, drug)
}
