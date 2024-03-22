package engineers_gate_java.extra.step1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * CSVファイルの参照サンプル。
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
				System.out.println(member);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
