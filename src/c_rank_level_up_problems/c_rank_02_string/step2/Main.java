package c_rank_level_up_problems.c_rank_02_string.step2;

import java.util.Scanner;

/**
 * STEP: 2 部分文字列
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			String str2 = sc.next();

			if (str2.indexOf(str) >= 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
