package engineers_gate_java.lesson2.step4;

/**
 * ２．基礎構文（クラス、静的メソッド、動的メソッド）
 * <p>
 * ４．main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラスをそれぞれ作成してください。<br>
 * 関数は動的メソッドとして作成してください。<br>
 * また、関数は引数を持たず、クラスのインスタンス変数を使用し計算を行ってください。<br>
 * <p>
 * main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の動的メソッドを使用し、計算を行ってください。<br>
 * <p>
 * ※各クラスのインスタンス生成時に渡す引数の値は、数値（int）であれば何でも良い。
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
		int i = 10;
		int j = 2;

		Addition addition = new Addition(i, j);
		int ans = addition.getAnswer();
		System.out.println(i + " + " + j + " = " + ans);

		Subtraction subtraction = new Subtraction(i, j);
		ans = subtraction.getAnswer();
		System.out.println(i + " - " + j + " = " + ans);

		Multiplication multiplication = new Multiplication(i, j);
		ans = multiplication.getAnswer();
		System.out.println(i + " * " + j + " = " + ans);

		Division division = new Division(i, j);
		ans = division.getAnswer();
		System.out.println(i + " / " + j + " = " + ans);
	}
}
