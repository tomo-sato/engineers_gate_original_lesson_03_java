package engineers_gate_java.extra.step4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import engineers_gate_java.extra.step4.entity.Members;

/**
 * CSVファイルの読み込み処理。
 *
 * @author tomo-sato
 */
public class CsvReader {

	/**
	 * CSVファイルを読み込み、メンバーリストを返す。
	 *
	 * @return メンバーリストを返す。
	 */
	public static List<Members> readMembersData() {
		List<Members> retMembersList = new ArrayList<>();

		try (FileInputStream fs = new FileInputStream("inputs\\sample.csv");
				InputStreamReader ir = new InputStreamReader(fs, "UTF-8");
				BufferedReader br = new BufferedReader(ir);
				Scanner scanner = new Scanner(br);
			) {

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

				Members member = new Members(id, name, age, address);
				retMembersList.add(member);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retMembersList;
	}
}
