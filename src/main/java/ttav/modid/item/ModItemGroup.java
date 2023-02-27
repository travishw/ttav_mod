package ttav.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ttav.modid.ttavMod;

public class ModItemGroup {

    public static ItemGroup AESIR;

    public static void registerItemGroups(){
        AESIR = FabricItemGroup.builder(new Identifier(ttavMod.MOD_ID, "aesir"))
                .displayName(Text.literal("The Aesir"))
                .icon(() -> new ItemStack(ModItems.REFINED_AESIR)).build();
    }
}
