import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	static Scanner input = new Scanner(System.in);

	public static void lalala() {
		ArrayList<String> Menu_cards = new ArrayList<String>();
	 Menu_cards.add("Pare 500 euro ap tous upoloipous paiktes.");
	 Menu_cards.add(" Metakinisou 3 theseis piso.");
	 Menu_cards.add("Pigaine stous delfous. An anikei se kapoion i perioxi tou ofeileis 500 euro. An peraseis apo tin afetiria sou afairountai 1000euro.");
	 Menu_cards.add("Afksithikan oi aksies twn perioxwn pou katexeis pare 250 euro.");
	 Menu_cards.add("An o epomenos paiktis katexei perissoteres perioxes tou ofeileis 500 euro. Diaforetika sou ofeilei 500 euro.");
	 Menu_cards.add("Dose 600 euro stous upoloipous paiktes.");
	 Menu_cards.add("Kinisou 2 theseis mprosta.");
     Menu_cards.add("An to epipedo duskolias einai eukolo sou afairountai 5000 euro.");
	 Menu_cards.add("An to epipedo duskolias einai metrio ofeileis 5000 euro se enan apo tous paiktes. Dikaiousai na dialekseis.");
	 Menu_cards.add("An to epipedo duskolias einai duskolo kai katexeis 5 i perissoteres perioxes xaneis 1000 euro. Allios kerdizeis 1000 euro.");
	 Menu_cards.add("Dikaiousai na agoraseis mia mi katexomeni perioxi xwris na apantiseis kapoia erotisi.");
	 Menu_cards.add("An katexeis panw apo 4 perioxes pairneis 700 euro apo tous upoloipous paiktes. Diaforetika dineis 700 euro stous upoloipous paiktes.");
	}

	static Random dicenumber = new Random();

	public static boolean buy() {
		System.out.println("Theleis na agoraseis tin perioxi ?Dektes apantiseis:(Nai/Oxi)");
		String answer = input.nextLine();
		if (answer == "Nai") {
			return true;
		} else {
			return false;
		}
	}

	public static int roll_1() {
		int dice;
		dice = 1 + dicenumber.nextInt(6);
		return dice;
	}

	public static void roll_easy(int i, Player[] arr) {
		if (i == 0) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Easy.easyQ1(arr[i].getPos() - 1);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Easy.easyQ2(arr[i].getPos() - 7);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Easy.easyQ3(arr[i].getPos() - 13);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Easy.easyQ3(arr[i].getPos() - 19);
			}
		} else if (i == 1) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Easy.easyQ1(arr[i].getPos() + 4);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Easy.easyQ2(arr[i].getPos() - 2);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Easy.easyQ3(arr[i].getPos() - 8);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Easy.easyQ4(arr[i].getPos() - 14);
			} else if (i == 2) {
				if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
					Easy.easyQ1(arr[i].getPos() + 9);
				} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
					Easy.easyQ2(arr[i].getPos() + 3);
				} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
					Easy.easyQ3(arr[i].getPos() - 3);
				} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
					Easy.easyQ4(arr[i].getPos() - 9);
				}
			} else if (i == 3) {
				if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
					Easy.easyQ1(arr[i].getPos() + 14);
				} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
					Easy.easyQ2(arr[i].getPos() + 8);
				} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
					Easy.easyQ3(arr[i].getPos() + 2);
				} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
					Easy.easyQ4(arr[i].getPos() - 4);
				}
			}
		}
	}

	public static void roll_normal(int i, Player[] arr) {
		if (i == 0) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Normal.normalQ1(arr[i].getPos() - 1);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Normal.normalQ2(arr[i].getPos() - 7);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Normal.normalQ3(arr[i].getPos() - 13);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Normal.normalQ4(arr[i].getPos() - 19);
			}
		} else if (i == 1) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Normal.normalQ1(arr[i].getPos() + 4);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Normal.normalQ2(arr[i].getPos() - 2);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Normal.normalQ3(arr[i].getPos() - 8);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Normal.normalQ4(arr[i].getPos() - 14);
			}
		} else if (i == 2) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Normal.normalQ1(arr[i].getPos() + 9);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Normal.normalQ2(arr[i].getPos() + 3);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Normal.normalQ3(arr[i].getPos() - 3);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Normal.normalQ4(arr[i].getPos() - 9);
			}
		} else if (i == 3) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Normal.normalQ1(arr[i].getPos() + 14);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Normal.normalQ2(arr[i].getPos() + 8);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Normal.normalQ3(arr[i].getPos() + 2);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Normal.normalQ4(arr[i].getPos() - 4);
			}
		}
	}

	public static void roll_hard(int i, Player[] arr) {
		if (i == 0) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Hard.hardQ1(arr[i].getPos() - 1);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Hard.hardQ2(arr[i].getPos() - 7);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Hard.hardQ3(arr[i].getPos() - 13);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Hard.hardQ4(arr[i].getPos() - 19);
			}
		} else if (i == 1) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Hard.hardQ1(arr[i].getPos() + 4);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Hard.hardQ2(arr[i].getPos() - 2);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Hard.hardQ3(arr[i].getPos() - 8);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Hard.hardQ4(arr[i].getPos() - 14);
			}
		} else if (i == 2) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Hard.hardQ1(arr[i].getPos() + 9);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Hard.hardQ2(arr[i].getPos() + 3);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Hard.hardQ3(arr[i].getPos() - 3);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Hard.hardQ4(arr[i].getPos() - 9);
			}
		} else if (i == 3) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Hard.hardQ1(arr[i].getPos() + 14);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Hard.hardQ2(arr[i].getPos() + 8);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Hard.hardQ3(arr[i].getPos() + 2);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23) {
				Hard.hardQ4(arr[i].getPos() - 4);
			}
		}
	}

	public static int roll_3() {
		int dice;
		dice = 1 + dicenumber.nextInt(11);
		return dice;
	}

	public static int move(int pos) {
		pos = pos + roll_1();
		return pos;

	}

	public static String levelfinder(int i, Player[] arr) {
		String level;
		if (arr[i].getRound() == 1) {
			level = "easy";
		} else if (arr[i].getRound() == 2) {
			level = "normal";
		} else {
			level = "hard";
		}
		return level;
	}
}