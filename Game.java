import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	static Scanner input = new Scanner(System.in);

	public static void lalala() {
		ArrayList<String> Menu_cards = new ArrayList<String>();
		Menu_cards.add("���� � ���� ��� ���� ���������� �������");
		Menu_cards.add("����������� 3 ������ ����");
		Menu_cards.add(
				"������� ���� � ������� �� ������ �� ������� ������� �� �������� ��� �� ����������� ����. �� ��������� ��� �������� ��� ��� �������� ��� �������� �������.");
		Menu_cards.add("��������� �� ����� ��� �������� ��� �������� ���� � ����.");
		Menu_cards.add(
				"�� � �������� ������� ������� ������������ �������� ��� �������� � ����, ����������� ��� ������� � ����.");
		Menu_cards.add("���� � ���� ����� ���������� �������.");
		Menu_cards.add("������� 2 ������ ������� ��� ���� �����.");
		Menu_cards.add(
				"�� �� ������� ��������� ����� ������ ��� ������� ���� ��� �� �������� ��� ��� �������� ���� �� ���� ��������� ����.");
		Menu_cards.add(
				"�� �� ������� ��������� ����� ������ ��� ������� ���� ��� �� �������� ��� ��� �������� ������ �� ���� ��������� ���� ���� ������� ������.");
		Menu_cards.add(
				"�� �� ������� ��������� ����� ������� ������� ���� ��� ���� ���������� ������� ���� �� �� ����� ����� ��� ��� ��������.");
		Menu_cards.add("���������� �� ��������� ��� �� ���������� ������� ����� �� ���������� �� ������ �������.");
		Menu_cards.add(
				"�� �������� ���� ��� � ��������, �������� � ���� ����������� ������ � ���� ����� ���������� �������.");
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
			} else if (arr[i].getPos() <= 11) {
				Easy.easyQ2(arr[i].getPos() - 7);
			} else if (arr[i].getPos() <= 17) {
				Easy.easyQ3(arr[i].getPos() - 13);
			} else
				Easy.easyQ3(arr[i].getPos() - 19);
		} else if (i == 1) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Easy.easyQ1(arr[i].getPos() + 4);
			} else if (arr[i].getPos() >= 7 && arr[i].getPos() <= 11) {
				Easy.easyQ2(arr[i].getPos() - 2);
			} else if (arr[i].getPos() >= 13 && arr[i].getPos() <= 17) {
				Easy.easyQ3(arr[i].getPos() - 8);
			} else if (arr[i].getPos() >= 19 && arr[i].getPos() <= 23)
				Easy.easyQ4(arr[i].getPos() - 14);
		} else if (i == 2) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Easy.easyQ1(arr[i].getPos() + 9);
			} else if (arr[i].getPos() <= 11) {
				Easy.easyQ2(arr[i].getPos() + 3);
			} else if (arr[i].getPos() <= 17) {
				Easy.easyQ3(arr[i].getPos() - 3);
			} else {
				Easy.easyQ4(arr[i].getPos() - 9);
			}
		} else if (i == 3) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				Easy.easyQ1(arr[i].getPos() + 14);
			} else if (arr[i].getPos() <= 11) {
				Easy.easyQ2(arr[i].getPos() + 8);
			} else if (arr[i].getPos() <= 17) {
				Easy.easyQ3(arr[i].getPos() + 2);
			} else {
				Easy.easyQ4(arr[i].getPos() - 4);
			}
		}
	}

	public static String roll_normal(int i, Player[] arr) {
		String q = "";
		if (i == 1) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Normal.normal_q1.get(arr[i].getPos());
			} else if (arr[i].getPos() <= 10) {
				return Normal.normal_q2.get(arr[i].getPos() - 5);
			} else if (arr[i].getPos() <= 15) {
				return Normal.normal_q3.get(arr[i].getPos() - 10);
			} else {
				return Normal.normal_q4.get(arr[i].getPos() - 15);
			}
		} else if (i == 2) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Normal.normal_q1.get(arr[i].getPos() + 5);
			} else if (arr[i].getPos() <= 10) {
				return Normal.normal_q2.get(arr[i].getPos());
			} else if (arr[i].getPos() <= 15) {
				return Normal.normal_q3.get(arr[i].getPos() - 5);
			} else {
				return Normal.normal_q4.get(arr[i].getPos() - 10);
			}
		} else if (i == 3) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Normal.normal_q1.get(arr[i].getPos() + 10);
			} else if (arr[i].getPos() <= 10) {
				return Normal.normal_q2.get(arr[i].getPos() + 5);
			} else if (arr[i].getPos() <= 15) {
				return Normal.normal_q3.get(arr[i].getPos());
			} else {
				return Normal.normal_q4.get(arr[i].getPos() - 5);
			}
		} else if (i == 4) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Normal.normal_q1.get(arr[i].getPos() + 15);
			} else if (arr[i].getPos() <= 10) {
				return Normal.normal_q2.get(arr[i].getPos() + 10);
			} else if (arr[i].getPos() <= 15) {
				return Normal.normal_q3.get(arr[i].getPos() + 5);
			} else {
				return Normal.normal_q4.get(arr[i].getPos());
			}
		}
		return q;
	}

	public static String roll_hard(int i, Player[] arr) {
		String q = "";
		if (i == 1) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Hard.hard_q1.get(arr[i].getPos());
			} else if (arr[i].getPos() <= 10) {
				return Hard.hard_q2.get(arr[i].getPos() - 5);
			} else if (arr[i].getPos() <= 15) {
				return Hard.hard_q3.get(arr[i].getPos() - 10);
			} else
				return Hard.hard_q4.get(arr[i].getPos() - 15);
		} else if (i == 2) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Hard.hard_q1.get(arr[i].getPos() + 5);
			} else if (arr[i].getPos() <= 10) {
				return Hard.hard_q2.get(arr[i].getPos());
			} else if (arr[i].getPos() <= 15) {
				return Hard.hard_q3.get(arr[i].getPos() - 5);
			} else
				return Hard.hard_q4.get(arr[i].getPos() - 10);
		} else if (i == 3) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Hard.hard_q1.get(arr[i].getPos() + 10);
			} else if (arr[i].getPos() <= 10) {
				return Hard.hard_q2.get(arr[i].getPos() + 5);
			} else if (arr[i].getPos() <= 15) {
				return Hard.hard_q3.get(arr[i].getPos());
			} else
				return Hard.hard_q4.get(arr[i].getPos() - 5);
		} else if (i == 4) {
			if (arr[i].getPos() > 0 && arr[i].getPos() <= 5) {
				return Hard.hard_q1.get(arr[i].getPos() + 15);
			} else if (arr[i].getPos() <= 10) {
				return Hard.hard_q2.get(arr[i].getPos() + 10);
			} else if (arr[i].getPos() <= 15) {
				return Hard.hard_q3.get(arr[i].getPos() + 5);
			} else
				return Hard.hard_q4.get(arr[i].getPos());
		}
		return q;
	}

	public static int roll_3() {
		int dice;
		dice = 1 + dicenumber.nextInt(13);
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
