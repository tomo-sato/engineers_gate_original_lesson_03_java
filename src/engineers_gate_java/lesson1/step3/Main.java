package engineers_gate_java.lesson1.step3;

/**
 * １．基礎構文（変数、for文、if文）
 * <p>
 * ３．出力結果のように九九の表を作成してください。<br>
 * 数時間の区切り文字は半角スペース文字とします。<br>
 * <p>
 * ■出力結果例■<br>
 * 1 2 3 4 5 6 7 8 9<br>
 * 2 4 6 8 10 12 14 16 18<br>
 * 3 6 9 12 15 18 21 24 27<br>
 * 4 8 12 16 20 24 28 32 36<br>
 * 5 10 15 20 25 30 35 40 45<br>
 * 6 12 18 24 30 36 42 48 54<br>
 * 7 14 21 28 35 42 49 56 63<br>
 * 8 16 24 32 40 48 56 64 72<br>
 * 9 18 27 36 45 54 63 72 81
 *
 * @author tomo-sato
 */
public class Main {

	/**
	 * main関数
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
	}
}
