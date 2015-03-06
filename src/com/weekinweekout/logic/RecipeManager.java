package com.weekinweekout.logic;

import java.io.File;
import java.util.HashMap;

import com.weekinweekout.util.Utilities;

public class RecipeManager {

	private HashMap<Integer,String> recipeDatas= new HashMap<Integer,String>();

	public RecipeManager(File recipeFile) throws Exception {
		this.recipeDatas = Utilities.readLinesFromFile(recipeFile);
	}

	public HashMap<Integer,String> getRecipes() {
		return this.recipeDatas;
	}

}
