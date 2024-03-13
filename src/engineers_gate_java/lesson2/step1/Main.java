package engineers_gate_java.lesson2.step1;

/**
 * ２．基礎構文（クラス、静的メソッド、動的メソッド）
 * <p>
 * １．数値（int）の引数を2つ受け取り、足し算を行う関数を作成してください。<br>
 * 作成した関数をmain関数で使用し、結果を標準出力で表示してください。<br>
 * <p>
 * ※足し算の関数に渡す引数の値は、数値（int）であれば何でも良い。
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
		int i = 1;
		int j = 2;

		int ans = add(i, j);
		System.out.println(i + " + " + j + " = " + ans);
	}

	/**
	 * 足し算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数
	 * @return i + j の結果を返します。
	 */
	public static int add(int i, int j) {
		return i + j;
	}
}
