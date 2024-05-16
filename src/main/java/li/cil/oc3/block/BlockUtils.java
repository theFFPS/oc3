package li.cil.oc3.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockUtils {
    public static void registerBlock(Block block, String id) {
        Registry.register(Registries.BLOCK, new Identifier("opencomputers3", id), block);
        Registry.register(Registries.ITEM, new Identifier("opencomputers3", id), new BlockItem(block, new Item.Settings()));
    }
}
