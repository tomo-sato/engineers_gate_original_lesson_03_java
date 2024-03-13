package engineers_gate_java.lesson3.step1;

/**
 * 正三角形を表す図形クラス。
 *
 * @author tomo-sato
 */
public class Triangle implements Shape {

	/** 辺 */
	private int side;

	/**
	 * コンストラクタ
	 *
	 * @param side 辺
	 */
	public Triangle(int side) {
		this.side = side;
	}

	@Override
	public double area() {
		// 高さ（√3/2×1辺の長さ）
		double height = Math.sqrt(3) / 2 * side;
		// 面積（1辺の長さ×高さ÷2）
		double area = side * height / 2;
		return area;
	}

	@Override
	public double perimeter() {
		return this.side * 3;
	}

}
