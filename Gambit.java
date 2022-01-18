import java.util.Scanner;

public class Gambit {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("King's Gambit");
		int num = howManyPlayers();
		Player arr[] = constructPlayers(num);
		setNames(num, arr);
		setWallet(num, arr);
		System.out.println("Let's play");
		// Normal n = new Normal();
		// Normal n = new Normal(normal_q1, normal_q2, normal_q3, normal_q4, normal_a1,
		// normal_a2, normal_a3, normal_a4,
		// normal_correct1, normal_correct2, normal_correct3, normal_correct4);
		input.nextLine();// oa?iioia ai aeiae c ouooc aioiec
		// Easy e = new Easy();
		// Hard h = new Hard();

		int max = 0;
		while (max < 3) { // aea?au ai aeiae c ouooc eio?a
			max = setRound(max);
			System.out.println("Round " + max); // ia aeea?ae ioai aiao ?aeeoco aeea?ae aoni ioai ooaoae ooi 24
			// ++ ioai ooaoae ooi 24 ia eaeaeoae c iaeiaio ?io oio aeiae ?nciaoa
			for (int i = 0; i < num; i++) {
				System.out.println(arr[i].getCharacter() + " press the enter button to roll the dice");
				input.nextLine();
				int m = Game.roll_1();
				System.out.println(m);
				arr[i].setPos(m);
				System.out.println(arr[i].getCharacter() +  " βρίσκεσαι στη θέση " + arr[i].getPos());
				if (arr[i].getPos() == 24) {
					arr[i].setPos(0);
					arr[i].setRound(arr[i].getRound() + 1);
					Bank.salary(i, arr);
					System.out.println("Είσαι στην αφετηρία βρίσκεσαι στην θέση 0" + arr[i].getCharacter());
				} else {
					if (arr[i].getPos() > 24) {
						int w = arr[i].getPos() - 24;
						arr[i].setPos(w);
						arr[i].setRound(arr[i].getRound() + 1);
						Bank.salary(i, arr);
						System.out.println(arr[i].getCharacter() + "Πέρασες την αφετηρία βρίσκεσαι στην θέση " + arr[i].getPos());
					}
					if (arr[i].getRound() == 1) {
						if (arr[i].getPos() == 6 || arr[i].getPos() == 12 || arr[i].getPos() == 18) {
							int x = Game.roll_3();
							if (x == 1) {
								Menucards.Menu1(500, arr, i);
							} else if (x == 2) {
								Menucards.Menu2(i, arr);
							} else if (x == 3) {
								Menucards.Menu3(7, arr, i);
							} else if (x == 4) {
								Menucards.Menu4(250, arr, i);
							} else if (x == 5) {
								if (i == 3) {
									Menucards.Menu5(500, arr, m, 0);
								} else {
									Menucards.Menu5(500, arr, i, i + 1);
								}
							} else if (x == 6) {
								Menucards.Menu6(arr, i, 600);
							} else if (x == 7) {
								Menucards.Menu7(arr, i);
							} else if (x == 8) {
								Menucards.Menu8(i, arr);
							} else if (x == 9) {
							   Menucards.Menu9(i, arr);
							} else if (x == 10) {
								Menucards.Menu10(i, Bank.King_area, arr);
							} else if (x == 11) {
								Menucards.Menu11(arr, i);
							} else if (x == 12) {
								Menucards.Menu12(arr, i, 700, 4);
							}
						} else {
							if (Bank.King_Area[arr[i].getPos()] == i ) {
							 System.out.println(+ arr[i].getCharacter() + " η περιοχή σου ανήκει δεν χρειάζεται να απαντήσεις σε κάποια ερώτηση.");
							} else { Game.roll_easy(i, arr);
							String ans = Easy_answers.show_answer(arr, i);
							boolean answer = Easy_answers.Check_Answer(arr, i, ans);
							if (answer) {
								System.out.println("BRAVO SOU");
							} else {
								System.out.println("sad");
							}
							if (answer) {
								if (Bank.King_area[i] == 9) {
									Easy.giveMoney(i, arr);
									Easy.buyProperty(i, arr);
								} else {
									Easy.transfer(i, arr);
								}
							} else {
								if (Bank.King_area[i] == 9) {
									Easy.takeMoney(i, arr);
								} else {
									Easy.transfer(i, arr);
								}
							}
						}
					} else if (arr[i].getRound() == 2) {
						if (arr[i].getPos() == 6 || arr[i].getPos() == 12 || arr[i].getPos() == 18) {
							int x = Game.roll_3();
							if (x == 1) {
								Menucards.Menu1(500, arr, i);
							} else if (x == 2) {
								Menucards.Menu2(i, arr);
							} else if (x == 3) {
								Menucards.Menu3(7, arr, i);
							} else if (x == 4) {
								Menucards.Menu4(250, arr, i);
							} else if (x == 5) {
								if (i == 3) {
									Menucards.Menu5(500, arr, m, 0);
								} else {
									Menucards.Menu5(500, arr, i, i + 1);
								}
							} else if (x == 6) {
								Menucards.Menu6(arr, i, 600);
							} else if (x == 7) {
								Menucards.Menu7(arr, i);
							} else if (x == 8) {
								Menucards.Menu8(i, arr);
							} else if (x == 9) {
								Menucards.Menu9(i, arr);
							} else if (x == 10) {
								Menucards.Menu10(i, Bank.King_area, arr);
							} else if (x == 11) {
								Menucards.Menu11(arr, i);
							} else if (x == 12) {
								Menucards.Menu12(arr, i, 700, 4);
							}
						} else {
							if (Bank.King_Area[arr[i].getPos()] == i ) {
									System.out.println(+ arr[i].getCharacter() + " η περιοχή σου ανήκει δεν χρειάζεται να απαντήσεις σε κάποια ερώτηση.");
							} else {
							Game.roll_normal(i, arr);
							boolean answer = Normal_answer.show_answer(i, arr);
							if (answer) {
								if (Bank.King_area[i] == 9) {
									Normal.giveMoney(i, arr);
									Normal.buyProperty(i, arr);
								} else {
									Normal.transfer(i, arr);
								}
							} else {
								if (Bank.King_area[i] == 9) {
									Normal.takeMoney(i, arr);
								} else {
									Normal.transfer(i, arr);
								}
							}
						}
					} else if (arr[i].getRound() == 3) {
						if (arr[i].pos == 6 || arr[i].pos == 12 || arr[i].pos == 18) {
							int x = Game.roll_3();
							if (x == 1) {
								Menucards.Menu1(500, arr, i);
							} else if (x == 2) {
								Menucards.Menu2(i, arr);
							} else if (x == 3) {
								Menucards.Menu3(7, arr, i);
							} else if (x == 4) {
								Menucards.Menu4(250, arr, i);
							} else if (x == 5) {
								if (i == 3) {
									Menucards.Menu5(500, arr, m, 0);
								} else {
									Menucards.Menu5(500, arr, i, i + 1);
								}
							} else if (x == 6) {
								Menucards.Menu6(arr, i, 600);
							} else if (x == 7) {
								Menucards.Menu7(arr, i);
							} else if (x == 8) {
								Menucards.Menu8(i, arr);
							} else if (x == 9) {
								Menucards.Menu9(i, arr);
							} else if (x == 10) {
								Menucards.Menu10(i, Bank.King_area, arr);
							} else if (x == 11) {
								Menucards.Menu11(arr, i);
							} else if (x == 12) {
								Menucards.Menu12(arr, i, 700, 4);
							}
						} else {
							if (Bank.King_Area[arr[i].getPos()] == i ) {
							 System.out.println(+ arr[i].getCharacter() + " η περιοχή σου ανήκει δεν χρειάζεται να απαντήσεις σε κάποια ερώτηση.");
							} else {
							Hard_answer.show_answer(i, arr);
							boolean answer = Hard_answer.Check_Answer(arr, i, Hard_answer.show_answer(i, arr));
							if (answer) {
								if (Bank.King_area[i] == 9) {
									Hard.giveMoney(i, arr);
									Hard.buyProperty(i, arr);
								} else {
									Hard.transfer(i, arr);
								}
							} else {
								if (Bank.King_area[i] == 9) {
									Hard.takeMoney(i, arr);
								} else {
									Hard.transfer(i, arr);
								}
							}
						}
					}
				}
			}
			max = maxRound(arr);
			// System.out.println("End of round " + r);
			// setRounds(num, arr, r);

		}
		System.out.println("End of game");
		System.out.println("The winner is:" + winner(arr));
	}

	public static int maxRound(Player[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getRound() > max) {
				max = arr[i].getRound();
			}
		}
		return max;
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

		Player[] pAr = new Player[n];
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

	// public static void setRounds(int num, Player[] arr, int r) {
	// int i;
	// for (i = 0; i < num; i++) {
	// arr[i].setRound(r + 1);
	// ?nuiea oi ooe?oe Yiao aaouo;
	// }
	// }
}

