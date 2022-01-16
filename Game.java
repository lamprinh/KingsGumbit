import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	static Scanner input = new Scanner(System.in);

	public static void lalala() {
		ArrayList<String> Menu_cards = new ArrayList<String>();
		Menu_cards.add("Πάρε χ ποσό από τους υπόλοιπους παίκτες");
		Menu_cards.add("Μετακινήσου 3 θέσεις πίσω");
		Menu_cards.add(
				"Πήγαινε στην χ περιοχή αν ανήκει σε κάποιον πλήρωσε το διπλάσιο απο το καθορισμένο πόσο. Σε περίπτωση που περάσεις από την αφετηρία δεν παίρνεις χρήματα.");
		Menu_cards.add("Αυξήθηκαν οι αξίες των περιοχών που κατέχεις πάρε χ ποσό.");
		Menu_cards.add(
				"Αν ο επόμενος παίκτης κατέχει περισσότερες περιοχές του οφείλεις χ ποσό, διαφορετικά σου οφείλει χ ποσό.");
		Menu_cards.add("Δώσε χ ποσό στους υπόλοιπους παίκτες.");
		Menu_cards.add("Κινήσου 2 θέσεις μπροστά και ξανά παίξε.");
		Menu_cards.add(
				"Αν το επίπεδο δυσκολίας είναι εύκολο την επόμενη φορά που θα περάσεις απο την αφετηρία πάρε το μισό χρηματικό ποσό.");
		Menu_cards.add(
				"Αν το επίπεδο δυσκολίας είναι μέτριο την επόμενη φορά που θα περάσεις από την αφετηρία δίνεις το μισό χρηματικό ποσό στον επόμενο παίκτη.");
		Menu_cards.add(
				"Αν το επίπεδο δυσκολίας είναι δύσκολο διάλεξε έναν από τους υπόλοιπους παίκτες ώστε να μη λάβει λεφτά από την αφετηρία.");
		Menu_cards.add("Δικαιούσαι να αγοράσεις μια μη κατεχόμενη περιοχή χωρίς να απαντήσεις σε κάποια ερώτηση.");
		Menu_cards.add(
				"Αν κατέχεις πάνω απο χ περιοχές, παίρνεις χ ποσό διαφορετικά δίνεις χ ποσό στους υπόλοιπους παίκτες.");
	}

	static Random dicenumber = new Random();

	public static boolean buy() {
		System.out.println("Would you like to buy this Area?(Yes/No)");
		String answer = input.nextLine();
		if (answer == "YES") {
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
