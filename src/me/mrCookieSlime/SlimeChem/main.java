package me.mrCookieSlime.SlimeChem;

import java.util.HashMap;
import java.util.Map;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.MenuItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.StringUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	Map<ItemStack, Combination> combinations = new HashMap<ItemStack, Combination>();
	
	@Override
	public void onEnable() {
		
		RecipeType decomposer = new RecipeType(new CustomItem(Material.IRON_BLOCK, "&7Chemical Decomposer", 0));
		RecipeType synthesizer = new RecipeType(new CustomItem(Material.IRON_BLOCK, "&7Chemical Synthesizer", 0));
		
		Category elements = new Category(new MenuItem(Material.GLASS_BOTTLE, "&7Elements", 0, "open"));
		for (PeriodicTable element: PeriodicTable.values()) {
			new SlimefunItem(elements, new CustomItem(Material.GLASS_BOTTLE, "&r" + StringUtils.format(element.toString()), 0, new String[] {"&9" + element.getName()}), "ELEMENT_" + element.toString(), decomposer, new ItemStack[0])
			.register();
		}
		Category molecules = new Category(new MenuItem(Material.GLASS_BOTTLE, "&7Molecules", 0, "open"));
		for (Molecules molecule: Molecules.values()) {
			new SlimefunItem(molecules, new CustomItem(Material.GLASS_BOTTLE, "&r" + StringUtils.format(molecule.toString()), 0, new String[] {"&9" + molecule.getName()}), "MOLECULE_" + molecule.toString(), synthesizer, new ItemStack[0])
			.register();
		}
		
		addCombination(new ItemStack(Material.STONE), new Ingredient(PeriodicTable.IRON), new Ingredient(PeriodicTable.OXYGEN));
		addCombination(new ItemStack(Material.GRASS), new Ingredient(Molecules.CELLULOSE));
		addCombination(new ItemStack(Material.DIRT), new Ingredient(PeriodicTable.ZINC), new Ingredient(PeriodicTable.OXYGEN));
		addCombination(new ItemStack(Material.COBBLESTONE), new Ingredient(PeriodicTable.LEAD), new Ingredient(PeriodicTable.OXYGEN));
		addCombination(new ItemStack(Material.WOOD), new Ingredient(Molecules.CELLULOSE, 2));
		addCombination(new ItemStack(Material.SAPLING), new Ingredient(Molecules.CELLULOSE));
		addCombination(new ItemStack(Material.SAND), new Ingredient(Molecules.SILICON_DIOXIDE, 16));
		addCombination(new ItemStack(Material.GRAVEL), new Ingredient(Molecules.SILICON_DIOXIDE));
		addCombination(new ItemStack(Material.GOLD_ORE), new Ingredient(PeriodicTable.GOLD, 48));
		addCombination(new ItemStack(Material.IRON_ORE), new Ingredient(PeriodicTable.IRON, 48));
		addCombination(new ItemStack(Material.COAL_ORE), new Ingredient(PeriodicTable.CARBON, 48));
		addCombination(new ItemStack(Material.LOG), new Ingredient(Molecules.CELLULOSE, 8));
		addCombination(new ItemStack(Material.LOG_2), new Ingredient(Molecules.CELLULOSE, 8));
		addCombination(new ItemStack(Material.LEAVES), new Ingredient(Molecules.CELLULOSE, 4));
		addCombination(new ItemStack(Material.LEAVES_2), new Ingredient(Molecules.CELLULOSE, 4));
		addCombination(new ItemStack(Material.GLASS), new Ingredient(Molecules.SILICON_DIOXIDE, 16));
		addCombination(new ItemStack(Material.LAPIS_ORE), new Ingredient(Molecules.LAZURITE, 6), new Ingredient(Molecules.SODALITE), new Ingredient(Molecules.NOSELITE), new Ingredient(Molecules.PYRITE), new Ingredient(Molecules.CALCIUM_CARBONATE));
		addCombination(new ItemStack(Material.LAPIS_BLOCK), new Ingredient(Molecules.LAZURITE, 9));
		addCombination(new ItemStack(Material.DISPENSER), new Ingredient(Molecules.IRON_OXIDE), new Ingredient(PeriodicTable.COPPER), new Ingredient(PeriodicTable.SILICON, 7), new Ingredient(PeriodicTable.OXYGEN, 7), new Ingredient(Molecules.CELLULOSE, 3), new Ingredient(Molecules.SERINE, 3), new Ingredient(Molecules.GLYCINE, 3), new Ingredient(Molecules.ALANINE, 3));
		addCombination(new ItemStack(Material.SANDSTONE), new Ingredient(Molecules.SILICON_DIOXIDE, 16));
		addCombination(new ItemStack(Material.NOTE_BLOCK), new Ingredient(Molecules.IRON_OXIDE), new Ingredient(PeriodicTable.COPPER), new Ingredient(Molecules.CELLULOSE, 16));
		addCombination(new ItemStack(Material.POWERED_RAIL), new Ingredient(Molecules.IRON_OXIDE), new Ingredient(PeriodicTable.COPPER), new Ingredient(Molecules.CELLULOSE), new Ingredient(PeriodicTable.GOLD, 16));
		addCombination(new ItemStack(Material.DETECTOR_RAIL), new Ingredient(PeriodicTable.IRON, 16), new Ingredient(Molecules.IRON_OXIDE), new Ingredient(PeriodicTable.COPPER), new Ingredient(PeriodicTable.SILICON, 2), new Ingredient(PeriodicTable.OXYGEN, 2));
		addCombination(new ItemStack(Material.PISTON_STICKY_BASE), new Ingredient(PeriodicTable.IRON, 16), new Ingredient(Molecules.IRON_OXIDE), new Ingredient(PeriodicTable.COPPER), new Ingredient(PeriodicTable.SILICON, 4), new Ingredient(PeriodicTable.OXYGEN, 4), new Ingredient(Molecules.CELLULOSE, 6));
		addCombination(new ItemStack(Material.WEB), new Ingredient(Molecules.FIBROIN));
		addCombination(new ItemStack(Material.WOOL), new Ingredient(Molecules.GLYCINE, 2));
		addCombination(new ItemStack(Material.RED_ROSE), new Ingredient(Molecules.SHIKIMIC_ACID, 2), new Ingredient(Molecules.COBALT_NITRATE));
		addCombination(new ItemStack(Material.YELLOW_FLOWER), new Ingredient(Molecules.SHIKIMIC_ACID, 2), new Ingredient(Molecules.COBALT_NITRATE));
		addCombination(new ItemStack(Material.BROWN_MUSHROOM), new Ingredient(Molecules.WATER, 2), new Ingredient(Molecules.PANTHERINE));
		addCombination(new ItemStack(Material.RED_MUSHROOM), new Ingredient(Molecules.WATER, 2), new Ingredient(Molecules.PANTHERINE));
		addCombination(new ItemStack(Material.GOLD_BLOCK), new Ingredient(PeriodicTable.GOLD, 64), new Ingredient(PeriodicTable.GOLD, 64), new Ingredient(PeriodicTable.GOLD, 16));
		addCombination(new ItemStack(Material.IRON_BLOCK), new Ingredient(PeriodicTable.IRON, 64), new Ingredient(PeriodicTable.IRON, 64), new Ingredient(PeriodicTable.IRON, 16));
		addCombination(new ItemStack(Material.TNT), new Ingredient(Molecules.TRINITROTOLUENE));
		addCombination(new ItemStack(Material.BOOKSHELF), new Ingredient(Molecules.CELLULOSE, 21), new Ingredient(Molecules.KERATIN, 3));
		addCombination(new ItemStack(Material.OBSIDIAN), new Ingredient(Molecules.SILICON_DIOXIDE, 16), new Ingredient(Molecules.MAGNESIUM_OXIDE, 8));
		addCombination(new ItemStack(Material.DIAMOND_ORE), new Ingredient(Molecules.CARBON_NANOTUBES, 6));
		addCombination(new ItemStack(Material.DIAMOND_BLOCK), new Ingredient(Molecules.CARBON_NANOTUBES, 27));
		addCombination(new ItemStack(Material.DIAMOND), new Ingredient(Molecules.CARBON_NANOTUBES, 3));
		addCombination(new ItemStack(Material.REDSTONE_ORE), new Ingredient(Molecules.IRON_OXIDE, 9), new Ingredient(PeriodicTable.COPPER, 9));
		addCombination(new ItemStack(Material.ICE), new Ingredient(Molecules.WATER, 8));
		addCombination(new ItemStack(Material.CACTUS), new Ingredient(Molecules.WATER, 20), new Ingredient(Molecules.MESCALINE));
		addCombination(new ItemStack(Material.PUMPKIN), new Ingredient(Molecules.CUCURBITACIN));
		addCombination(new ItemStack(Material.NETHERRACK), new Ingredient(PeriodicTable.SILICON, 2), new Ingredient(PeriodicTable.OXYGEN), new Ingredient(PeriodicTable.IRON));
		addCombination(new ItemStack(Material.SOUL_SAND), new Ingredient(PeriodicTable.SILICON, 2), new Ingredient(PeriodicTable.OXYGEN), new Ingredient(PeriodicTable.LEAD, 3));
		addCombination(new ItemStack(Material.GLOWSTONE), new Ingredient(PeriodicTable.PHOSPHORUS, 4));
		addCombination(new ItemStack(Material.STAINED_GLASS), new Ingredient(Molecules.SILICON_DIOXIDE, 16));
		addCombination(new ItemStack(Material.IRON_FENCE), new Ingredient(PeriodicTable.IRON, 6));
		addCombination(new ItemStack(Material.THIN_GLASS), new Ingredient(Molecules.SILICON_DIOXIDE, 6));
		addCombination(new ItemStack(Material.STAINED_GLASS_PANE), new Ingredient(Molecules.SILICON_DIOXIDE, 6));
		addCombination(new ItemStack(Material.MELON_BLOCK), new Ingredient(Molecules.CUCURBITACIN), new Ingredient(Molecules.WATER, 16), new Ingredient(Molecules.ASPARTIC_ACID));
		addCombination(new ItemStack(Material.VINE), new Ingredient(Molecules.CELLULOSE, 6));
		addCombination(new ItemStack(Material.MYCEL), new Ingredient(Molecules.FINGOLIMOD));
		addCombination(new ItemStack(Material.WATER_LILY), new Ingredient(Molecules.WATER, 4), new Ingredient(Molecules.CELLULOSE, 6));
		addCombination(new ItemStack(Material.ENDER_STONE), new Ingredient(PeriodicTable.SILICON, 2), new Ingredient(PeriodicTable.OXYGEN), new Ingredient(PeriodicTable.HYDROGEN, 4));
		addCombination(new ItemStack(Material.DRAGON_EGG), new Ingredient(Molecules.CALCIUM_CARBONATE, 18), new Ingredient(Molecules.HYDROXYLAPATITE, 8), new Ingredient(PeriodicTable.URANIUM, 22));
		addCombination(new ItemStack(Material.EMERALD_ORE), new Ingredient(Molecules.BERYL, 6), new Ingredient(PeriodicTable.CHROMIUM, 6), new Ingredient(PeriodicTable.VANADIUM, 6));
		addCombination(new ItemStack(Material.ENDER_CHEST), new Ingredient(Molecules.SILICON_DIOXIDE, 64), new Ingredient(Molecules.SILICON_DIOXIDE, 64), new Ingredient(Molecules.MAGNESIUM_OXIDE, 64));
		addCombination(new ItemStack(Material.EMERALD_BLOCK), new Ingredient(Molecules.BERYL, 18), new Ingredient(PeriodicTable.CHROMIUM, 18), new Ingredient(PeriodicTable.VANADIUM, 18));
		addCombination(new ItemStack(Material.REDSTONE_BLOCK), new Ingredient(Molecules.IRON_OXIDE, 9), new Ingredient(PeriodicTable.COPPER, 9));
		addCombination(new ItemStack(Material.HOPPER), new Ingredient(Molecules.CELLULOSE, 16), new Ingredient(PeriodicTable.IRON, 64), new Ingredient(PeriodicTable.IRON, 16));
		addCombination(new ItemStack(Material.QUARTZ_BLOCK), new Ingredient(Molecules.SILICON_DIOXIDE, 16), new Ingredient(Molecules.GALLIUM_ARSENIDE, 4));
		addCombination(new ItemStack(Material.ACTIVATOR_RAIL), new Ingredient(Molecules.IRON_OXIDE), new Ingredient(PeriodicTable.COPPER), new Ingredient(Molecules.CELLULOSE, 2), new Ingredient(PeriodicTable.IRON, 16));
		addCombination(new ItemStack(Material.DROPPER), new Ingredient(Molecules.IRON_OXIDE), new Ingredient(PeriodicTable.COPPER), new Ingredient(PeriodicTable.SILICON, 7), new Ingredient(PeriodicTable.OXYGEN, 7));
		addCombination(new ItemStack(Material.STAINED_CLAY), new Ingredient(Molecules.KAOLINITE, 4));
		addCombination(new ItemStack(Material.CLAY), new Ingredient(Molecules.KAOLINITE, 4));
		addCombination(new ItemStack(Material.HAY_BLOCK), new Ingredient(Molecules.CELLULOSE, 18));
		addCombination(new ItemStack(Material.CARPET), new Ingredient(Molecules.GLYCINE));
		addCombination(new ItemStack(Material.HARD_CLAY), new Ingredient(Molecules.KAOLINITE, 4));
		addCombination(new ItemStack(Material.COAL_BLOCK), new Ingredient(PeriodicTable.CARBON, 64), new Ingredient(PeriodicTable.CARBON, 8));
		addCombination(new ItemStack(Material.DOUBLE_PLANT), new Ingredient(Molecules.SHIKIMIC_ACID, 2));
	}

	private void addCombination(ItemStack item, Ingredient... ingredients) {
		combinations.put(item, new Combination(ingredients));
	}

}
