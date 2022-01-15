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
		while (r < 3) { // åëå÷ãù áí åéíáé ç óùóôç ëïõðá
			r = setRound(r);
			System.out.println("Round " + r); // íá áëëáæåé ïôáí åíáò ðáéêôçò áëëáæåé ãõñï ïôáí öôáóåé óôï 24
			// ++ ïôáí öôáóåé óôï 24 íá êáëåéôáé ç ìåèïäïò ðïõ ôïõ äéíåé ÷ñçìáôá
			for (int i = 0; i < num; i++) {
				System.out.println(arr[i].getCharacter() + "roll the dice");
				input.nextLine();
				int m = Game.roll_1();
				System.out.println(m);

				arr[i].pos += m; // êïéôáù ìçðùò ÷ñåéáæåôáé ç óåôðïò
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
							n.transfer(i, arr); // μαλλον η τρανσφερ δε χρειαζεται 2ο ορισμα 
							// θα βλεπω τον παικτη που εχε περιοχη μεσω του κινγκ_ερια
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

				// öôéá÷íù éö ðïõ íá óå óôåëíåé óôçí áöåôçñéá

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
