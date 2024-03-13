package engineers_gate_java.lesson2.step4;

/**
 * 引き算を行うクラス。
 *
 * @author tomo-sato
 */
public class Subtraction {

	/** 第一引数 */
	private int i = 0;
	/** 第二引数 */
	private int j = 0;

	/**
	 * 計算に使用する値を保持し、このクラスのインスタンスを生成します。
	 *
	 * @param i 第一引数
	 * @param j 第二引数
	 */
	public Subtraction(int i, int j) {
		this.i = i;
		this.j = j;
	}

	/**
	 * このクラスに保持された値を使用し、引き算を行います。
	 *
	 * @return i - j の結果を返します。
	 */
	public int getAnswer() {
		return this.i - this.j;
	}
}
