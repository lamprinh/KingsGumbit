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
		public String roll_easy(int i) {
			if (i=1) {
				if (Player.getPos()>0 && and Player.getPos()<=5) {
					return Easy.easy_q1[Player.getPos];
			} else if (PlayPlayer.getPos()<=10) {
			        return Easy.easy_q2[Player.getPos()-5];
		   } else if (Player.getPos()<=15) {
			       return Easy.easy_q3[Player.getPos()-10];
	   } else
			return Easy.easy_q4[Player.getPos()-15];
   }} else if (i=2) {
	   			if (Player.getPos()>0 && and Player.getPos()<=5) {
	   					return Easy.easy_q1[Player.getPos()+5];
	   			} else if (PlayPlayer.getPos()<=10) {
	   			        return Easy.easy_q2[Player.getPos()];
	   		   } else if (Player.getPos()<=15) {
	   			       return Easy.easy_q3[Player.getPos()-5];
	   	   } else
			return Easy.easy_q4[Player.getPos()-10];
		}} else if (i=3) {
						if (Player.getPos()>0 && and Player.getPos()<=5) {
								return Easy.easy_q1[Player.getPos()+10];
						} else if (PlayPlayer.getPos()<=10) {
						        return Easy.easy_q2[Player.getPos()+5];
					   } else if (Player.getPos()<=15) {
						       return Easy.easy_q3[Player.getPos()];
				   } else
			return Easy.easy_q4[Player.getPos()-5];
		}} else if (i=4) {
			if (Player.getPos()>0 && and Player.getPos()<=5) {
					return Easy.easy_q1[Player.getPos()+15];
			} else if (PlayPlayer.getPos()<=10) {
			        return Easy.easy_q2[Player.getPos()+10];
		   } else if (Player.getPos()<=15) {
			       return Easy.easy_q3[Player.getPos()+5];
	   } else
			return Easy.easy_q4[Player.getPos()];
		}}}

   public String roll_normal(int i) {
	   if (i=1) {
		   	if (Player.getPos()>0 && and Player.getPos()<=5) {
		   					return Normal.normal_q1[Player.getPos()];
		   			} else if (Player.getPos()<=10) {
		   			        return Normal.normal_q2[Player.getPos()-5];
		   		   } else if (Player.getPos()<=15) {
		   			       return Normal.normal_q3[Player.getPos()-10];
		   	   } else {
			return Normal.normal_q4[Player.getPos()-15];
}} else if (i=2) {
	if (Player.getPos()>0 && and Player.getPos()<=5) {
			   					return Normal.normal_q1[Player.getPos()+5];
			   			} else if (Player.getPos()<=10) {
			   			        return Normal.normal_q2[Player.getPos()];
			   		   } else if (Player.getPos()<=15) {
			   			       return Normal.normal_q3[Player.getPos()-5];
			   	   } else {
			return Normal.normal_q4[Player.getPos()-10];
		} } else if (i=3) {
				if (Player.getPos()>0 && and Player.getPos()<=5) {
						   					return Normal.normal_q1[Player.getPos()+10];
						   			} else if (Player.getPos()<=10) {
						   			        return Normal.normal_q2[Player.getPos()+5];
						   		   } else if (Player.getPos()<=15) {
						   			       return Normal.normal_q3[Player.getPos()];
						   	   } else {
			return Normal.normal_q4[Player.getPos()-5];
		}} else if (i=4) {
				if (Player.getPos()>0 && and Player.getPos()<=5) {
						   					return Normal.normal_q1[Player.getPos()+15];
						   			} else if (Player.getPos()<=10) {
						   			        return Normal.normal_q2[Player.getPos()+10];
						   		   } else if (Player.getPos()<=15) {
						   			       return Normal.normal_q3[Player.getPos()+5];
						   	   } else {
			return Normal.normal_q4[Player.getPos()];
		}}}


   public String roll_hard(int i) {
	   if (i=1) {
		   	if (Player.getPos()>0 && and Player.getPos()<=5) {
		   					return Hard.hard_q1[Player.getPos];
		   			} else if (Player.getPos()<=10) {
		   			        return Hard.hard_q2[Player.getPos()-5];
		   		   } else if (Player.getPos()<=15) {
		   			       return Hard.hard_q3[Player.getPos()-10];
		   	   } else
			return Hard.hard_q4[Player.getPos()-15];
		}
	} else if (i=2) {
		if (Player.getPos()>0 && and Player.getPos()<=5) {
				   					return Hard.hard_q1[Player.getPos()+5];
				   			} else if (Player.getPos()<=10) {
				   			        return Hard.hard_q2[Player.getPos()];
				   		   } else if (Player.getPos()<=15) {
				   			       return Hard.hard_q3[Player.getPos()-5];
				   	   } else
			return Hard.hard_q4[Player.getPos()-10];
		} } else if (i=3) {
			if (Player.getPos()>0 && and Player.getPos()<=5) {
					   					return Hard.hard_q1[Player.getPos()+10];
					   			} else if (Player.getPos()<=10) {
					   			        return Hard.hard_q2[Player.getPos()+5];
					   		   } else if (Player.getPos()<=15) {
					   			       return Hard.hard_q3[Player.getPos()];
					   	   } else
			return Hard.hard_q4[Player.getPos()-5];
		}} else if (i=4) {
			if (Player.getPos()>0 && and Player.getPos()<=5) {
					   					return Hard.hard_q1[Player.getPos()+15];
					   			} else if (Player.getPos()<=10) {
					   			        return Hard.hard_q2[Player.getPos()+10];
					   		   } else if (Player.getPos()<=15) {
					   			       return Hard.hard_q3[Player.getPos()+5];
					   	   } else
			return Hard.hard_q4[Player.getPos()];
		}} }

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








