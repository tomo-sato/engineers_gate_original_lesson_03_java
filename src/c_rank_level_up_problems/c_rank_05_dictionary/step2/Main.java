package c_rank_level_up_problems.c_rank_05_dictionary.step2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * STEP: 2 辞書のデータ更新
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String name = sc.next();
				int property = 0;

				map.put(name, property);
			}

			// 攻撃回数取得
			n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				String name = sc.next();

				int tmpProperty = map.get(name);
				int property = sc.nextInt();

				map.put(name, property + tmpProperty);
			}

			String searchName = sc.next();
			System.out.println(map.get(searchName));
		}
	}
}
