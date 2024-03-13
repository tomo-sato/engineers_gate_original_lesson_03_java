package engineers_gate_java.lesson2.step5;

/**
 * 座標を表すクラス。
 *
 * @author tomo-sato
 */
public class Point {

	/** X座標 */
	private int x;
	/** Y座標 */
	private int y;

	/**
	 * コンストラクタ
	 *
	 * @param x X座標
	 * @param y Y座標
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * このクラスの座標と引数p座標との距離を返します。
	 * （動的メソッド「インスタンスメソッド」での実装サンプルです。）
	 *
	 * @param p 座標
	 * @return このクラスの座標と引数p座標との距離を返します。
	 */
	public double distance(Point p) {
		// このクラス（this）と、引数のPointを引数に渡し、結果を得る実装です。
		// 使用方法はmain関数を参照ください。
		return distance(this, p);
	}

	/**
	 * 2点間の距離を返します。
	 * （静的メソッドの「スタティックメソッド」での実装サンプルです。）
	 *
	 * @param p1 座標1
	 * @param p2 座標2
	 * @return 2点間の距離を返します。
	 */
	public static double distance(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
}
