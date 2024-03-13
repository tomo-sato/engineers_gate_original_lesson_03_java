package c_rank_level_up_problems.c_rank_04_sort.boss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * FINAL問題 ソート
 */
public class Main {

	private static final int INDEX_GOLD = 0;
	private static final int INDEX_SILVER = 1;

	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			List<Integer[]> intList = new ArrayList<Integer[]>();
			for (int i = 0; i < n; i++) {

				int tmpGold = sc.nextInt();
				int tmpSilver = sc.nextInt();
				int listSize = intList.size();

				if (listSize > 0) {

					boolean isAdd = false;
					for (int j = 0; j < listSize; j++) {
						Integer[] tmp2 = intList.get(j);
						int tmp2Gold = tmp2[INDEX_GOLD].intValue();
						int tmp2Silver = tmp2[INDEX_SILVER].intValue();

						if (tmpSilver > tmp2Silver) {
							intList.add(j, new Integer[] { tmpGold, tmpSilver });
							isAdd = true;
							break;

						} else if (tmpSilver == tmp2Silver
								&& tmpGold > tmp2Gold) {

							intList.add(j, new Integer[] { tmpGold, tmpSilver });
							isAdd = true;
							break;

						}
					}

					if (!isAdd) {
						intList.add(new Integer[] { tmpGold, tmpSilver });
					}
				} else {
					intList.add(new Integer[] { tmpGold, tmpSilver });
				}
			}

			for (Integer[] i : intList) {
				System.out.println(i[INDEX_GOLD] + " " + i[INDEX_SILVER]);
			}
		}
	}
}
