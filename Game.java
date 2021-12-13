import java.util.Scanner;
import java.util.Random;
public class Game {
	Scanner input = new Scanner(System.in);
	public static  String[] Menu_cards;
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
		 int x;
		 x= 1 +dicenumber.nextInt(15);
		 return x;
}
	public int move(int pos) {
	  pos = pos + roll_1();
	  return pos;
	}
	public boolean anwsercheck(int pos) {
		System.out.println("Please enter your anwser here");
	    String anwser = input.nextLine();
	    if (anwser.equals("Anwsers[pos]")) {
	     return true;
	    }
	    else {
		  return false;
	  }
 // public int positionfinder() {
	//  int posit = 0;
	 // posit = player.pos() + Game.roll_1();
	  // return posit;
  }
  public String levelfinder() {
	  String level;
	  if (Player.setround=1) {
		  level = easy;
	  } else if (Player.setround=2) {
		  level = normal;
	  } else {
		  level = hard;
	  }
	  return level ;
  }
}






	}



