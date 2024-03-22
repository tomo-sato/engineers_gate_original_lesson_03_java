package engineers_gate_java.extra.step1;

/**
 * メンバークラス。
 *
 * @author tomo-sato
 */
public class Members {

	/** id */
	private int id;
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;
	/** 住所 */
	private String address;

	/**
	 * コンストラクタ。
	 *
	 * @param id id
	 * @param name 名前
	 * @param age 年齢
	 * @param address 住所
	 */
	public Members(int id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ID:" + this.id + ", 名前:" + this.name + ", 年齢:" + this.age + ", 住所:" + this.address;
	}
}
