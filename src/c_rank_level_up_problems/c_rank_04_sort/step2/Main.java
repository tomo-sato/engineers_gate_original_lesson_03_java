package c_rank_level_up_problems.c_rank_04_sort.step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * STEP: 2 降順ソート
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			List<Integer> intList = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {

				int tmp = sc.nextInt();
				int listSize = intList.size();

				if (listSize > 0) {

					boolean isAdd = false;
					for (int j = 0; j < listSize; j++) {
						int tmp2 = intList.get(j);

						if (tmp > tmp2) {
							intList.add(j, tmp);
							isAdd = true;
							break;
						}
					}

					if (!isAdd) {
						intList.add(tmp);
					}
				} else {
					intList.add(tmp);
				}
			}

			for (int i : intList) {
				System.out.println(i);
			}
		}
	}
}
