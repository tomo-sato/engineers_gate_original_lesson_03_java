package c_rank_level_up_problems.c_rank_02_string.step5;

import java.util.Scanner;

/**
 * STEP: 5 数字の文字列操作（時刻1）
 */
public class Main {
	public static void main(String[] args) {
		// Scannerはclose処理が必要なのでtry-with-resourcesで対応。
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			String[] arr = str.split(":");

			for (String s : arr) {
				System.out.println(Integer.parseInt(s));
			}
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
