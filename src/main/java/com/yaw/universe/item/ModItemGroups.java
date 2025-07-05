package com.yaw.universe.item;

import com.yaw.universe.Universe;
import com.yaw.universe.block.ModBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 注册物品组
    public static final ItemGroup UNIVERSE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Universe.MOD_ID, "universe_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.universe_group"))
                    .icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT))
                    .entries((displayContext, entries) -> {
                        // 可以在这里添加更多物品
                        entries.add(ModBlock.ALUMINUM_ORE);
                        entries.add(ModBlock.ALUMINUM_BLOCK);
                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModBlock.TITANIUM_ORE);
                        entries.add(ModBlock.TITANIUM_BLOCK);

                    }).build());

    public static void registerModItemGroups() {
        // 在Loading界面注册物品组，同时控制台加载显示注册信息
        Universe.LOGGER.info("Registering ModItemGroups for " + Universe.MOD_ID);
    }
}
