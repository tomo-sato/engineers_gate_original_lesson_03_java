package c_rank_level_up_problems.c_rank_03_for.step3;

import java.util.Scanner;

/**
 * STEP: 3 インデックス取得
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int count = sc.nextInt();
			int[] arr = new int[count];

			for (int i = 0; i < count; i++) {
				arr[i] = sc.nextInt();
			}

			int ans = 0;
			int k = sc.nextInt();
			for (int i = 0; i < count; i++) {
				if (k == arr[i]) {
					ans = i + 1;
					break;
				}
			}

			System.out.println(ans);
		}
	}
}
