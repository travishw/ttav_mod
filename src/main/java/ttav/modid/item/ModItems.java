package ttav.modid.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ttav.modid.ttavMod;

public class ModItems {

    public static final Item REFINED_AESIR_INGOT = registerItem("refined_aesir_ingot",
            new Item(new FabricItemSettings()));
    public static final Item REFINED_AESIR= registerItem("refined_aesir",
            new Item(new FabricItemSettings()));
    public static final Item CHUNK_OF_RAW_AESIR= registerItem("chunk_of_raw_aesir",
            new Item(new FabricItemSettings()));

    public static final Item REFINED_AESIR_HELMET= registerItem("refined_aesir_helmet",
            new ArmorItem(ModArmorMaterials.AESIR, EquipmentSlot.HEAD, new FabricItemSettings()));
    public static final Item REFINED_AESIR_CHESTPLATE= registerItem("refined_aesir_chestplate",
            new ArmorItem(ModArmorMaterials.AESIR, EquipmentSlot.CHEST, new FabricItemSettings()));
    public static final Item REFINED_AESIR_LEGGINGS= registerItem("refined_aesir_leggings",
            new ArmorItem(ModArmorMaterials.AESIR, EquipmentSlot.LEGS, new FabricItemSettings()));
    public static final Item REFINED_AESIR_BOOTS= registerItem("refined_aesir_boots",
            new ArmorItem(ModArmorMaterials.AESIR, EquipmentSlot.FEET, new FabricItemSettings()));
    public static final Item REFINED_AESIR_PICKAXE= registerItem("refined_aesir_pickaxe",
            new PickaxeItem(ModToolMaterials.AESIR, 6, 0.8f, new FabricItemSettings()));
    public static final Item REFINED_AESIR_SWORD= registerItem("refined_aesir_sword",
            new SwordItem(ModToolMaterials.AESIR, 9, 1.8f, new FabricItemSettings()));
    public static final Item REFINED_AESIR_SHOVEL= registerItem("refined_aesir_shovel",
            new ShovelItem(ModToolMaterials.AESIR, 6, 0.8f, new FabricItemSettings()));
    public static final Item REFINED_AESIR_AXE= registerItem("refined_aesir_axe",
            new AxeItem(ModToolMaterials.AESIR, 11, 1.1f, new FabricItemSettings()));
    public static final Item REFINED_AESIR_HOE= registerItem("refined_aesir_hoe",
            new HoeItem(ModToolMaterials.AESIR, 4, 1.1f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ttavMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, REFINED_AESIR_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, REFINED_AESIR);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_INGOT);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR);
        addToItemGroup(ItemGroups.INGREDIENTS, CHUNK_OF_RAW_AESIR);
        addToItemGroup(ModItemGroup.AESIR, CHUNK_OF_RAW_AESIR);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_HELMET);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_HELMET);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_CHESTPLATE);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_CHESTPLATE);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_LEGGINGS);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_LEGGINGS);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_BOOTS);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_BOOTS);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_PICKAXE);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_PICKAXE);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_SWORD);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_SWORD);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_SHOVEL);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_SHOVEL);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_AXE);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_AXE);
        addToItemGroup(ItemGroups.COMBAT, REFINED_AESIR_HOE);
        addToItemGroup(ModItemGroup.AESIR, REFINED_AESIR_HOE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        ttavMod.LOGGER.info("Registering Mod Items for " + ttavMod.MOD_ID);

        addItemsToItemGroup();
    }
}
