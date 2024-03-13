package engineers_gate_java.lesson4.step1;

/**
 * 動物クラス。
 *
 * @author tomo-sato
 */
public class Animal {

	/** 鳴き声を表すプロパティ */
	protected String sound = null;

	/**
	 * デフォルトコンストラクタ。
	 */
	public Animal() {
	}

	/**
	 * このクラスに設定された鳴き声を返す。
	 * @return 鳴き声を返す。
	 */
	public String sound() {
		return this.sound;
	}
}
