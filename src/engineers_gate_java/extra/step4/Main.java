package engineers_gate_java.extra.step4;

import java.sql.SQLException;
import java.util.List;

import engineers_gate_java.extra.step4.entity.Members;

/**
 * 処理内容はstep3と変わらず、DbManagerの内部処理をJPAのライブラリを使うよう修正。
 *
 * @author tomo-sato
 */
public class Main {

	/**
	 * main関数
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) throws SQLException {

		// CSVファイルからメンバーリストを取得する。
		List<Members> membersList = CsvReader.readMembersData();

		try (DbManager dbManager = new DbManager();) {
			// DBに保存する。
			dbManager.insert(membersList);
		}
	}
}
