package engineers_gate_java.lesson1.step5;

import java.util.HashMap;
import java.util.Map;

/**
 * １．基礎構文（変数、for文、if文）
 * <p>
 * ５．キーに「1から5」、値に「りんご、いちご、みかん、バナナ、メロン」を順にセットした<br>
 * HashMapを作成し、キーと値を一つずつ表示してください。
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

		Map<Integer, String> map = new HashMap<Integer, String>() {
			{
				put(1, "りんご");
				put(2, "いちご");
				put(3, "みかん");
				put(4, "バナナ");
				put(5, "メロン");
			}
		};

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
