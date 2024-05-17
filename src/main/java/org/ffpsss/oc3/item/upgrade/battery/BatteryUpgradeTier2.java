package org.ffpsss.oc3.item.upgrade.battery;

import org.ffpsss.oc3.common.UpgradeType;

import net.minecraft.item.Item;

public class BatteryUpgradeTier2 extends Item {
    public static final UpgradeType upgradeType = UpgradeType.UPGRADE_TYPES.get("battery_2");

    public BatteryUpgradeTier2(Settings settings) {
        super(settings);
    }
}
