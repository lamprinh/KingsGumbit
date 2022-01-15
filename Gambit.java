import java.util.Scanner;

public class Gambit {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("King's Gambit");
		int num = howManyPlayers();
		Player arr[] = constructPlayers(num);
		setNames(num, arr);
		// setWallet(num, arr);
		System.out.println("Let's play");
		for (int i = 0; i < num; i++) {
			Bank.shareMoney(arr, i);
		}
		input.nextLine();
		Hard h = new Hard();
		Easy e = new Easy();
		Normal n = new Normal();
		int r = 0;
		while (r < 3) { // ελεχγω αν ειναι η σωστη λουπα
			r = setRound(r);
			System.out.println("Round " + r); // να αλλαζει οταν ενας παικτης αλλαζει γυρο οταν φτασει στο 24
			// ++ οταν φτασει στο 24 να καλειται η μεθοδος που του δινει χρηματα
			for (int i = 0; i < num; i++) {
				System.out.println(arr[i].getCharacter() + "roll the dice");
				input.nextLine();
				int m = Game.roll_1();
				System.out.println(m);

				arr[i].pos += m; // κοιταω μηπως χρειαζεται η σετπος
				// question
				if (arr[i].getRound() == 1) {
					Game.roll_easy(i, arr);
					// Easy_answer.show_answer(arr,i);
					// boolean answer = Easy_answer.Check_Answer(arr, i,
					// Easy_answer.show_answer(arr,i);
					// if (answer) {
					// if (Bank.King_area[i] == 9) {
					// e.givemoney(i,arr);
					// e.buyProperty(i,arr);
					// } else {
					// e.transfer(i, i0, arr);
					// }
					// } else {
					// if (Bank.King_area[i] == 9) {
					// e.takeMoney(i, arr);
					// } else {
					// e.transfer(i, i0, arr);
					// }
					// }
				} else if (arr[i].getRound() == 2) {
					boolean answer = Normal_answer.show_answer(i, arr);
					if (answer) {
						if (Bank.King_area[i] == 9) {
							n.giveMoney(i, arr);
							n.buyProperty(i, arr);
						} else {
							n.transfer(i, arr);
						}
					} else {
						if (Bank.King_area[i] == 9) {
							n.takeMoney(i, arr);
						} else {
							n.transfer(i, arr);
						}
					}
				} else {
					Hard_answer.show_answer(i, arr);
					boolean answer = Hard_answer.Check_Answer(arr, i, Hard_answer.show_answer(i, arr));
					if (answer) {
						if (Bank.King_area[i] == 9) {
							h.giveMoney(i, arr);
							h.buyProperty(i, arr);
						} else {
							h.transfer(i, arr);
						}
					} else {
						if (Bank.King_area[i] == 9) {
							h.takeMoney(i, arr);
						} else {
							h.transfer(i, arr);
						}
					}
				}

				if (arr[i].pos == 6 || arr[i].pos == 12 || arr[i].pos == 18) {

				}

				// φτιαχνω ιφ που να σε στελνει στην αφετηρια

			}
			System.out.println("End of round " + r);
			setRounds(num, arr, r);

		}
		System.out.println("End of game");
		System.out.println("The winner is:" + winner(arr));
	}

	public static String winner(Player[] arr) {
		int max = 0;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getWallet() > max) {
				max = arr[i].getWallet();
				k = i;
			}
		}
		return arr[k].getCharacter();
	}

	public static int howManyPlayers() {
		System.out.println("Please insert the number of players");
		int num = input.nextInt();
		return num;
	}

	public static Player[] constructPlayers(int n) {

		Player[] pAr = new Player[4];
		if (n == 2) {
			Player p1 = new Player();
			Player p2 = new Player();
			pAr[0] = p1;
			pAr[1] = p2;
		} else if (n == 3) {
			Player p1 = new Player();
			Player p2 = new Player();
			Player p3 = new Player();
			pAr[0] = p1;
			pAr[1] = p2;
			pAr[2] = p3;
		} else if (n == 4) {
			Player p1 = new Player();
			Player p2 = new Player();
			Player p3 = new Player();
			Player p4 = new Player();
			pAr[0] = p1;
			pAr[1] = p2;
			pAr[2] = p3;
			pAr[3] = p4;
		} else {
			System.out.println("error");
		}

		return pAr;
	}

	public static void setNames(int num, Player[] arr) {
		int i;
		for (i = 0; i < num; i++) {
			System.out.println("Player " + (i + 1) + " ,please type your name");
			String c = input.next();
			arr[i].setCharacter(c);
		}
	}

	public static void setWallet(int num, Player[] arr) {
		int i;
		for (i = 0; i < num; i++) {
			arr[i].setWallet(1000);
		}
	}

	public static int setRound(int r) {
		return r += 1;
	}

	public static void setRounds(int num, Player[] arr, int r) {
		int i;
		for (i = 0; i < num; i++) {
			arr[i].setRound(r + 1);
		}
	}
}
