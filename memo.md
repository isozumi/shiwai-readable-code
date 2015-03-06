# 備忘
-  ファイルの読み込み処理はドメインに依存しないので別クラスに切り出す

# リーダブルなところ
-  目的に応じたクラスの細分化
	コード：RecipeManagementConsole、RecipeManager、RecipeUtilitiesなどのクラス
	https://github.com/isozumi/shiwai-readable-code/blob/master/src/com/weekinweekout/RecipeManegementConsole.java#L10
	https://github.com/isozumi/shiwai-readable-code/blob/master/src/com/weekinweekout/util/Utilities.java#L9
	リーダブルな理由：コードを読む際に、目的がわかりやすい。mainの記載がすっきりして処理の概要がつかみやすい。
	見つけたきっかけ：「ファイル読み込みのロジックはどうなっているんだろう？」と疑問に思ったときに、ファイルを開く選択だけでたどり着けた


-  目的と対象の変数名への反映
	コード：outputRecipesToConsole,readLinesFromFileなどの変数
	https://github.com/isozumi/shiwai-readable-code/blob/master/src/com/weekinweekout/RecipeManegementConsole.java#L22
	リーダブルな理由：コードを読む際に、目的がわかりやすい。mainの記載がすっきりして処理の概要がつかみやすい。
	見つけたきっかけ：「ファイル読み込みのロジックはどうなっているんだろう？」と疑問に思ったときに、ファイルを開く選択だけでたどり着けた


-  リスト型の変数は複数形の命名

