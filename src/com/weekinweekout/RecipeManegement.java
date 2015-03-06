package com.weekinweekout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class RecipeManegement {
	/**
	 * args[0] ... ���V�s�t�@�C��
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println("��Ԗڂ̈����ɂ̓��V�s�t�@�C�����w�肵�Ă�������");
			return;
		}

		String recipeFilePath = args[0];
		outputRecipes(recipeFilePath);
	}

	private static void outputRecipes(String recipeFilePath) throws Exception {
		File recipeFile = new File(recipeFilePath);

		if (!recipeFile.exists()) {
			throw new FileNotFoundException("���V�s�t�@�C����������܂���B");
		}
		
		List<String> recipeDatas = readLinesFromFile(recipeFile);
		
		for (String recipeData : recipeDatas) {
			System.out.println(recipeData);
		}
	}

	private static List<String> readLinesFromFile(File recipeFile) throws Exception {
		try (Reader r = new FileReader(recipeFile)) {
			try (BufferedReader br = new BufferedReader(r)) {
				List<String> readLines = new ArrayList<String>();
				String readContent = "";

				do {
					readContent = br.readLine();
					// readLine == null �̂Ƃ��̓t�@�C���̏I���
					if (readContent == null) {
						break;
					}

					readLines.add(readContent);
				} while (true);

				return readLines;
			}
		}
	}
}
