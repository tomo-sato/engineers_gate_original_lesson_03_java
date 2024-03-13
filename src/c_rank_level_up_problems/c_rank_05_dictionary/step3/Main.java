package c_rank_level_up_problems.c_rank_05_dictionary.step3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * STEP: 3 辞書データの順序
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

			int m = sc.nextInt();

			for (int i = 0; i < m; i++) {
				String name = sc.next();

				int tmpProperty = map.get(name);
				int property = sc.nextInt();

				map.put(name, property + tmpProperty);
			}

			List<String> intList = new ArrayList<String>();
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				String name = entry.getKey();
				int listSize = intList.size();

				if (listSize > 0) {

					boolean isAdd = false;
					for (int j = 0; j < listSize; j++) {
						String tmp2 = intList.get(j);

						if (name.compareTo(tmp2) < 0) {
							intList.add(j, name);
							isAdd = true;
							break;
						}
					}

					if (!isAdd) {
						intList.add(name);
					}
				} else {
					intList.add(name);
				}
			}

			for (String name : intList) {
				System.out.println(map.get(name));
			}
		}
	}
}
