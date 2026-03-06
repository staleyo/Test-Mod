package net.leon.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leon.testmod.TestMod;
import net.leon.testmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEST_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "test_mod"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TIN_INGOT))
                    .displayName(Text.translatable("itemgroup.testmod.test_mod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.RAW_LITHIUM);
                        entries.add(ModItems.RAW_NICKEL);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.LITHIUM_INGOT);
                        entries.add(ModItems.NICKEL_INGOT);
                    }).build());

    public static final ItemGroup TEST_MOD_ORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "test_mod_ores"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TIN_ORE))
                    .displayName(Text.translatable("itemgroup.testmod.test_mod_ores"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPLSATE_TIN_ORE);

                    }).build());




    public static void registerItemGroups() {

        TestMod.LOGGER.info("Registering item groups for " + TestMod.MOD_ID);
    }
}
