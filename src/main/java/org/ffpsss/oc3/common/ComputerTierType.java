package org.ffpsss.oc3.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputerTierType {
    public final static Map<String, ComputerTierType> COMPUTER_TIER_TYPES = new HashMap<>();

    public final List<ComputerSlotType> componentTypes;

    public ComputerTierType(List<ComputerSlotType> componentTypes) {
        this.componentTypes = componentTypes;
    }

    public static void registerOC3DefaultTiers() {
        registerTier("LOWEND", Arrays.asList(
            ComputerSlotType.SLOT_TYPES.get("le_card"),  ComputerSlotType.SLOT_TYPES.get("le_cpu"),  ComputerSlotType.SLOT_TYPES.get("le_drive"),
            ComputerSlotType.SLOT_TYPES.get("le_card"),  ComputerSlotType.SLOT_TYPES.get("le_ram"),  ComputerSlotType.SLOT_TYPES.get("none"),
            ComputerSlotType.SLOT_TYPES.get("none"),     ComputerSlotType.SLOT_TYPES.get("le_ram"),  ComputerSlotType.SLOT_TYPES.get("none")
        ));
        registerTier("MIDEND", Arrays.asList(
            ComputerSlotType.SLOT_TYPES.get("me_card"),  ComputerSlotType.SLOT_TYPES.get("me_cpu"),  ComputerSlotType.SLOT_TYPES.get("me_drive"),
            ComputerSlotType.SLOT_TYPES.get("le_card"),  ComputerSlotType.SLOT_TYPES.get("me_ram"),  ComputerSlotType.SLOT_TYPES.get("le_drive"),
            ComputerSlotType.SLOT_TYPES.get("none"),     ComputerSlotType.SLOT_TYPES.get("me_ram"),  ComputerSlotType.SLOT_TYPES.get("none")
        ));
        registerTier("HIGHEND", Arrays.asList(
            ComputerSlotType.SLOT_TYPES.get("he_card"),  ComputerSlotType.SLOT_TYPES.get("he_cpu"), ComputerSlotType.SLOT_TYPES.get("he_drive"),
            ComputerSlotType.SLOT_TYPES.get("me_card"),  ComputerSlotType.SLOT_TYPES.get("he_ram"), ComputerSlotType.SLOT_TYPES.get("me_drive"),
            ComputerSlotType.SLOT_TYPES.get("me_card"),  ComputerSlotType.SLOT_TYPES.get("he_ram"), ComputerSlotType.SLOT_TYPES.get("floppy")
        ));
        registerTier("CREATIVE", Arrays.asList(
            ComputerSlotType.SLOT_TYPES.get("he_card"),  ComputerSlotType.SLOT_TYPES.get("he_cpu"), ComputerSlotType.SLOT_TYPES.get("he_drive"),
            ComputerSlotType.SLOT_TYPES.get("he_card"),  ComputerSlotType.SLOT_TYPES.get("he_ram"), ComputerSlotType.SLOT_TYPES.get("he_drive"),
            ComputerSlotType.SLOT_TYPES.get("he_card"),  ComputerSlotType.SLOT_TYPES.get("he_ram"), ComputerSlotType.SLOT_TYPES.get("floppy")
        ));
    }
    public static void registerTier(String as, ComputerTierType slotType) {
        COMPUTER_TIER_TYPES.put(as, slotType); 
    }
    public static void registerTier(String as, List<ComputerSlotType> components) {
        registerTier(as, new ComputerTierType(components));
    }
}
