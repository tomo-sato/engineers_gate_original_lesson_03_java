package engineers_gate_java.lesson2.step3;

/**
 * ２．基礎構文（クラス、静的メソッド、動的メソッド）
 * <p>
 * ３．main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラスをそれぞれ作成してください。<br>
 * 関数は静的メソッドとして作成してください。<br>
 * main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の静的メソッドを使用し、計算を行ってください。<br>
 * <p>
 * ※各関数に渡す引数の値は、数値（int）であれば何でも良い。
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

		int ans = Addition.getAnswer(i, j);
		System.out.println(i + " + " + j + " = " + ans);

		ans = Subtraction.getAnswer(i, j);
		System.out.println(i + " - " + j + " = " + ans);

		ans = Multiplication.getAnswer(i, j);
		System.out.println(i + " * " + j + " = " + ans);

		ans = Division.getAnswer(i, j);
		System.out.println(i + " / " + j + " = " + ans);
	}
}
