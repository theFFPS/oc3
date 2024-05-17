package org.ffpsss.oc3.common;

import java.util.HashMap;
import java.util.Map;

public class UpgradeType {
    public final static Map<String, UpgradeType> UPGRADE_TYPES = new HashMap<>();

    public final String acceptItem;
    public final int tierMax;

    public UpgradeType(String acceptItem, int tierMax) {
        this.acceptItem = acceptItem;
        this.tierMax = tierMax;
    }

    public static void registerOC3DefaultSlots() {
        registerSlot("battery_1", "battery", 1);
        registerSlot("battery_2", "battery", 1);
        registerSlot("battery_3", "battery", 1);

        registerSlot("none", "none", 0);
    }
    public static void registerSlot(String as, UpgradeType slotType) {
        UPGRADE_TYPES.put(as, slotType); 
    }
    public static void registerSlot(String as, String acceptItem, int tierMax) {
        registerSlot(as, new UpgradeType(acceptItem, tierMax));
    }
}
