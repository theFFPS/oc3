package org.ffpsss.oc3.block.computercase;

import org.ffpsss.oc3.common.ComputerTierType;

import net.minecraft.block.Block;

public class HighEndComputer extends Block {
    public static final ComputerTierType computerTier = ComputerTierType.COMPUTER_TIER_TYPES.get("HIGHEND");

    public HighEndComputer(Settings settings) { 
        super(settings); 
    }
}