package me.mrCookieSlime.SlimeChem;

import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

import org.bukkit.inventory.ItemStack;


public class Ingredient {
	
	PeriodicTable element;
	Molecules molecule;
	int amount;
	
	public Ingredient(PeriodicTable element, int amount) {
		this.molecule = null;
		this.element = element;
		this.amount = amount;
	}
	
	public Ingredient(Molecules molecule, int amount) {
		this.molecule = molecule;
		this.element = null;
		this.amount = amount;
	}

	public Ingredient(PeriodicTable element) {
		this.molecule = null;
		this.element = element;
		this.amount = 1;
	}

	public Ingredient(Molecules molecule) {
		this.molecule = molecule;
		this.element = null;
		this.amount = 1;
	}

	public Ingredient() {
		this.molecule = null;
		this.element = null;
		this.amount = 0;
	}
	
	public ItemStack getItem() {
		if (molecule != null) return SlimefunItem.getByName("MOLECULE_" + molecule.toString()).getItem();
		else if (element != null) return SlimefunItem.getByName("ELEMENT_" + element.toString()).getItem();
		else return null;
	}

}
