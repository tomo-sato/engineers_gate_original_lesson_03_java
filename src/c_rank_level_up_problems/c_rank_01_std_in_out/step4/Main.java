package c_rank_level_up_problems.c_rank_01_std_in_out.step4;

import java.util.Scanner;

/**
 * STEP: 4 入力の配列による保持
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		// 開放されないパターンもあるので注意。
		//   【参考サイト】
		//     try-with-resourcesでリソース解放されないパターン #Java - Qiita https://qiita.com/nesheep5/items/6a68d862c5902e5994a4
		try (Scanner sc = new Scanner(System.in)) {
			int count = sc.nextInt();

			int out = 0;
			for (int i = 0; i < count; i++) {
				int j = sc.nextInt();
				if (out < j) {
					out = j;
				}
			}

			System.out.println(out);
		}
	}
}
