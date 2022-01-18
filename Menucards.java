import java.util.Scanner;

public class Menucards {
	public static void Menu1(int amount, Player[] arr, int i) {
		System.out.println(+ arr[i].getCharacter() +" ���� 500 ���� ��� ���� ���������� �������");
		arr[i].getWallet();
		arr[i].setWallet(3 * amount);
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != p) {
				arr[j].getWallet();
				arr[j].setWallet(-amount);
				System.out.println("O �������  " + arr[j].getCharacter() + "  ���� ������ ��� ��������� ��� ����  "
						+ amount + " ���� ��� ����� ���� " + arr[j].getWallet() + " ����");
			}
		}
		System.out.println("O �������  " + p.getCharacter() + "  ���� ������ ��� ��������� ��� ���� " + 3 * amount
				+ " ���� ��� ����� ���� " + p.getWallet() + " ����");
	}

	public static void Menu2(int i, Player[] arr) {
		System.out.println(+ arr[i].getCharacter() +" ����������� 3 ������ ����");
		Player p = arr[i];
		p.getPos();
		p.setPos(-3);
		System.out.println("������  " + p.getCharacter() + " ��������� ���� ���� " + p.getPos() + ".");
	}

	public static void Menu3(int pos, Player[] arr, int i) {
		System.out.println(+ arr[i].getCharacter() + " ������� ����� ������� �� ������ �� ������� ������� �� �������� ��� �� ����������� ����. �� ��������� ��� �������� ��� ��� �������� ��� �������� �������.");
		Player p = arr[i];
		int f_pos = p.getPos();
		p.setPos(pos - f_pos);
		int l_pos = p.getPos();
		if (pos > f_pos) {
			System.out.println("O �������  " + p.getCharacter() + " ��������� ���� ���� " + p.getPos() + ".");
		} else if (pos < f_pos) {
			p.setWallet(-1000);
			System.out.println("� �������  " + p.getCharacter()
					+ " ������� ��� ��� �������� ���� ��� ���������� �� ����� �� ��������� ����");
			System.out.println("� �������  " + p.getCharacter() + " ��������� ��� ���� " + p.getPos() + ".");
		}
		for (int j = 0; j < arr.length; j++) {
			if (Bank.King_area[l_pos] == j && i != j) {
				p.setWallet(-500);
				arr[j].setWallet(500);
				System.out.println("���������� ��� ��� ������ " + p.getCharacter()
						+ " �� ���� ��� 500 ���� ��� ����������� ���� ������  " + arr[j].getCharacter()
						+ " . � ���� ��� ����������� ���� ����� ������� ��" + p.getWallet() + arr[j].getWallet()
						+ " ����������.");
			}
		}
	}

	public static void Menu4(int amount, Player[] arr, int j) {
		System.out.println(+ arr[i].getCharacter() + " ��������� �� ����� ��� �������� ��� �������� ���� 250 ����.");
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == j) {
				arr[j].setWallet(amount);
				Bank.setMoney(-amount);
				System.out.println(" O �������  " + arr[j].getCharacter() + " �������" + amount + " ���� ��� ����� ����"
						+ arr[j].getWallet() + " ����.");
				break;
			}
		}
	}

	public static void Menu5(int amount, Player[] arr, int j, int k) {
		System.out.println(+ arr[i].getCharacter() +" �� � �������� ������� ������� ������������ �������� ��� �������� 500 ���� , ����������� ��� ������� 500 ����.");
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
			System.out.println("O �������  " + arr[j].getCharacter() + " ������� ������������ �������� ��� ��� ������ "
					+ arr[k].getCharacter() + " ��� ��������� �� ��������� ��� ���� " + amount + " ����. ����� ���� "
					+ arr[j].getWallet());
			System.out.println("O �������  " + arr[k].getCharacter() + " ������� ��������� �������� ��� ��� ������ "
					+ arr[j].getCharacter() + " ��� ��������� �� ��������� ��� ���� " + amount + " ����. ����� ���� "
					+ arr[k].getWallet());
		} else if (counterp < counterp1) {
			arr[j].setWallet(-amount);
			arr[k].setWallet(amount);
			System.out.println("O �������  " + arr[k].getCharacter() + " ������� ������������  �������� ��� ��� ������ "
					+ arr[j].getCharacter() + " ��� ��������� �� ��������� ��� ���� " + amount + " ����. ����� ���� "
					+ arr[k].getWallet());
			System.out.println("O �������  " + arr[j].getCharacter() + " ������� ��������� �������� ��� ��� ������ "
					+ arr[k].getCharacter() + " ��� ��������� �� ��������� ��� ���� " + amount + " ����. ����� ���� "
					+ arr[j].getWallet());

		}
	}

	public static void Menu7(Player[] arr, int i) {
		System.out.println(+arr[i].getCharacter() +" ������� 2 ������ �������");
		arr[i].setPos(2);
		System.out.println("O �������" + arr[i].getCharacter() + " ��������� ���� ����" + arr[i].getPos() + ".");
	}

	public static void Menu8(int i, Player[] arr) {
		System.out.println(+ arr[i].getCharacter() +" �� �� ������� ��������� ����� ������ ��� ����������� ��� �� ��������� 5000����");
		if (Game.levelfinder(i, arr).equals("easy")) {
			arr[i].setWallet(-5000);
			Bank.setMoney(5000);
			System.out.println(" To ��������� ��� ������" + arr[i].getCharacter()
					+ " �������� ���� 5000 ���� ��� ����� ������� ��" + arr[i].getWallet() + " ����.");
		} else {
			System.out.println("O �������" + arr[i].getCharacter() + " ��� ��������� ��� ������ �������.");
		}
	}

	public static void Menu9(int i, Player[] arr) {
		System.out.println(+ arr[i].getCharacter() + " �� �� ������� ��������� ����� ������ �������� 5000 ���� ���� ������� ������.");
		Scanner input = new Scanner(System.in);
		if (Game.levelfinder(i, arr).equals("normal")) {
			System.out.println("Choose a player.");
			int z = input.nextInt();
			arr[i].setWallet(-5000);
			arr[z].setWallet(5000);
			System.out.println(" O �������  " + arr[z].getCharacter() + " ������� 5000 ���� ��� ����� ����"
					+ arr[z].getWallet() + " ����.");
			System.out.println(" O �������  " + arr[i].getCharacter() + " ����� 5000 ���� ��� ����� ����"
					+ arr[i].getWallet() + " ����.");
		} else {
			System.out.println("O �������" + arr[i].getCharacter() + " ��� ��������� ��� ������ �������.");

		}
	}

	public static void Menu10(int x, int[] King_area, Player[] arr) {
		System.out.println(+ arr[i].getCharacter() + " �� �� ������� ��������� ��� �������� 5 � ������������ �������� ������ 1000 ���� ������ ��������� 1000 ����");
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
				System.out.println("� �������" + arr[x].getCharacter() + " ����� ��� �� ��������� ���" + 1000 + "����");
			} else {
				arr[x].setWallet(1000);
				Bank.setMoney(-1000);
				System.out.println(
						"� �������" + arr[x].getCharacter() + " ��������� ��� �� ��������� ���" + 1000 + "����");
			}
		} else {
			System.out.println("O �������" + arr[x].getCharacter() + " ��� ��������� ��� ������� �������.");
		}
	}

	public static void Menu11(Player[] arr, int k) {
		System.out.println(+arr[k].getCharacter() + " ���������� �� ��������� ��� �� ���������� ������� ����� �� ���������� �� ������ �������.");
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
			System.out.println("�� �������� �������� ����� ����������");
			for (int i = 0; i < B.length; i++) {
				System.out.println(+B[i]);
			}
		} else {
			System.out.println("��� ������� ��������� �������.");
		}
		System.out.println("�� ������ �� ��������� ������ �������;");
		String answer = input.nextLine();
		if (answer.equals("YES")) {
			System.out.println("������� ���� ������� ��� ��� ���������� ��� �� ���������.");
			int area = input.nextInt();
			p.setWallet(-Bank.Price[area]);
			Bank.King_area[area] = k;
			Bank.setMoney(Bank.Price[area]);
			System.out.println(
					"� ������� " + p.getCharacter() + " ����� ��� �� ��������� ��� " + Bank.Price[area] + " ����");
			System.out.println("O ������� " + p.getCharacter() + " ������� ��� ������� " + Bank.Prop[area] + ".");
		} else {
			System.out.println(" � �������  " + p.getCharacter() + " ��������� �� ��� �������� ������ �������.");
		}
	}

	public static void Menu6(Player[] arr, int i, int amount) {
		System.out.println(+ arr[i].getCharacter() + " ���� 600 ���� ����� ���������� �������.");
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (j != i) {
				p.setWallet(-amount);
				System.out.println("� �������" + p.getCharacter() + "����� ��� �� ��������� ���" + amount + " ���� ");
				arr[j].setWallet(amount);
				System.out.println(
						"� �������" + arr[j].getCharacter() + "��������� ��� ��������� ���" + amount + " ���� ");
			}
		}
	}

	public static void Menu12(Player[] arr, int i, int amount, int sum) {
		System.outprintln("�� �������� ���� ��� 4 ��������, �������� 700 ���� ����������� ������ 700 ���� ����� ���������� �������.");
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
							"� ������� " + p.getCharacter() + " ��������� ��� �� ��������� ��� " + amount + " ����");
					System.out.println("� ������� " + arr[j].getCharacter() + " ����� " + amount + " ����");
				}
			}
		} else {
			for (int j = 0; j < arr.length; j++) {
				p.setWallet(-amount);
				arr[j].setWallet(amount);
				System.out.println(
						"� ������� " + arr[j].getCharacter() + " ��������� ��� �� ��������� ��� " + amount + " ����");
				System.out.println("� ������� " + p.getCharacter() + " ����� " + amount + " ����");

			}

		}
	}
}