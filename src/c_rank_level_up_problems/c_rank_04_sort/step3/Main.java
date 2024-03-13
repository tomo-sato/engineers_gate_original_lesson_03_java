package c_rank_level_up_problems.c_rank_04_sort.step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * STEP: 3 辞書式ソート
 */
public class Main {

	private static final int INDEX_APPLE = 0;
	private static final int INDEX_BANANA = 1;

	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			List<Integer[]> intList = new ArrayList<Integer[]>();
			for (int i = 0; i < n; i++) {

				int tmpApple = sc.nextInt();
				int tmpBanana = sc.nextInt();
				int listSize = intList.size();

				if (listSize > 0) {

					boolean isAdd = false;
					for (int j = 0; j < listSize; j++) {
						Integer[] tmp2 = intList.get(j);
						int tmp2Apple = tmp2[INDEX_APPLE].intValue();
						int tmp2Banana = tmp2[INDEX_BANANA].intValue();

						if (tmpApple > tmp2Apple) {
							intList.add(j, new Integer[] { tmpApple, tmpBanana });
							isAdd = true;
							break;

						} else if (tmpApple == tmp2Apple
								&& tmpBanana > tmp2Banana) {

							intList.add(j, new Integer[] { tmpApple, tmpBanana });
							isAdd = true;
							break;

						}
					}

					if (!isAdd) {
						intList.add(new Integer[] { tmpApple, tmpBanana });
					}
				} else {
					intList.add(new Integer[] { tmpApple, tmpBanana });
				}
			}

			for (Integer[] i : intList) {
				System.out.println(i[INDEX_APPLE] + " " + i[INDEX_BANANA]);
			}
		}
	}
}
