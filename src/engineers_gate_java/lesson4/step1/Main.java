package engineers_gate_java.lesson4.step1;

/**
 * ４．継承
 * <p>
 * １．Animalという名前の親クラスを作成し、sound()というメソッドを定義してください。sound()メソッドは、動物の鳴き声を出力するように実装してください。<br>
 * <p>
 * Dog、Cat、Lionという名前の子クラスを作成し、それぞれAnimalクラスを継承してください。また、各クラスには必要な変数とコンストラクタを定義してください。<br>
 * <p>
 * main関数を持つクラスを作成し、Dog、Cat、Lionのオブジェクトを作成して、各オブジェクトのsound()メソッドを呼び出すプログラムを作成してください。<br>
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
		Animal dog = new Dog();
		System.out.println(dog.sound());

		Animal cat = new Cat();
		System.out.println(cat.sound());

		Animal lion = new Lion();
		System.out.println(lion.sound());
	}
}
