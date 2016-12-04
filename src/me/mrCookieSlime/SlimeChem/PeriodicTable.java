package me.mrCookieSlime.SlimeChem;

public enum PeriodicTable {
	
	OXYGEN("O"),
	HYDROGEN("H"),
	CARBON("C"),
	MAGNESIUM("Mg"),
	ALUMINUM("Al"),
	SILICON("Si"),
	SULFUR("S"),
	IRON("Fe"),
	COBALT("Co"),
	NICKEL("Ni"),
	COPPER("Cu"),
	ZINC("Zn"),
	SILVER("Ag"),
	TIN("Sn"),
	GOLD("Au"),
	LEAD("Pb"),
	URANIUM("U"),
	PHOSPHORUS("P"), 
	CHROMIUM("Cr"),
	VANADIUM("V");
	
	String element;
	
	private PeriodicTable(String formula) {
		this.element = formula;
	}

	public String getName() {
		return element;
	}

}
