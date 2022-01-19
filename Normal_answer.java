package paketolamp;

import java.util.Scanner;

public class Normal_answer {
	static Scanner input = new Scanner(System.in);

	public static boolean show_answer(int i, Player[] arr) { // Emfanizei tis epiloges gia tin apantisi tis erotisis,
																// sto deutero epipedo diskolias
																// Diavazei tin apanthsh kai thn elegxei
																// gia ton kathe paikti
		boolean answ = false;
		if (i == 0) {
			if (arr[i].getPos() <= 5) {
				System.out.println("Oi epiloges einai : " + Normal.normala1(arr[i].getPos() - 1));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
					System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
					System.out.println("Apantise ksana");
					answer = input.nextLine();
				}
				if (Normal.normalc1(arr[i].getPos() - 1).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 11) {
				System.out.println("Oi epiloges einai : " + Normal.normala2(arr[i].getPos() - 7));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc2(arr[i].getPos() - 7).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 17) {
				System.out.println("Oi epiloges einai : " + Normal.normala3(arr[i].getPos() - 13));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc3(arr[i].getPos() - 13).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else {
				System.out.println("Oi epiloges einai : " + Normal.normala4(arr[i].getPos() - 19));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc4(arr[i].getPos() - 19).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			}
		}
		if (i == 1) {
			if (arr[i].getPos() <= 5) {
				System.out.println("Oi epiloges einai :" + Normal.normala1(arr[i].getPos() + 4));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc1(arr[i].getPos() + 4).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 11) {
				System.out.println("Oi epiloges einai : " + Normal.normala2(arr[i].getPos() - 2));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc2(arr[i].getPos() - 2).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 17) {
				System.out.println("Oi epiloges einai : " + Normal.normala3(arr[i].getPos() - 8));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc3(arr[i].getPos() - 8).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else {
				System.out.println("Oi epiloges einai : " + Normal.normala4(arr[i].getPos() - 14));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc4(arr[i].getPos() - 14).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			}
		}
		if (i == 2) {
			if (arr[i].getPos() <= 5) {
				System.out.println("Oi epiloges einai : " + Normal.normala1(arr[i].getPos() + 9));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc1(arr[i].getPos() + 9).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 11) {
				System.out.println("Oi epiloges einai : " + Normal.normala2(arr[i].getPos() + 3));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc2(arr[i].getPos() + 3).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 17) {
				System.out.println("Oi epiloges einai : " + Normal.normala3(arr[i].getPos() - 3));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc3(arr[i].getPos() - 3).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else {
				System.out.println("Oi epiloges einai : " + Normal.normala4(arr[i].getPos() - 9));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc4(arr[i].getPos() - 9).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			}
		}
		if (i == 3) {
			if (arr[i].getPos() <= 5) {
				System.out.println("Oi epiloges einai : " + Normal.normala1(arr[i].getPos() + 14));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc1(arr[i].getPos() + 14).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 11) {
				System.out.println("Oi epiloges einai : " + Normal.normala2(arr[i].getPos() + 8));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc2(arr[i].getPos() + 8).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else if (arr[i].getPos() <= 17) {
				System.out.println("Oi epiloges einai : " + Normal.normala3(arr[i].getPos() + 2));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc3(arr[i].getPos() + 2).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			} else {
				System.out.println("Oi epiloges einai : " + Normal.normala4(arr[i].getPos() - 4));
				System.out.println("Epelexe tin apantisi sou.");
				String answer = input.nextLine();
				while (answer.compareTo("a")!=0 && answer.compareTo("b")!=0 && answer.compareTo("g")!=0) {
									System.out.println("Edwses mi diathesimi apantisi. Dektes apantiseis mono (a/b/g).");
									System.out.println("Apantise ksana");
									answer = input.nextLine();
				}
				if (Normal.normalc4(arr[i].getPos() - 4).equals(answer)) {
					return answ = true;
				} else {
					return answ = false;
				}
			}
		}
		return answ;
	}
}
