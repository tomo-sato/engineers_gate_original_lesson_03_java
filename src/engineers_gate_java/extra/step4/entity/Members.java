package engineers_gate_java.extra.step4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * メンバークラス。
 *
 * @author tomo-sato
 */
@Data
@Entity
@Table(name = "members")
public class Members {

	/** id */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** 名前 */
	@Column(name = "name", nullable = false)
	private String name;

	/** 年齢 */
	@Column(name = "age", nullable = false)
	private Integer age;

	/** 住所 */
	@Column(name = "address", nullable = false)
	private String address;

	/**
	 * コンストラクタ。
	 */
	public Members() {}

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
}
