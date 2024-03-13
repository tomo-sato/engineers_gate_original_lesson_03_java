package c_rank_level_up_problems.c_rank_02_string.step1;

import java.util.Scanner;

/**
 * STEP: 1 整数と文字列
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int count = sc.nextInt();

			for (int i = 0; i < count; i++) {
				System.out.println(sc.next().length());
			}
		}
	}
}
