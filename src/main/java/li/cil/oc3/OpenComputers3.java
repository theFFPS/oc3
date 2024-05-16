package li.cil.oc3;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import li.cil.oc3.block.BlockUtils;
import li.cil.oc3.block.computercase.*;

public class OpenComputers3 implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("opencomputers3");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		BlockUtils.registerBlock(new LowEndComputer(Block.Settings.create().hardness(1f).requiresTool()), "lecomputer");
		BlockUtils.registerBlock(new MidEndComputer(Block.Settings.create().hardness(1f).requiresTool()), "mecomputer");
		BlockUtils.registerBlock(new HighEndComputer(Block.Settings.create().hardness(1f).requiresTool()), "hecomputer");
		BlockUtils.registerBlock(new CreativeComputer(Block.Settings.create().hardness(1f).requiresTool()), "ccomputer");
		BlockUtils.registerBlock(new ServerRack(Block.Settings.create().hardness(1f).requiresTool()), "serverrack");
	}
}