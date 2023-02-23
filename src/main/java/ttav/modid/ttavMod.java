package ttav.modid;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ttav.modid.item.ModItems;

public class ttavMod implements ModInitializer {
	public static final String MOD_ID = "ttavmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("ttavmod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}