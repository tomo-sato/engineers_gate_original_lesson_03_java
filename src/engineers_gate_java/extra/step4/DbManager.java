package engineers_gate_java.extra.step4;

import java.sql.SQLException;
import java.util.List;

import engineers_gate_java.extra.step4.entity.Members;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * DB操作を行うクラス。
 *
 * @author tomo-sato
 */
public class DbManager implements AutoCloseable {

	/** EntityManager */
	private EntityManagerFactory entityManagerFactory;
	/** EntityManager */
	private EntityManager entityManager;

	/**
	 * コンストラクタ。
	 *　  コネクションを生成してクラス内に保持。
	 *
	 * @throws SQLException
	 */
	public DbManager() {
		// EntityManagerFactoryを作成
		this.entityManagerFactory = Persistence.createEntityManagerFactory("TestJpaUnit");

		// EntityManagerを取得
		this.entityManager = entityManagerFactory.createEntityManager();
	}

	/**
	 * データ登録処理。
	 *
	 * @param membersList メンバーリスト。
	 */
	public void insert(List<Members> membersList) {
		// トランザクションを開始
		EntityTransaction transaction = this.entityManager.getTransaction();
		transaction.begin();

		try {
			for (Members members : membersList) {
				// エンティティを保存
				this.entityManager.persist(members);
			}

			// トランザクションをコミット
			transaction.commit();

		} catch (Exception e) {
			System.err.println("メンバー登録処理でエラーが発生しました。：" + e.getMessage());

			// エラーが発生したらロールバック
			transaction.rollback();
		}
	}

	/**
	 * クローズ処理。
	 */
	@Override
	public void close() {
		if (this.entityManager != null) {
			// EntityManagerをクローズ
			this.entityManager.close();
		}

		if (this.entityManagerFactory != null) {
			// EntityManagerFactoryをクローズ
			this.entityManagerFactory.close();
		}
	}
}
