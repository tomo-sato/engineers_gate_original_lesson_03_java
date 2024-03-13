package engineers_gate_java.lesson2.step4;

/**
 * 割り算を行うクラス。
 *
 * @author tomo-sato
 */
public class Division {

	/** 第一引数 */
	private int i = 0;
	/** 第二引数 */
	private int j = 0;

	/**
	 * 計算に使用する値を保持し、このクラスのインスタンスを生成します。
	 *
	 * @param i 第一引数
	 * @param j 第二引数（※ゼロは指定できません。）
	 */
	public Division(int i, int j) {
		if (j == 0) {
			throw new IllegalArgumentException("ゼロで割ることはできません。");
		}
		this.i = i;
		this.j = j;
	}

	/**
	 * このクラスに保持された値を使用し、割り算を行います。
	 *
	 * @return i / j の結果を返します。
	 */
	public int getAnswer() {
		return this.i / this.j;
	}
}
