package ttav.modid.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.client.*;
import ttav.modid.block.ModBlocks;
import ttav.modid.item.ModItems;




public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_REFINED_AESIR);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        blockStateModelGenerator.registerSingleton(ModBlocks.GOLDEN_MARBLE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.CONCENTRATED_AESIR, TexturedModel.CUBE_COLUMN);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.REFINED_AESIR_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHUNK_OF_RAW_AESIR, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AESIR_HOE, Models.GENERATED);

    }


}
