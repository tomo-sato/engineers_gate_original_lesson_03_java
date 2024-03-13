package engineers_gate_java.lesson3.step1;

/**
 * 長方形を表す図形クラス。
 *
 * @author tomo-sato
 */
public class Rectangle implements Shape {

	/** 幅 */
	private int w;
	/** 高さ */
	private int h;

	/**
	 * コンストラクタ
	 *
	 * @param w 幅
	 * @param h 高さ
	 */
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {
		return this.w * this.h;
	}

	@Override
	public double perimeter() {
		return (this.w * 2) + (this.h * 2);
	}

}
