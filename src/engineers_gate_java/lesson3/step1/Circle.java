package engineers_gate_java.lesson3.step1;

/**
 * 円を表す図形クラス。
 *
 * @author tomo-sato
 */
public class Circle implements Shape {

	/** 半径 */
	private int radius;

	/**
	 * コンストラクタ
	 *
	 * @param radius 半径
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return this.radius * this.radius * Math.PI;
	}

	@Override
	public double perimeter() {
		return 2 * this.radius * Math.PI;
	}

}
