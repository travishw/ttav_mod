package ttav.modid.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import ttav.modid.block.ModBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput){
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLOCK_OF_REFINED_AESIR);
    }
}
