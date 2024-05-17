package org.ffpsss.oc3.block;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockUtils {
    public final static Map<String, Block> blocks = new HashMap<>();
    public final static Map<String, BlockItem> blockItems = new HashMap<>();

    public static void registerBlock(Block block, String id) {
        blockItems.put(id, Registry.register(Registries.ITEM, new Identifier("opencomputers3", id), new BlockItem(block, new Item.Settings())));
        blocks.put(id, Registry.register(Registries.BLOCK, new Identifier("opencomputers3", id), block));
    }
}
