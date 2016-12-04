package me.mrCookieSlime.SlimeChem;

public enum UnicodeNumbers {
	
	ZERO("\u2080"),
	ONE("\u2081"),
	TWO("\u2082"),
	THREE("\u2083"),
	FOUR("\u2084"),
	FIVE("\u2085"),
	SIX("\u2086"),
	SEVEN("\u2087"),
	EIGHT("\u2088"),
	NINE("\u2089");
	
	String unicode;
	
	UnicodeNumbers(String unicode) {
		this.unicode = unicode;
	}
	
	public String toUnicode() {
		return this.unicode;
	}

}
