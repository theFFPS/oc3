package org.ffpsss.oc3.item.upgrade.battery;

import org.ffpsss.oc3.common.UpgradeType;

import net.minecraft.item.Item;

public class BatteryUpgradeTier1 extends Item {
    public static final UpgradeType upgradeType = UpgradeType.UPGRADE_TYPES.get("battery_1");

    public BatteryUpgradeTier1(Settings settings) {
        super(settings);
    }
}
