package li.cil.oc;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenComputers3 implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("opencomputers3");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}