/* H klasi hard_asnwer xrisomopoieitai gia na dexetai tis apantiseis ton paixton stis duskoles
*  erotiseis kai na tis sugkrinei me tis sostes poy vriskontai sth klasi Hard stin antistoixi lista 
*/

import java.util.Scanner;

public class Hard_answer {
	static Scanner input = new Scanner(System.in);

	//zitaei kai emfanizei tin apantisi tou paixti otan xreiastei
	public static String show_answer(int i, Player[] arr) {
		System.out.println("Paixti " + arr[i].getCharacter() + " apantise tin erotisi");
		String answer = input.nextLine();
		System.out.println("H apantisi sou " + arr[i].getCharacter() + " einai :" + answer);
		return answer;
	}

	//sugrkinei tis apantiseis tis listas me tis apantisis ton paixton kai epistrefei an apantisan sosta i oxi
	public static boolean Check_Answer(Player[] arr, int i, String answer) {
		boolean flag = false;
		int x = arr[i].getPos();
		if (i == 0) {
			if (x <= 5) {
				if (Hard.hardc1(x - 1).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) {
				if (Hard.hardc2(x - 7).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 17) {
				if (Hard.hardc3(x - 13).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else {
				if (Hard.hardc4(x - 19).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		} else if (i == 1) {
			if (x <= 5) {
				if (Hard.hardc1(x + 4).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) {
				if (Hard.hardc2(x - 2).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 17) {
				if (Hard.hardc3(x - 8).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else {
				if (Hard.hardc4(x - 14).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		} else if (i == 2) {
			if (x <= 6) {
				if (Hard.hardc1(x + 9).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) {
				if (Hard.hardc2(x + 3).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 16) {
				if (Hard.hardc3(x - 3).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else {
				if (Hard.hardc4(x - 9).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		} else {
			if (x <= 6) {
				if (Hard.hardc1(x + 14).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 11) {
				if (Hard.hardc2(x + 8).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else if (x <= 16) {
				if (Hard.hardc3(x + 2).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			} else {
				if (Hard.hardc4(x - 4).equals(answer)) {
					flag = true;
					return flag;
				} else {
					return flag;
				}
			}
		}
	}
}
