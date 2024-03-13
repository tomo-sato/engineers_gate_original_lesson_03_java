package c_rank_level_up_problems.c_rank_03_for.boss;

import java.util.Scanner;

/**
 * FINAL問題 forループ
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();

			// 参加者の人数 N
			for (int i = 0; i < n; i++) {

				int count = 0;

				// 各参加者が紙に書いた数字が M 個ずつ
				for (int j = 0; j < m; j++) {
					int num = sc.nextInt();

					// K を書いた数
					if (num == k) {
						count++;
					}
				}

				System.out.println(count);
			}
		}
	}
}
