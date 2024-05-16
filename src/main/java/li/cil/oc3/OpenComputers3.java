package li.cil.oc3;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import li.cil.oc3.block.BlockUtils;
import li.cil.oc3.block.computercase.*;

public class OpenComputers3 implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("opencomputers3");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		BlockUtils.registerBlock(new LowEndComputer(FabricBlockSettings.of(Material.METAL)), new Identifier("opencomputers3", "lecomputer"));
		BlockUtils.registerBlock(new MidEndComputer(FabricBlockSettings.of(Material.METAL)), new Identifier("opencomputers3", "lecomputer"));
		BlockUtils.registerBlock(new HighEndComputer(FabricBlockSettings.of(Material.METAL)), new Identifier("opencomputers3", "lecomputer"));
		BlockUtils.registerBlock(new CreativeComputer(FabricBlockSettings.of(Material.METAL)), new Identifier("opencomputers3", "lecomputer"));
	}
}