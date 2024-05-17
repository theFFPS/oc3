package org.ffpsss.oc3;

import net.fabricmc.api.ModInitializer;

import org.ffpsss.oc3.block.BlockUtils;
import org.ffpsss.oc3.block.computercase.*;
import org.ffpsss.oc3.common.BlockSettings;
import org.ffpsss.oc3.common.ComputerSlotType;
import org.ffpsss.oc3.common.ComputerTierType;
import org.ffpsss.oc3.common.ItemSettings;
import org.ffpsss.oc3.item.ItemUtils;
import org.ffpsss.oc3.item.upgrade.battery.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenComputers3 implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("opencomputers3");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ComputerSlotType.registerOC3DefaultSlots();
		ComputerTierType.registerOC3DefaultTiers();

		BlockUtils.registerBlock(new ServerRack(BlockSettings.COMPUTER_BLOCK_SETTINGS), "serverrack");
		BlockUtils.registerBlock(new LowEndComputer(BlockSettings.COMPUTER_BLOCK_SETTINGS), "le_computer");
		BlockUtils.registerBlock(new MidEndComputer(BlockSettings.COMPUTER_BLOCK_SETTINGS), "me_computer");
		BlockUtils.registerBlock(new HighEndComputer(BlockSettings.COMPUTER_BLOCK_SETTINGS), "he_computer");
		BlockUtils.registerBlock(new CreativeComputer(BlockSettings.COMPUTER_BLOCK_SETTINGS), "creative_computer");

		ItemUtils.registerItem(new BatteryUpgradeTier1(ItemSettings.UPGRADE_SETTINGS), "batteryupgrade1");
		ItemUtils.registerItem(new BatteryUpgradeTier2(ItemSettings.UPGRADE_SETTINGS), "batteryupgrade2");
		ItemUtils.registerItem(new BatteryUpgradeTier3(ItemSettings.UPGRADE_SETTINGS), "batteryupgrade3");
	}
}