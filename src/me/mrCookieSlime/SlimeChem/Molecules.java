package me.mrCookieSlime.SlimeChem;

public enum Molecules {
	
	WATER("H" + UnicodeNumbers.TWO.toUnicode() + "O"),
	CARBON_DIOXIDE("CO" + UnicodeNumbers.TWO.toUnicode()),
	SULFATE("SO" + UnicodeNumbers.FOUR.toUnicode()),
	CARBONATE("CO" + UnicodeNumbers.THREE.toUnicode()),
	HYDROXIDE("OH"),
	CELLULOSE("C" + UnicodeNumbers.SIX.toUnicode() + "H" + UnicodeNumbers.ONE.toUnicode() + UnicodeNumbers.ZERO.toUnicode() + "O" + UnicodeNumbers.FIVE.toUnicode()),
	LAZURITE("Na" + UnicodeNumbers.EIGHT.toUnicode() + "AlSiO" + UnicodeNumbers.FOUR.toUnicode() + "SO" + UnicodeNumbers.FOUR.toUnicode()),
	SODALITE("Na" + UnicodeNumbers.EIGHT.toUnicode() + "(AlSiO" + UnicodeNumbers.FOUR.toUnicode() + ")" + UnicodeNumbers.SIX.toUnicode() + "Cl" + UnicodeNumbers.TWO.toUnicode()),
	NOSELITE("Na" + UnicodeNumbers.EIGHT.toUnicode() + "(AlSiO" + UnicodeNumbers.FOUR.toUnicode() + ")" + UnicodeNumbers.SIX.toUnicode() + "SO" + UnicodeNumbers.FOUR.toUnicode()),
	PYRITE("FeS" + UnicodeNumbers.TWO.toUnicode()),
	SERINE("C" + UnicodeNumbers.THREE.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.THREE.toUnicode()),
	GLYCINE("C" + UnicodeNumbers.TWO.toUnicode() + "H" + UnicodeNumbers.FIVE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode()),
	ALANINE("C" + UnicodeNumbers.THREE.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode()),
	FIBROIN("C" + UnicodeNumbers.TWO.toUnicode() + "H" + UnicodeNumbers.FIVE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "C" + UnicodeNumbers.THREE.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.THREE.toUnicode() + "C" + UnicodeNumbers.TWO.toUnicode() + "H" + UnicodeNumbers.FIVE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "C" + UnicodeNumbers.THREE.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "C" + UnicodeNumbers.TWO.toUnicode() + "H" + UnicodeNumbers.FIVE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "C" + UnicodeNumbers.THREE.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode()),
	PANTHERINE("C" + UnicodeNumbers.FOUR.toUnicode() + "H" + UnicodeNumbers.SIX.toUnicode() + "N" + UnicodeNumbers.TWO.toUnicode() + "O" + UnicodeNumbers.TWO.toUnicode()),
	TRINITROTOLUENE("C" + UnicodeNumbers.SIX.toUnicode() + "H" + UnicodeNumbers.TWO.toUnicode() + "(NO" + UnicodeNumbers.TWO.toUnicode() + ")" + UnicodeNumbers.THREE.toUnicode() + "C" + UnicodeNumbers.SEVEN.toUnicode() + "H" + UnicodeNumbers.EIGHT.toUnicode()),
	KERATIN("C" + UnicodeNumbers.FOUR.toUnicode() + "H" + UnicodeNumbers.NINE.toUnicode() + "NO" + UnicodeNumbers.THREE.toUnicode() + "C" + UnicodeNumbers.THREE.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "SC" + UnicodeNumbers.FIVE.toUnicode() + "H" + UnicodeNumbers.NINE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "C" + UnicodeNumbers.FOUR.toUnicode() + "H" + UnicodeNumbers.NINE.toUnicode() + "NO" + UnicodeNumbers.THREE.toUnicode() + "C" + UnicodeNumbers.FIVE.toUnicode() + "H" + UnicodeNumbers.NINE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "C" + UnicodeNumbers.THREE.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode() + "SC"+ UnicodeNumbers.FIVE.toUnicode() + "H" + UnicodeNumbers.NINE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode()),
	MESCALINE("C" + UnicodeNumbers.ONE.toUnicode() + UnicodeNumbers.ONE.toUnicode() + "H" + UnicodeNumbers.ONE.toUnicode() + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.THREE.toUnicode()),
	CUCURBITACIN("C" + UnicodeNumbers.THREE.toUnicode() + UnicodeNumbers.ZERO.toUnicode() + "H" + UnicodeNumbers.FOUR.toUnicode() + UnicodeNumbers.TWO.toUnicode() + "O" + UnicodeNumbers.SEVEN.toUnicode()),
	FINGOLIMOD("C" + UnicodeNumbers.ONE.toUnicode() + UnicodeNumbers.NINE.toUnicode() + "H" + UnicodeNumbers.THREE.toUnicode() + UnicodeNumbers.THREE.toUnicode() + "NO" + UnicodeNumbers.TWO.toUnicode()),
	HYDROXYLAPATITE("CA" + UnicodeNumbers.FIVE.toUnicode() + "(PO" + UnicodeNumbers.FOUR.toUnicode() + ")" + UnicodeNumbers.THREE.toUnicode() + "OH"),
	BERYL("Be" + UnicodeNumbers.THREE.toUnicode() + "Al" + UnicodeNumbers.TWO.toUnicode() + "(SiO" + UnicodeNumbers.THREE.toUnicode() + ")" + UnicodeNumbers.SIX.toUnicode()),
	KAOLINITE("Al" + UnicodeNumbers.TWO.toUnicode() + "Si" + UnicodeNumbers.TWO.toUnicode() + "O" + UnicodeNumbers.FIVE.toUnicode() + "(OH)" + UnicodeNumbers.FOUR.toUnicode()),
	
	MAGNESIUM_CARBONATE("MgCO" + UnicodeNumbers.THREE.toUnicode()),
	IRON_OXIDE("Fe" + UnicodeNumbers.TWO.toUnicode() + "O" + UnicodeNumbers.THREE.toUnicode()),
	MAGNESIUM_OXIDE("MgO"),
	SILICON_DIOXIDE("SiO" + UnicodeNumbers.TWO.toUnicode()),
	COPPER_SULFATE("CuSO" + UnicodeNumbers.FOUR.toUnicode()),
	ALUMINUM_OXIDE("Al" + UnicodeNumbers.TWO.toUnicode() + "O" + UnicodeNumbers.THREE.toUnicode()),
	CALCIUM_CARBONATE("CaCO" + UnicodeNumbers.THREE.toUnicode()),
	SHIKIMIC_ACID("C" + UnicodeNumbers.SEVEN.toUnicode() + "H" + UnicodeNumbers.ONE.toUnicode() + UnicodeNumbers.ZERO.toUnicode() + "O" + UnicodeNumbers.FIVE.toUnicode()),
	ASPARTIC_ACID("C" + UnicodeNumbers.FOUR.toUnicode() + "H" + UnicodeNumbers.SEVEN.toUnicode() + "NO" + UnicodeNumbers.FOUR.toUnicode()),
	COBALT_NITRATE("CO(NO" + UnicodeNumbers.THREE.toUnicode() + ")" + UnicodeNumbers.TWO.toUnicode()),
	GALLIUM_ARSENIDE("GaAs"),
	CARBON_NANOTUBES("C" + UnicodeNumbers.SIX.toUnicode() + UnicodeNumbers.FOUR.toUnicode() + "C" + UnicodeNumbers.SIX.toUnicode() + UnicodeNumbers.FOUR.toUnicode() + "C" + UnicodeNumbers.SIX.toUnicode() + UnicodeNumbers.FOUR.toUnicode() + "C" + UnicodeNumbers.SIX.toUnicode() + UnicodeNumbers.FOUR.toUnicode());
	
	String element;
	
	private Molecules(String formula) {
		this.element = formula;
	}

	public String getName() {
		return element;
	}

}
