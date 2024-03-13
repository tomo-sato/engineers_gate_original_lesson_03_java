package c_rank_level_up_problems.c_rank_05_dictionary.boss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * FINAL問題 辞書
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int groupAnum = sc.nextInt();
			int groupBnum = sc.nextInt();
			int groupCnum = sc.nextInt();

			// Aグループの抽出
			Map<Integer, Integer> groupAmap = new HashMap<Integer, Integer>();
			for (int i = 0; i < groupAnum; i++) {
				int noA = sc.nextInt();
				int noB = sc.nextInt();
				groupAmap.put(noA, noB);
			}

			// Bグループの抽出
			Map<Integer, Integer> groupBmap = new HashMap<Integer, Integer>();
			for (int i = 0; i < groupBnum; i++) {
				int noB = sc.nextInt();
				int noC = sc.nextInt();
				groupBmap.put(noB, noC);
			}

			// A+Cグループの抽出
			Map<Integer, Integer> groupACmap = new HashMap<Integer, Integer>();
			for (Map.Entry<Integer, Integer> entry : groupAmap.entrySet()) {
				int noA = entry.getKey();
				int noB = entry.getValue();
				int noC = groupBmap.get(noB);

				if (noC > groupCnum) {
					continue;
				}
				groupACmap.put(noA, noC);
			}

			List<Integer> noAList = new ArrayList<Integer>();
			for (Map.Entry<Integer, Integer> entry : groupACmap.entrySet()) {

				int noA = entry.getKey();
				int listSize = noAList.size();

				if (listSize > 0) {

					boolean isAdd = false;
					for (int j = 0; j < listSize; j++) {
						int tmp2 = noAList.get(j);

						// 値の詰替
						if (noA < tmp2) {
							noAList.add(j, noA);
							isAdd = true;
							break;
						}
					}

					if (!isAdd) {
						noAList.add(noA);
					}
				} else {
					noAList.add(noA);
				}
			}

			for (Integer noA : noAList) {
				System.out.println(noA + " " + groupACmap.get(noA));
			}
		}
	}
}
