package ttav.modid.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import ttav.modid.block.ModBlocks;
import ttav.modid.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }
    public static void offerAesirUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item input, RecipeCategory category, Item result) {
        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(input), Ingredient.ofItems(ModItems.REFINED_AESIR_INGOT), category, result).criterion("has_refined_aesir_ingot", RecipeProvider.conditionsFromItem(ModItems.REFINED_AESIR_INGOT)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing");
    }
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerReversibleCompactingRecipesWithReverseRecipeGroup(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.REFINED_AESIR_INGOT,
                RecipeCategory.MISC, ModBlocks.BLOCK_OF_REFINED_AESIR, "refined_aesir_ingot_from_block_of_refined_aesir", "refined_aesir_ingot");



        offerBlasting(exporter, List.of(ModItems.CHUNK_OF_RAW_AESIR), RecipeCategory.MISC, ModItems.REFINED_AESIR,
                3f,300, "aesir");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REFINED_AESIR_INGOT)
                .pattern("RRR")
                .pattern("RIR")
                .pattern("RRR")
                .input('R', ModItems.REFINED_AESIR)
                .input('I', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.REFINED_AESIR),
                        FabricRecipeProvider.conditionsFromItem(ModItems.REFINED_AESIR))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.REFINED_AESIR_INGOT)));

        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_HELMET);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_CHESTPLATE);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_LEGGINGS);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_BOOTS);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_PICKAXE, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_PICKAXE);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_AXE, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_AXE);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_SWORD, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_SWORD);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_SHOVEL, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_SHOVEL);
        offerAesirUpgradeRecipe(exporter, Items.NETHERITE_HOE, RecipeCategory.COMBAT, ModItems.REFINED_AESIR_HOE);


    }
}
