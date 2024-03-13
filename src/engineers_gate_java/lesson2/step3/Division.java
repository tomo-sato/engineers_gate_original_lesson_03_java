package engineers_gate_java.lesson2.step3;

/**
 * 割り算を行うクラス。
 *
 * @author tomo-sato
 */
public class Division {

	/**
	 * 割り算を行います。
	 *
	 * @param i 第一引数
	 * @param j 第二引数（※ゼロは指定できません。）
	 * @return i / j の結果を返します。
	 */
	public static int getAnswer(int i, int j) {
		if (j == 0) {
			throw new IllegalArgumentException("ゼロで割ることはできません。");
		}
		return i / j;
	}
}
