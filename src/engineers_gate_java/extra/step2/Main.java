package engineers_gate_java.extra.step2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * CSVファイルを読み込みDBに保存。
 *
 * @author tomo-sato
 */
public class Main {

	// MySQLの接続情報
	/** データベースのURL */
	private static final String DB_URL = "jdbc:mysql://localhost:3306/eg_lesson";
	/** データベースのユーザー名 */
	private static final String DB_USER = "eg_sns_user";
	/** データベースのパスワード */
	private static final String DB_PASS = "eg_pass";

	/**
	 * main関数
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {

		try (FileInputStream fs = new FileInputStream("inputs\\sample.csv");
				InputStreamReader ir = new InputStreamReader(fs, "UTF-8");
				BufferedReader br = new BufferedReader(ir);
				Scanner scanner = new Scanner(br);
				Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			) {

			// SQLクエリ
			String sql = "INSERT INTO members (id, name, age, address) VALUES (?, ?, ?, ?)";

			// ヘッダーをスキップ。
			scanner.next();

			// 本文の読み込み。
			while (scanner.hasNext()) {
				// 1レコードの読み込み。
				String[] line = scanner.next().split(",");

				int id = Integer.parseInt(line[0]);
				String name = line[1];
				int age = Integer.parseInt(line[2]);
				String address = line[3];

				// メンバー生成。
				Members member = new Members(id, name, age, address);
				System.out.println(member);

				// PreparedStatementの作成。
				try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
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

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
