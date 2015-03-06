package com.weekinweekout.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;

public class Utilities {

	public static HashMap<Integer,String> readLinesFromFile(File recipeFile)
			throws Exception {
		try (Reader r = new FileReader(recipeFile)) {
			try (BufferedReader br = new BufferedReader(r)) {
				HashMap<Integer,String> readDatas = new HashMap<Integer,String>();
				String readContent = "";

				int index=0;
				do {
					readContent = br.readLine();
					// readLine == null のときはファイルの終わり
					if (readContent == null) {
						break;
					}

					readDatas.put(index, readContent);
					index++;
				} while (true);

				return readDatas;
			}
		}
	}
}
