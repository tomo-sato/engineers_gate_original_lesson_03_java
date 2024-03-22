package engineers_gate_java.extra.step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * DB操作を行うクラス。
 *
 * @author tomo-sato
 */
public class DbManager implements AutoCloseable {

	// MySQLの接続情報
	/** データベースのURL */
	private static final String DB_URL = "jdbc:mysql://localhost:3306/eg_lesson";
	/** データベースのユーザー名 */
	private static final String DB_USER = "eg_sns_user";
	/** データベースのパスワード */
	private static final String DB_PASS = "eg_pass";

	/** コネクションを保持。 */
	private Connection conn;

	/**
	 * コンストラクタ。
	 *　  コネクションを生成してクラス内に保持。
	 *
	 * @throws SQLException
	 */
	public DbManager() throws SQLException {
		this.conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	}

	/**
	 * データ登録処理。
	 *
	 * @param membersList メンバーリスト。
	 */
	public void insert(List<Members> membersList) {

		// SQLクエリ
		String sql = "INSERT INTO members (id, name, age, address) VALUES (?, ?, ?, ?)";

		for (Members member : membersList) {
			// PreparedStatementの作成。
			try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
				// パラメータの設定。
				pstmt.setInt(1, member.getId());
				pstmt.setString(2, member.getName());
				pstmt.setInt(3, member.getAge());
				pstmt.setString(4, member.getAddress());

				// SQLクエリの実行。
				int rowsInserted = pstmt.executeUpdate();
				if (rowsInserted > 0) {
					System.out.println("データが正常に挿入されました。：member={" + member + "}");
				}
			} catch (Exception e) {
				System.err.println("データ挿入に失敗しました。：member={" + member + "}, e=" + e.getMessage());
			}
		}
	}

	/**
	 * クローズ処理。
	 */
	public void close() {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.err.println("コネクションのクローズ処理に失敗しました。：e=" + e.getMessage());
			}
		}
	}
}
