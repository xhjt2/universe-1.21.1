package com.yaw.universe.item;

import com.yaw.universe.Universe;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    // 注册物品
    public static final Item ALUMINIUM_INGOT = registerItems("aluminum_ingot", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Universe.MOD_ID, id), item);
    }

    //添加物品组
    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ALUMINIUM_INGOT);
    }

    //在Loading界面注册物品和物品组，同时控制台加载显示注册信息
        public static void registerModItems(){
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
            Universe.LOGGER.info("Registering ModItems for " + Universe.MOD_ID);
    }
}
