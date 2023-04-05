package ttav.modid.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.NyliumBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ttav.modid.item.ModItemGroup;
import ttav.modid.ttavMod;

public class ModBlocks {
    public static final Block BLOCK_OF_REFINED_AESIR = registerBlock("block_of_refined_aesir",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.AESIR);
    public static final Block GOLDEN_MARBLE = registerBlock("golden_marble",
            new NyliumBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM).strength(4.0f).requiresTool()),ModItemGroup.AESIR);
    public static final Block MARBLE = registerBlock("marble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.AESIR);
    public static final Block CONCENTRATED_AESIR = registerBlock("concentrated_aesir",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.AESIR);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ttavMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(ttavMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks() {
        ttavMod.LOGGER.info("Registering ModBlocks for " + ttavMod.MOD_ID);
    }
}
