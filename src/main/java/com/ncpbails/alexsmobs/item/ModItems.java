package com.ncpbails.alexsmobs.item;

import com.github.alexthe666.alexsmobs.AlexsMobs;
import com.ncpbails.alexsmobs.AlexsDelight;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlexsDelight.MOD_ID);

    //CUTS
    public static final RegistryObject<Item> KANGAROO_SHANK = ITEMS.register("kangaroo_shank",
            () -> new Item(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.KANGAROO_SHANK)));

    public static final RegistryObject<Item> COOKED_KANGAROO_SHANK = ITEMS.register("cooked_kangaroo_shank",
            () -> new Item(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.COOKED_KANGAROO_SHANK)));

    public static final RegistryObject<Item> LOOSE_MOOSE_RIB = ITEMS.register("loose_moose_rib",
            () -> new Item(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.LOOSE_MOOSE_RIB)));

    public static final RegistryObject<Item> COOKED_LOOSE_MOOSE_RIB = ITEMS.register("cooked_loose_moose_rib",
            () -> new Item(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.COOKED_LOOSE_MOOSE_RIB)));

    //MEALS
    public static final RegistryObject<Item> GONGYLIDIA_BRUSCHETTA = ITEMS.register("gongylidia_bruschetta",
            () -> new Item(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.GONGYLIDIA_BRUSCHETTA)));

    public static final RegistryObject<Item> MAGGOT_SALAD = ITEMS.register("maggot_salad",
            () -> new BowlFoodItem(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.MAGGOT_SALAD)));

    public static final RegistryObject<Item> KANGAROO_STEW = ITEMS.register("kangaroo_stew",
            () -> new BowlFoodItem(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.KANGAROO_STEW)));

    public static final RegistryObject<Item> ACACIA_BLOSSOM_SOUP = ITEMS.register("acacia_blossom_soup",
            () -> new BowlFoodItem(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.ACACIA_BLOSSOM_SOUP)));

    public static final RegistryObject<Item> LOBSTER_LINGUINI = ITEMS.register("lobster_linguini",
            () -> new BowlFoodItem(new Item.Properties().tab(AlexsMobs.TAB).food(ModFoods.LOBSTER_LINGUINI)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
