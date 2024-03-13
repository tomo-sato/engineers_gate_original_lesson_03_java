package c_rank_level_up_problems.c_rank_06_simulation.step1;

/**
 * STEP: 1 条件を満たす最小の自然数
 */
public class Main {
	public static void main(String[] args) {
		int i = 10000;
		while (true) {
			if (i % 13 == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}
