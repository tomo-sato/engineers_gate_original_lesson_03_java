package engineers_gate_java.lesson2.step5;

/**
 * ２．基礎構文（クラス、静的メソッド、動的メソッド）
 * <p>
 * ５．X軸（int） 、Y軸（int）の座標を保持するPointクラスを作成してください。<br>
 * 2点の座標の距離を求める関数を作成し、main関数を持つクラスで計算結果を表示してください。<br>
 * <p>
 * 2点の座標を計算する計算式： Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
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
		Point p1 = new Point(3, 4);
		Point p2 = new Point(7, 1);

		// 静的メソッドで実装した場合の例。
		double ans1 = Point.distance(p1, p2);
		System.out.println(ans1);

		// 動的メソッド（インスタンスメソッド）で実装した場合の例。
		double ans2 = p1.distance(p2);
		System.out.println(ans2);
	}
}
