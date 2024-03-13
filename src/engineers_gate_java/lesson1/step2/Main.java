package engineers_gate_java.lesson1.step2;

/**
 * １．基礎構文（変数、for文、if文）
 * <p>
 * ２．数値型の配列を2つ（変数名：arr1, arr2）用意してください。<br>
 * arr1の変数の各要素に「0 ～ 9」を代入し、初期化してください。<br>
 * arr1に代入した要素を取り出し、arr2に反転した結果「9 ～ 0」を代入してください。
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
		int[] arr1 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		int[] arr2 = new int[arr1.length];

		int length = arr1.length;
		int j = length - 1;
		for (int i = 0; i < length; i++) {
			arr2[i] = arr1[j];
			j--;
		}

		for (int ans : arr2) {
			System.out.println(ans);
		}
	}
}
