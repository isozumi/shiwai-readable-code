package com.weekinweekout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import com.weekinweekout.logic.RecipeManager;

public class RecipeManegementConsole {
	/**
	 * args[0] ... レシピファイル
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println("一番目の引数にはレシピファイルを指定してください");
			return;
		}

		String recipeFilePath = args[0];
		outputRecipesToConsole(recipeFilePath);
	}

	private static void outputRecipesToConsole(String recipeFilePath) throws Exception {
		File recipeFile = new File(recipeFilePath);

		if (!recipeFile.exists()) {
			throw new FileNotFoundException("レシピファイルが見つかりません。");
		}

		RecipeManager manager = new RecipeManager(recipeFile);
		HashMap<Integer,String> recipeDatas = manager.getRecipes();

		for(Map.Entry<Integer, String> e : recipeDatas.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}


}
