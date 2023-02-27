package ttav.modid.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ttav.modid.ttavMod;

public class ModItems {
    public static final Item REFINED_AESIR_INGOT = registerItem("refined_aesir_ingot",
            new Item(new FabricItemSettings()));
    public static final Item REFINED_AESIR= registerItem("refined_aesir",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ttavMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, REFINED_AESIR_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, REFINED_AESIR);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_INGOT);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        ttavMod.LOGGER.info("Registering Mod Items for " + ttavMod.MOD_ID);

        addItemsToItemGroup();
    }
}
