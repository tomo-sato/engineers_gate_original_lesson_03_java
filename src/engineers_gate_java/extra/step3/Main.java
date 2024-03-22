package engineers_gate_java.extra.step3;

import java.sql.SQLException;
import java.util.List;

/**
 * 処理内容はstep2と変わらず、CSVファイル読み込みとDB登録だが、処理の役割を分担。
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

		// CSVファイルからメンバーリストを取得する。
		List<Members> membersList = CsvReader.readMembersData();

		try (DbManager dbManager = new DbManager();) {
			// DBに保存する。
			dbManager.insert(membersList);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
