package org.ffpsss.oc3.item;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemUtils {
    public final static Map<String, Item> items = new HashMap<>();

    public static void registerItem(Item item, String id) {
        items.put(id, Registry.register(Registries.ITEM, new Identifier("opencomputers3", id), item));
    }
}
