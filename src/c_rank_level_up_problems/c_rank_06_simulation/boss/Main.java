package c_rank_level_up_problems.c_rank_06_simulation.boss;

import java.util.Scanner;

/**
 * FINAL問題 シミュレーション
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			int hp = sc.nextInt();

			int paizaAttack1 = 0;
			int paizaAttack2 = 0;
			int monsterAttack1 = 0;
			int monsterAttack2 = 0;

			int i = 0;
			while (hp > 0) {
				i++;

				// パイザ君の攻撃
				int tmpPaizaAttack = getPaizaAttackDamage(i, monsterAttack2, monsterAttack1);

				// モンスターの攻撃
				int tmpMonsterAttack = getMonsterAttackDamage(i, paizaAttack2, paizaAttack1);
				hp = hp - tmpMonsterAttack;

				paizaAttack1 = paizaAttack2;
				paizaAttack2 = tmpPaizaAttack;

				monsterAttack1 = monsterAttack2;
				monsterAttack2 = tmpMonsterAttack;

			}

			System.out.println(i);
		}
	}

	/**
	 * パイザ君が与えるダメージ
	 *
	 * @param count n回目の攻撃を表すカウント。
	 * @param damage1 受けたダメージ1（(n - 1) 回目の攻撃のダメージ・・・直近のダメージ）
	 * @param damage2 受けたダメージ2（(n - 2) 回目の攻撃のダメージ・・・古い方のダメージ）
	 * @return モンスターに与えるダメージ
	 */
	private static int getPaizaAttackDamage(int count, int damage1, int damage2) {
		int retDamage = 0;
		switch (count) {
		case 1, 2:
			retDamage = 1;
			break;

		default:
			retDamage = damage1 + damage2;
			break;
		}

		return retDamage;
	}

	/**
	 * モンスターが与えるダメージ
	 *
	 * @param count n回目の攻撃を表すカウント。
	 * @param damage1 受けたダメージ1
	 * @param damage2 受けたダメージ2
	 * @return パイザ君に与えるダメージ
	 */
	private static int getMonsterAttackDamage(int count, int damage1, int damage2) {
		int retDamage = 0;
		switch (count) {
		case 1, 2:
			retDamage = 1;
			break;

		default:
			retDamage = (damage1 * 2) + damage2;
			break;
		}

		return retDamage;
	}
}
