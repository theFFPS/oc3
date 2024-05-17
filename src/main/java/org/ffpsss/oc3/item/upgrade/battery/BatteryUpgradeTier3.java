package org.ffpsss.oc3.item.upgrade.battery;

import org.ffpsss.oc3.common.UpgradeType;

import net.minecraft.item.Item;

public class BatteryUpgradeTier3 extends Item {
    public static final UpgradeType upgradeType = UpgradeType.UPGRADE_TYPES.get("battery_3");

    public BatteryUpgradeTier3(Settings settings) {
        super(settings);
    }
}
