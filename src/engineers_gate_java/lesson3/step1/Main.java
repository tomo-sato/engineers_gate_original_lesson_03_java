package engineers_gate_java.lesson3.step1;

/**
 * ３．インターフェース
 * <p>
 * １．Shape（図形）という名前のインターフェースを作成し、area()とperimeter()という2つのメソッドを定義してください。<br>
 * <ul>
 * <li>area()メソッド・・・面積を返す。</li>
 * <li>perimeter()メソッド・・・周囲長を返す。</li>
 * </ul>
 * <p>
 * Rectangle（長方形）、Circle（円）、Triangle（正三角形）という名前の3つのクラスを作成し、それぞれShapeインターフェースを実装してください。<br>
 * また、各クラスには必要な変数とコンストラクタを定義してください。<br>
 * <p>
 * main関数を持つクラスを作成し、Rectangle、Circle、Triangleのオブジェクトを作成して、各オブジェクトの面積と周囲長を出力するプログラムを作成してください。<br>
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

		// 長方形
		Shape rectangle = new Rectangle(3, 5);
		System.out.println("長方形の面積=" + rectangle.area() + ", 周囲長=" + rectangle.perimeter());

		// 円
		Shape circle = new Circle(5);
		System.out.println("円の面積=" + circle.area() + ", 周囲長=" + circle.perimeter());

		// 正三角形
		Shape triangle = new Triangle(5);
		System.out.println("正三角形の面積=" + triangle.area() + ", 周囲長=" + triangle.perimeter());
	}
}
