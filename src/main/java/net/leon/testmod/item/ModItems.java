package net.leon.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leon.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new Item.Settings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new Item.Settings()));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_LITHIUM = registerItem("raw_lithium", new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering mod items for " + TestMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(BRONZE_INGOT);

            fabricItemGroupEntries.add(TIN_INGOT);
            fabricItemGroupEntries.add(RAW_TIN);
            fabricItemGroupEntries.add(NICKEL_INGOT);
            fabricItemGroupEntries.add(RAW_NICKEL);
            fabricItemGroupEntries.add(LITHIUM_INGOT);
            fabricItemGroupEntries.add(RAW_LITHIUM);
            fabricItemGroupEntries.add(LEAD_INGOT);
            fabricItemGroupEntries.add(RAW_LEAD);
            fabricItemGroupEntries.add(TUNGSTEN_INGOT);
            fabricItemGroupEntries.add(RAW_TUNGSTEN);
        });
    }
}
