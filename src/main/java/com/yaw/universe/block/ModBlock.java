package com.yaw.universe.block;

import com.yaw.universe.Universe;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    // 注册方块(可在下列添加更多方块)
    public static final Block ALUMINIUM_BLOCK = register("aluminium_block", new Block(AbstractBlock.Settings.create().strength(4.5f, 6.0f)));
    public static final Block ALUMINIUM_ORE = register("aluminium_ore", new Block(AbstractBlock.Settings.create().strength(3.0f, 3.0f)));
    public static final Block TITANIUM_BLOCK = register("titanium_block", new Block(AbstractBlock.Settings.create().strength(4.5f, 6.0f)));
    public static final Block TITANIUM_ORE = register("titanium_ore", new Block(AbstractBlock.Settings.create().strength(3.0f, 3.0f)));

    // 注册方块物品(以物品形式呈现的方块)
    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(Universe.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Universe.MOD_ID, id), block);
    }

    // 在Loading界面注册方块，同时控制台加载显示注册信息
    public static void registerModBlocks() {
        Universe.LOGGER.info("Registering ModBlocks for " + Universe.MOD_ID);
    }
}
