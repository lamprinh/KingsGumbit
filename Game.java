import java.util.Scanner;
import java.util.Random;
public class Game {
	Scanner input = new Scanner(System.in);
	List<String>Menu_cards= new ArrayList<String>();
	list.add("���� � ���� ��� ���� ���������� �������");
	list.add("����������� 3 ������ ����");
	list.add("������� ���� � ������� �� ������ �� ������� ������� �� �������� ��� �� ����������� ����. �� ��������� ��� �������� ��� ��� �������� ��� �������� �������.");
	list.add("��������� �� ����� ��� �������� ��� �������� ���� � ����.");
	list.add("�� � �������� ������� ������� ������������ �������� ��� �������� � ����, ����������� ��� ������� � ����.");
	list.add("���� � ���� ����� ���������� �������.");
	list.add("������� 2 ������ ������� ��� ���� �����.");
	list.add("�� �� ������� ��������� ����� ������ ��� ������� ���� ��� �� �������� ��� ��� �������� ���� �� ���� ��������� ����.");
	list.add("�� �� ������� ��������� ����� ������ ��� ������� ���� ��� �� �������� ��� ��� �������� ������ �� ���� ��������� ���� ���� ������� ������.");
	list.add("�� �� ������� ��������� ����� ������� ������� ���� ��� ���� ���������� ������� ���� �� �� ����� ����� ��� ��� ��������.");
	list.add("���������� �� ��������� ��� �� ���������� ������� ����� �� ���������� �� ������ �������.");
	list.add("�� �������� ���� ��� � ��������, �������� � ���� ����������� ������ � ���� ����� ���������� �������.");
	list.add("��� ������� ���� ��� �� �������� ��� ���������� ������� ���������� �� ��� ��������� �� ��������� ����.");

	int players;
	Random dicenumber=new Random();
	public Game(int players) {
		this.players=players;
	}

	public boolean buy() {
		System.out.println("Would you like to buy this Area?(Yes/No)");
		String answer = input.nextLine();
		if (answer=="YES") {
			return true; }
		else {
			return false; }


		}
			public int roll_1() {
		 int dice;
		 dice = 1 +dicenumber.nextInt(6);
		 return dice;
		}
		public int roll_2(int pos) {
			int x=0;
			if (pos>1 && pos<6) {
				x= 1+dicenumber.nextInt(10);
			}else if (pos>6 && pos<12) {
				x= 11 +dicenumber.nextInt(20);
			}else if (pos>12 && pos<18) {
				x= 21 +dicenumber.nextInt(30);
			}else if (pos>18 && pos<24){
				x= 31 +dicenumber.nextInt(40);
			}
			return x;
		}
		public int roll_3() {
		 int dice;
		 dice = 1 +dicenumber.nextInt(13);
		 return dice;
}
	public int move(int pos) {
	  pos = pos + roll_1();
	  return pos;

	  }
	  public String levelfinder() {
		  String level;
		  if (player.setround=1) {
		  level = easy;
	  } else if (Player.setround=2) {
		  level = normal;
	  } else {
		  level = hard;
	  }
	  return level ;
  }
}








