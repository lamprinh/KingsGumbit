package paketolamp;

import java.util.Scanner;

public class Easy_answers {
	static Scanner input = new Scanner(System.in);

	public static String show_answer(Player[] arr, int i) { // methodos pou kaleitai gia na dwsei apantisi o paiktis tin
															// ektipwnei kai tin epistrefei//
		System.out.println(arr[i].getCharacter() + " apantise stin erotisi.");
		String answer = input.nextLine();
		System.out.println("H apantisi tou paikti " + arr[i].getCharacter() + " einai " + answer + ".");
		return answer;
	}

	public static boolean Check_Answer(Player[] arr, int i, String answer) { // methodos pou elegxei gia kathe paikti se
																				// kathe katigoria an i apantisi pou
																				// edwse itan swsth//
		boolean flag = false;
		int x = arr[i].getPos();
		if (i == 0) { // 1os paiktis
			if (x <= 5) { // 1i katigoria//
				if (Easy.easyc1(x - 1).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) { // 2i katigoria//
				if (Easy.easyc2(x - 7).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 17) { // 3i katigoria//
				if (Easy.easyc3(x - 13).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else { // 4i katigoria//
				if (Easy.easyc4(x - 19).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		} else if (i == 1) { // 2os paiktis//
			if (x <= 5) { // 1i katigoria//
				if (Easy.easyc1(x + 4).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) { // 2i katigoria//
				if (Easy.easyc2(x - 2).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 17) { // 3i katigoria//
				if (Easy.easyc3(x - 8).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else { // 4i katigoria//
				if (Easy.easyc4(x - 14).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		} else if (i == 2) { // 3os paiktis//
			if (x <= 5) { // 1i katigoria//
				if (Easy.easyc1(x + 9).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) { // 2i katigoria//
				if (Easy.easyc2(x + 3).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 17) { // 3i katigoria//
				if (Easy.easyc3(x - 3).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else { // 4i katigoria//
				if (Easy.easyc4(x - 9).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		} else { // 4os paiktis//
			if (x <= 5) {// 1i katigoria//
				if (Easy.easyc1(x + 14).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) { // 2i katigoria//
				if (Easy.easyc2(x + 8).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 17) { // 3i katigoria//
				if (Easy.easyc3(x + 2).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else { // 4i katigoria//
				if (Easy.easyc4(x - 4).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		}
	}
}
