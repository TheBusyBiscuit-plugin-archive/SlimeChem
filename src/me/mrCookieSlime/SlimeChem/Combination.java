package me.mrCookieSlime.SlimeChem;

import java.util.Arrays;
import java.util.List;

public class Combination {
	
	List<Ingredient> ingredients;
	
	public Combination(Ingredient... ingredients) {
		this.ingredients = Arrays.asList(ingredients);
	}
}
