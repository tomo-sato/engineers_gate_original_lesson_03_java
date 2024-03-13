package c_rank_level_up_problems.c_rank_02_string.step4;

import java.util.Scanner;

/**
 * STEP: 4 数字の文字列操作（0埋め）
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int length = str.length();

			String out = str;
			for (int i = 3; i > length; i--) {
				out = "0" + out;
			}

			System.out.println(out);
		}
	}
}
