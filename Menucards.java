import java.util.Scanner;

public class Menucards {
	public static void Menu1(int amount, Player[] arr, int i) {
		arr[i].getWallet();
		arr[i].setWallet(3 * amount);
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != p) {
				arr[j].getWallet();
				arr[j].setWallet(-amount);
				System.out.println("O παίκτης  " + arr[j].getCharacter() + "  έχει μείωση στο πορτοφόλι του κατά  "
						+ amount + " ευρώ και πλέον έχει " + arr[j].getWallet() + " ευρώ");
			}
		}
		System.out.println("O παίκτης  " + p.getCharacter() + "  έχει αύξηση στο πορτοφόλι του κατά " + 3 * amount
				+ " ευρώ και πλέον έχει " + p.getWallet() + " ευρώ");
	}

	public static void Menu2(int i, Player[] arr) {
		Player p = arr[i];
		p.getPos();
		p.setPos(-3);
		System.out.println("Παίκτη  " + p.getCharacter() + " βρίσκεσαι στην θέση " + p.getPos() + ".");
	}

	public static void Menu3(int pos, Player[] arr, int i) {
		Player p = arr[i];
		int f_pos = p.getPos();
		int l_pos = p.getPos();
		if (pos > f_pos) {
			p.setPos(pos - f_pos);
			System.out.println("O παίκτης  " + p.getCharacter() + " βρίσκεται στην θέση " + p.getPos() + ".");
		} else if (pos < f_pos) {
			p.setPos(pos - f_pos);
			p.setWallet(-1000);
			System.out.println("Ο παίκτης  " + p.getCharacter()
					+ " περνάει από την αφετηρία αλλά δεν δικαιούται να πάρει το χρηματικό ποσό");
			System.out.println("Ο παίκτης  " + p.getCharacter() + " βρίσκεται στη θέση " + p.getPos() + ".");
		}
		for (int j = 0; j < arr.length; j++) {
			if (Bank.King_area[l_pos] == j && i != j) {
				p.setWallet(-500);
				arr[j].setWallet(500);
				System.out.println("Αφαιρείται από τον παίκτη " + p.getCharacter()
						+ " το ποσό των 500 ευρώ και μεταφέρεται στον παίκτη  " + arr[j].getCharacter()
						+ " . Η αξία των πορτοφολιών τους πλέον ισούται με" + p.getWallet() + arr[j].getWallet()
						+ " αντίστοιχα.");
			}
		}
	}

	public static void Menu4(int amount, Player[] arr, int j) {
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == j) {
				arr[j].setWallet(amount);
				Bank.setMoney(-amount);
				System.out.println(" O παίκτης  " + arr[j].getCharacter() + " παίρνει" + amount + " ευρώ και πλέον έχει"
						+ arr[j].getWallet() + " ευρώ.");
				break;
			}
		}
	}

	public static void Menu5(int amount, Player[] arr, int j, int k) {
		int counterp = 0;
		int counterp1 = 0;
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == j) {
				counterp++;
			} else if (Bank.King_area[i] == k) {
				counterp1++;
			}
		}
		if (counterp > counterp1) {
			arr[j].setWallet(amount);
			arr[k].setWallet(-amount);
			System.out.println("O παίκτης  " + arr[j].getCharacter() + " κατέχει περισσότερες περιοχές από τον παίκτη "
					+ arr[k].getCharacter() + " Και αυξάνεται το πορτοφόλι του κατά " + amount + " ευρώ. Πλέον έχει "
					+ arr[j].getWallet());
			System.out.println("O παίκτης  " + arr[k].getCharacter() + " κατέχει λιγότερες περιοχές από τον παίκτη "
					+ arr[j].getCharacter() + " Και μειώνεται το πορτοφόλι του κατά " + amount + " ευρώ. Πλέον έχει "
					+ arr[k].getWallet());
		} else if (counterp < counterp1) {
			arr[j].setWallet(-amount);
			arr[k].setWallet(amount);
			System.out.println("O παίκτης  " + arr[k].getCharacter() + " κατέχει περισσότερες  περιοχές από τον παίκτη "
					+ arr[j].getCharacter() + " Και αυξάνεται το πορτοφόλι του κατά " + amount + " ευρώ. Πλέον έχει "
					+ arr[k].getWallet());
			System.out.println("O παίκτης  " + arr[j].getCharacter() + " κατέχει λιγότερες περιοχές από τον παίκτη "
					+ arr[k].getCharacter() + " Και μειώνεται το πορτοφόλι του κατά " + amount + " ευρώ. Πλέον έχει "
					+ arr[j].getWallet());

		}
	}

	public static void Menu7(Player[] arr, int i) {
		arr[i].setPos(2);
		System.out.println("O παίκτης" + arr[i].getCharacter() + " βρίσκεται στην θέση" + arr[i].getPos() + ".");
	}

	public static void Menu8(int i, Player[] arr) {
		if (Game.levelfinder(i, arr).equals("easy")) {
			arr[i].setWallet(5000);
			Bank.setMoney(-5000);
			System.out.println(" To πορτοφόλι του παίκτη" + arr[i].getCharacter()
					+ " αυξήθηκε κατά 5000 ευρώ και πλέον ισούται με" + arr[i].getWallet() + " ευρώ.");
		} else {
			System.out.println("O παίκτης" + arr[i].getCharacter() + " δεν βρίσκεται στο εύκολο επίπεδο.");
		}
	}

	public static void Menu9(int i, Player[] arr) {
		Scanner input = new Scanner(System.in);
		if (Game.levelfinder(i, arr).equals("normal")) {
			System.out.println("Choose a player.");
			int z = input.nextInt();
			arr[i].setWallet(-2000);
			int w = arr[z].wallet + 2000;
			arr[z].setWallet(2000);
			System.out.println(" O παίκτης  " + arr[z].getCharacter() + " παίρνει 2000 ευρώ και πλέον έχει"
					+ arr[z].getWallet() + " ευρώ.");
			System.out.println(" O παίκτης  " + arr[i].getCharacter() + " χάνει 2000 ευρώ και πλέον έχει"
					+ arr[i].getWallet() + " ευρώ.");
		} else {
			System.out.println("O παίκτης" + arr[i].getCharacter() + " δεν βρίσκεται στο μέτριο επίπεδο.");

		}
	}

	public static void Menu10(int x, int[] King_area, Player[] arr) {
		if (Game.levelfinder(x, arr).equals("hard")) {
			int belong = 0;
			for (int i = 0; i < King_area.length; i++) {
				if (King_area[i] != 9) {
					if (King_area[i] == x) {
						belong = belong += 1;
					}
				}
			}
			if (belong >= 5) {
				arr[x].setWallet(-1000);
				Bank.setMoney(1000);
				System.out.println("Ο παίκτης" + arr[x].getCharacter() + " χάνει από το πορτοφόλι του" + 1000 + "ευρώ");
			} else {
				arr[x].setWallet(1000);
				Bank.setMoney(-1000);
				System.out.println(
						"Ο παίκτης" + arr[x].getCharacter() + " προσθέτει στο το πορτοφόλι του" + 1000 + "ευρώ");
			}
		} else {
			System.out.println("O παίκτης" + arr[x].getCharacter() + " δεν βρίσκεται στο δύσκολο επίπεδο.");
		}
	}

	public static void Menu11(Player[] arr, int k) {
		Player p = arr[k];
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		int j = 0;
		int[] B = new int[20];
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == 9) {
				B[j] = i;
				flag = true;
				j++;
			}
		}
		if (flag) {
			System.out.println("Οι παρακάτω περιοχές είναι διαθέσιμες");
			for (int i = 0; i < B.length; i++) {
				System.out.println(+B[i]);
			}
		} else {
			System.out.println("Δεν υπάρχει διαθέσιμη περιοχή.");
		}
		System.out.println("Θα ήθελες να αγοράσεις κάποια περιοχή;");
		String answer = input.nextLine();
		if (answer.equals("YES")) {
			System.out.println("Διάλεξε ποία περιοχή από τις διαθέσιμες θες να αγοράσεις.");
			int area = input.nextInt();
			p.setWallet(-Bank.Price[area]);
			Bank.King_area[area] = k;
			Bank.setMoney(Bank.Price[area]);
			System.out.println(
					"Ο παίκτης " + p.getCharacter() + " χάνει από το πορτοφόλι του " + Bank.Price[area] + " ευρώ");
			System.out.println("O παίκτης " + p.getCharacter() + " αγόρασε την περιοχή " + Bank.Prop[area] + ".");
		} else {
			System.out.println(" Ο παίκτης  " + p.getCharacter() + " αποφάσισε να μην αγοράσει κάποια περιοχή.");
		}
	}

	public static void Menu6(Player[] arr, int i, int amount) {
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (j != i) {
				p.setWallet(-amount);
				System.out.println("Ο παίκτης" + p.getCharacter() + "χάνει από το πορτοφόλι του" + amount + " ευρώ ");
				arr[j].setWallet(amount);
				System.out.println(
						"Ο παίκτης" + arr[j].getCharacter() + "προσθέτει στο πορτοφόλι του" + amount + " ευρώ ");
			}
		}
	}

	public static void Menu12(Player[] arr, int i, int amount, int sum) {
		Player p = arr[i];
		int counter = 0;
		for (int m = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[m] == i) {
				counter++;
			}
		}
		if (counter >= sum) {
			for (int j = 0; j < arr.length; j++) {
				if (j != i) {
					p.setWallet(amount);
					arr[j].setWallet(-amount);
					System.out.println(
							"Ο παίκτης " + p.getCharacter() + " προσθέτει στο το πορτοφόλι του " + amount + " ευρώ");
					System.out.println("Ο παίκτης " + arr[j].getCharacter() + " χάνει " + amount + " ευρώ");
				}
			}
		} else {
			for (int j = 0; j < arr.length; j++) {
				p.setWallet(-amount);
				arr[j].setWallet(amount);
				System.out.println(
						"Ο παίκτης " + arr[j].getCharacter() + " προσθέτει στο το πορτοφόλι του " + amount + " ευρώ");
				System.out.println("Ο παίκτης " + p.getCharacter() + " χάνει " + amount + " ευρώ");

			}

		}
	}
}
