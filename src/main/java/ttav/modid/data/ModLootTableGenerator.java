package ttav.modid.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import ttav.modid.block.ModBlocks;
import ttav.modid.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput){
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLOCK_OF_REFINED_AESIR);
        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.GOLDEN_MARBLE, drops(ModBlocks.GOLDEN_MARBLE, ModBlocks.MARBLE));
        addDrop(ModBlocks.CONCENTRATED_AESIR, drops(ModBlocks.CONCENTRATED_AESIR, ModItems.CHUNK_OF_RAW_AESIR));

    }
}
