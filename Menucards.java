import java.util.Scanner;

public class Menucards {
	public static void Menu1(int amount, Player[] arr, int i) {
		int x = 3 * amount + arr[i].getWallet();
		arr[i].setWallet(x);
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != p) {
				int x1 = arr[j].getWallet() - amount;
				arr[j].setWallet(x1);
			}
		}
	}

	public static void Menu2(int i, Player[] arr) {
		Player p = arr[i];
		p.getPos();
		p.setPos(-3);
	}

	public static boolean Menu3(int pos, Player[] arr, int i) {
		Player p = arr[i];
		boolean flag = false;
		int f_pos = p.getPos();
		p.setPos(pos);
		int l_pos = p.getPos();
		if (f_pos > l_pos) {
			System.out.println(
					"Ο παίκτης" + p + " περνάει από την αφετηρία αλλά δεν δικαιούται να πάρει το χρηματικό ποσό");
			flag = true;
		}
		for (int j = 0; j < arr.length; j++) {
			if (Bank.King_area[l_pos] == j && i != j) {
				int w1 = p.getWallet() - 500;
				int w2 = arr[j].getWallet() + 500;
				p.setWallet(w1);
				arr[j].setWallet(w2);
			}
		}
		return flag;
	}

	public static void Menu4(int amount, Player[] arr, int j) {
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == j) {
				int w = arr[j].getWallet() + amount;
				arr[j].setWallet(w);
				Bank.setMoney(amount);
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
			int w = arr[j].getWallet() + amount;
			int w1 = arr[k].getWallet() - amount;
			arr[j].setWallet(w);
			arr[k].setWallet(w1);
		} else if (counterp < counterp1) {
			int w = arr[j].getWallet() - amount;
			int w1 = arr[k].getWallet() + amount;
			arr[j].setWallet(w);
			arr[k].setWallet(w1);
		}
	}

	public static void Menu7(Player[] arr, int i) {
		arr[i].getPos();
		arr[i].setPos(2);
	}

	public static void Menu8(int i, Player[] arr) {
		if (Game.levelfinder(i, arr).equals("easy")) {
			int x = arr[i].wallet + 5000;
			arr[i].setWallet(x);
			Bank.setMoney(-5000);
		} else {
			System.out.println("O παίκτης" + arr[i] + " δεν βρίσκεται στο εύκολο επίπεδο.");
		}
	}

	public static void Menu9(int i, Player[] arr) {
		Scanner input = new Scanner(System.in);
		if (Game.levelfinder(i, arr).equals("normal")) {
			System.out.println("Choose a player.");
			int z = input.nextInt();
			int x = arr[i].wallet - 2000;
			arr[i].setWallet(-x);
			int w = arr[z].wallet + 2000;
			arr[z].setWallet(w);
		} else {
			System.out.println("O παίκτης" + arr[i] + " δεν βρίσκεται στο μέτριο επίπεδο.");

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
				int z = arr[x].wallet - 1000;
				arr[x].setWallet(z);
				Bank.setMoney(1000);
			} else {
				int z = arr[x].wallet + 1000;
				arr[x].setWallet(z);
				Bank.setMoney(-1000);
			}
		} else {
			System.out.println("O παίκτης" + arr[x] + " δεν βρίσκεται στο δύσκολο επίπεδο.");
		}
	}

	public static void Menu11(Player[] arr, int k) {
		Player p = arr[k];
		Scanner input = new Scanner(System.in);
		int j = 0;
		int[] B = new int[20];
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == 9) {
				B[j] = i;
				j++;
			}
		}
		System.out.println("Οι παρακάτω περιοχές είναι διαθέσιμες");
		for (int i = 0; i < B.length; i++) {
			System.out.println(+B[i]);
		}
		System.out.println("Θα ήθελες να αγοράσεις κάποια περιοχή;");
		String answer = input.nextLine();
		if (answer.equals("YES")) {
			System.out.println("Διάλεξε ποία περιοχή από τις διαθέσιμες θες να αγοράσεις.");
			int area = input.nextInt();
			int m = p.getWallet() - Bank.Price[area];
			p.setWallet(m);
			Bank.King_area[area] = k;
			Bank.setMoney(Bank.Price[area]);
		} else {
			System.out.println(" Ο παίκτης" + p + " αποφάσισε να μην αγοράσει κάποια περιοχή.");
		}
	}

	public static void Menu6(Player[] arr, int i, int amount) {
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (j != i) {
				int wallet = p.getWallet() - amount;
				int wallet1 = arr[j].getWallet() + amount;
				p.setWallet(wallet);
				arr[j].setWallet(wallet1);
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
					int wallet = p.getWallet() + amount;
					int wallet1 = arr[j].getWallet() - amount;
					p.setWallet(wallet);
					arr[j].setWallet(wallet1);
				}
			}
		} else {
			for (int j = 0; j < arr.length; j++) {
				int wallet = p.getWallet() - amount;
				int wallet1 = arr[j].getWallet() + amount;
				p.setWallet(wallet);
				arr[j].setWallet(wallet1);
			}

		}
	}
}
