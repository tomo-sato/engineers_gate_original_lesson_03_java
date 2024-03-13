package c_rank_level_up_problems.c_rank_05_dictionary.step1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * STEP: 1 辞書の基本
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String name = sc.next();
				int property = sc.nextInt();

				map.put(name, property);
			}

			String searchName = sc.next();
			System.out.println(map.get(searchName));
		}
	}
}
