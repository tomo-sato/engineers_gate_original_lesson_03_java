package engineers_gate_java.lesson2.step2;

/**
 * ２．基礎構文（クラス、静的メソッド、動的メソッド）
 * <p>
 * ２．上記で作成したクラスに、足し算の関数と同様2つの引数を受け取り、<br>
 * 引き算、掛け算、割り算を行う関数を作成してください。<br>
 * 作成した関数をmain関数で使用し、結果を標準出力で表示してください。<br>
 * <p>
 * ※各関数に渡す引数の値は、数値（int）であれば何でも良い。
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
		int i = 10;
		int j = 2;

		int ans = add(i, j);
		System.out.println(i + " + " + j + " = " + ans);

		ans = sub(i, j);
		System.out.println(i + " - " + j + " = " + ans);

		ans = mlt(i, j);
		System.out.println(i + " * " + j + " = " + ans);

		ans = div(i, j);
		System.out.println(i + " / " + j + " = " + ans);
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

	/**
	 * 引き算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数
	 * @return i - j の結果を返します。
	 */
	public static int sub(int i, int j) {
		return i - j;
	}

	/**
	 * 掛け算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数
	 * @return i * j の結果を返します。
	 */
	public static int mlt(int i, int j) {
		return i * j;
	}

	/**
	 * 割り算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数（※ゼロは指定できません。）
	 * @return i / j の結果を返します。
	 */
	public static int div(int i, int j) {
		if (j == 0) {
			throw new IllegalArgumentException("ゼロで割ることはできません。");
		}
		return i / j;
	}
}
