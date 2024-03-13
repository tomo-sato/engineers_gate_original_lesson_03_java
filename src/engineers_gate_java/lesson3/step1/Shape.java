package engineers_gate_java.lesson3.step1;

/**
 * 図形を表すインターフェース。
 *
 * @author tomo-sato
 */
public interface Shape {

	/**
	 * 面積を返します。
	 * @return 面積を返します。
	 */
	double area();

	/**
	 * 周囲長を返します。
	 * @return 周囲長を返します。
	 */
	double perimeter();
}
