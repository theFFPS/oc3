package org.ffpsss.oc3.block.computercase;

import org.ffpsss.oc3.common.ComputerTierType;

import net.minecraft.block.Block;

public class CreativeComputer extends Block {
    public static final ComputerTierType computerTier = ComputerTierType.COMPUTER_TIER_TYPES.get("CREATIVE");

    public CreativeComputer(Settings settings) {
        super(settings);
    }
}