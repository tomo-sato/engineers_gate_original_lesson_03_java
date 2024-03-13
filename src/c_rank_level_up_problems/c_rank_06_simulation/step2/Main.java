package c_rank_level_up_problems.c_rank_06_simulation.step2;

import java.util.Scanner;

/**
 * STEP: 2 シミュレーションの練習
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int startPaiza = 1;
			int startKyoko = 1;

			int count = 0;
			for (int i = 0; i <= n;) {
				startKyoko = startKyoko + (startPaiza * a);
				count++;
				startPaiza = startPaiza + (startKyoko % b);

				i = startKyoko;
			}

			System.out.println(count);
		}
	}
}
