package org.ffpsss.oc3.common;

import java.util.HashMap;
import java.util.Map;

public class ComputerSlotType {
    public final static Map<String, ComputerSlotType> SLOT_TYPES = new HashMap<>();

    public final String acceptItem;
    public final int tierMax;

    public ComputerSlotType(String acceptItem, int tierMax) {
        this.acceptItem = acceptItem;
        this.tierMax = tierMax;
    }

    public static void registerOC3DefaultSlots() {
        registerSlot("le_cpu", "cpu", 1);
        registerSlot("me_cpu", "cpu", 2);
        registerSlot("he_cpu", "cpu", 3);
        registerSlot("le_card", "card", 1);
        registerSlot("me_card", "card", 2);
        registerSlot("he_card", "card", 3);
        registerSlot("le_drive", "drive", 1);
        registerSlot("me_drive", "drive", 2);
        registerSlot("he_drive", "drive", 3);
        registerSlot("le_ram", "ram", 1);
        registerSlot("me_ram", "ram", 2);
        registerSlot("he_ram", "ram", 3);
        registerSlot("le_copm_bus", "comp_bus", 1);
        registerSlot("me_comp_bus", "comp_bus", 2);
        registerSlot("he_comp_bus", "comp_bus", 3);
        registerSlot("floppy", "floppy", 1);
        registerSlot("none", "none", 0);
    }
    public static void registerSlot(String as, ComputerSlotType slotType) {
        SLOT_TYPES.put(as, slotType); 
    }
    public static void registerSlot(String as, String acceptItem, int tierMax) {
        registerSlot(as, new ComputerSlotType(acceptItem, tierMax));
    }
}
