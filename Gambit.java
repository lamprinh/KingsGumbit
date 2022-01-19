package paketolamp;

import java.util.Scanner;

public class Gambit {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("King's Gambit");
		Normal n = new Normal(); // dimiourgia antikeimenwn gia tis klaseis hard, normal kai easy
		Easy e = new Easy(); // gia na kalestoun oi abstract methodoi tis Bank pou periexoun
		Hard h = new Hard(); // oi klaseis autes
		Bank.setArea(); // klisi methodou gia gemisma tou pinaka setArea
		Bank.setNamesArray(); // klisi methodou gia gemisma tou pinaka setNamesArray
		Bank.setPricesArray(); // klisi methodou gia gemisma tou pinaka setPricesArray
		int num = howManyPlayers(); // klisi methodou pou dilonontai posoi paiktes tha paixoun
		Player arr[] = constructPlayers(num); // klisi constructor pou ftiaxnei ta antikeimena twn paiktwn
		setNames(num, arr); // klisi methodou pou dilonontai ta onomata twn paiktwn
		setWallet(num, arr); // klisi methodou gia gemisma portofoliwn paiktwn
								// stin enarxi tou paixnidiou
		System.out.println("Let's play ! ");
		input.nextLine();

		int max = 0;
		while (max <= 3) {
			for (int i = 0; i < num; i++) {
				System.out.println(arr[i].getCharacter() + " pata to koubi gia na rixeis to zari. ");
				input.nextLine();
				int m = Game.roll_1(); // klisi methodou gia na rixei o paiktis to zari
				System.out.println(m);
				arr[i].setPos(m); // klisi methodou pou tropopoiei thesi paikti
				if (arr[i].getPos() == 24) {
					arr[i].setPos(-24); // an o paiktis vrethei stinthesi 24
					arr[i].setRound(arr[i].getRound() + 1); // h thesi tou allazei se 0, allazei epipedo kai pairnei
															// xrimata apo tin trapeza
					Bank.salary(i, arr);
					System.out.println(arr[i].getCharacter() + " eisai sthn afethria");
				} else {
					if (arr[i].getPos() > 24) {
						arr[i].setPos(-24); // an o paiktis vrethei stinthesi 24
						arr[i].setRound(arr[i].getRound() + 1); // h thesi tou allazei se 0, allazei epipedo kai pairnei
																// xrimata apo tin trapeza
						Bank.salary(i, arr);
						System.out.println(
								arr[i].getCharacter() + "Perases thn afethria vriskesai sth thesh " + arr[i].getPos());
					}
					System.out.println(arr[i].getCharacter() + " vriskesai sth thesh " + arr[i].getPos());
					if (arr[i].getRound() == 1) {
						if (arr[i].getPos() == 6 || arr[i].getPos() == 12 || arr[i].getPos() == 18) {
							int x = Game.roll_3();
							if (x == 1) {
								Menucards.Menu1(500, arr, i);
							} else if (x == 2) {
								Menucards.Menu2(i, arr);
							} else if (x == 3) {
								Menucards.Menu3(8, arr, i);
							} else if (x == 4) {
								Menucards.Menu4(250, arr, i);
							} else if (x == 5) {
								if (arr.length == 4) {
									if (i == 3) {
									Menucards.Menu5(500, arr, i, 0);
									} else {
									Menucards.Menu5(500, arr, i, i + 1);
									}
									} else if (arr.length == 3) {
									if (i == 2) {
									Menucards.Menu5(500, arr, i, 0);
									} else {
									Menucards.Menu5(500, arr, i, i + 1);
									}
									} else {
									if (i == 1) {
									Menucards.Menu5(500, arr, i, 0);
									} else {
									Menucards.Menu5(500, arr, i, i + 1);
									}
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
							if (Bank.King_area[arr[i].getPos()] == i) {
								System.out.println(arr[i].getCharacter()
										+ " H perioxi pou briskesai sou anikei den dexesai erotisi");
							} else {
								Game.roll_easy(i, arr); // kelitai i methodos pou emfanizei tin erwtisi gia to epipedo
														// easy
								String ans = Easy_answers.show_answer(arr, i); // kaleitai i methodos pou epistrefei
																				// apantisi paikti
								while (ans.compareTo("s")!=0 && ans.compareTo("l")!=0) {
								   System.out.println("Edwses mi diathesimi apantisi. Apantise ksana.");
								   Game.roll_easy(i, arr);
								   ans = Easy_answers.show_answer(arr, i);
							   }
								boolean answer = Easy_answers.Check_Answer(arr, i, ans); // kaleitai i methodos pou
																							// epistrefei true/false
																							// analoga
																							// me to an apantise swsta o
																							// paiktis
								if (answer) {
									System.out.println("H apanthsh pou edwses htan swsth! ");
									e.giveMoney(i, arr);
								} else {
									System.out.println("H apanthsh pou edwses htan lathos! ");
									e.takeMoney(i, arr);
								}
							}
						}
					} else if (arr[i].getRound() == 2) {
						if (arr[i].getPos() == 6 || arr[i].getPos() == 12 || arr[i].getPos() == 18) {
							int x = Game.roll_3(); // kaleitai i methodos pou epistrefei arithmo entolis pou tha ginei
													// ston paikti
							if (x == 1) {
								Menucards.Menu1(500, arr, i);
							} else if (x == 2) {
								Menucards.Menu2(i, arr);
							} else if (x == 3) {
								Menucards.Menu3(7, arr, i);
							} else if (x == 4) {
								Menucards.Menu4(250, arr, i);
							} else if (x == 5) {
								if (arr.length == 4) {
									if (i == 3) {
									Menucards.Menu5(500, arr, i, 0);
									} else {
									Menucards.Menu5(500, arr, i, i + 1);
									}
									} else if (arr.length == 3) {
									if (i == 2) {
									Menucards.Menu5(500, arr, i, 0);
									} else {
									Menucards.Menu5(500, arr, i, i + 1);
									}
									} else {
									if (i == 1) {
									Menucards.Menu5(500, arr, i, 0);
									} else {
									Menucards.Menu5(500, arr, i, i + 1);
									}
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
							if (Bank.King_area[arr[i].getPos()] == i) {
								System.out.println(arr[i].getCharacter()
										+ "H perioxi pou briskesai sou anikei den dexesai erotisi");
							} else {
								Game.roll_normal(i, arr);
								boolean answer = Normal_answer.show_answer(i, arr);
								if (answer) {
									System.out.println("H apanthsh pou edwses htan swsth! ");
									n.giveMoney(i, arr);
								} else {
									System.out.println("H apanthsh pou edwses htan lathos! ");
									n.takeMoney(i, arr);
								}
							}
						}
					} else if (arr[i].getRound() == 3) {
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
								if (arr.length == 4) {
									if (i == 3) {
										Menucards.Menu5(500, arr, i, 0);
									} else {
										Menucards.Menu5(500, arr, i, i + 1);
									}
								} else if (arr.length == 3) {
									if (i == 2) {
										Menucards.Menu5(500, arr, i, 0);
									} else {
										Menucards.Menu5(500, arr, i, i + 1);
									}
								} else {
									if (i == 1) {
										Menucards.Menu5(500, arr, i, 0);
									} else {
										Menucards.Menu5(500, arr, i, i + 1);
									}
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
							if (Bank.King_area[arr[i].getPos()] == i) {
								System.out.println(arr[i].getCharacter()
										+ "H perioxi pou briskesai sou anikei den dexesai erotisi");
							} else {
								Game.roll_hard(i, arr);
								String ans = Hard_answer.show_answer(i, arr);
								boolean answer = Hard_answer.Check_Answer(arr, i, ans);
								if (answer) {
									System.out.println("H apanthsh pou edwses htan swsth! ");
									h.giveMoney(i, arr);
								} else {
									System.out.println("H apanthsh pou edwses htan lathos! ");
									h.transferFalse(i, arr);
								}
							}
						}
					}
				}
				max = maxRound(arr);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("To portofoli tou " + arr[i].getCharacter() + " exei " + arr[i].getWallet() + " eyro .");
		}
		System.out.println("End of game");
		System.out.println();
		System.out.println("The winner is: " + winner(arr));
		// }
	}

	public static int maxRound(Player[] arr) { // methodos pou allazei ton gyro pou trexei to paixnidi an enas paiktis
												// perasei tin afethria
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getRound() > max) {
				max = arr[i].getRound();
			}
		}
		return max;
	}

	public static String winner(Player[] arr) { // methodos pou vriskei ton nikiti analoga me to poso pou katafere na
												// sigedrwsei
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

	public static int howManyPlayers() { // methodos pou orizetai o arithmos paiktwn
		System.out.println("Parakalw dhlwse arithmo paiktwn pou tha paixoun. ");
		System.out.println("Epitrepta oria: 2-4 paiktes.");
		int num = input.nextInt();
		while (num < 2 || num > 4) {
			System.out.println("Parakalw epelekse swsto arithmo paiktwn.");
			System.out.println("Epitrepta oria: 2-4 paiktes.");
			num = input.nextInt();
		}
		return num;
	}

	public static Player[] constructPlayers(int n) { // construstor gia dimiourgia pinaka pou periexei antikeimena
														// paiktwn
		Player[] pAr = new Player[n]; // analoga me twn arithmo twn paiktwn
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

	public static void setNames(int num, Player[] arr) { // methodos pou orizei onomata paiktwn
		int i;
		for (i = 0; i < num; i++) {
			System.out.println("Paikth " + (i + 1) + " ,parakalw syblhrwse to onoma sou. ");
			String c = input.next();
			arr[i].setCharacter(c);
		}
	}

	public static void setWallet(int num, Player[] arr) { // methodos pou gemizei portofolia paiktwn
		int i;
		for (i = 0; i < num; i++) {
			arr[i].setWallet(15000);
		}
	}

	public static int setRound(int r) {
		return r += 1;
	}
}
