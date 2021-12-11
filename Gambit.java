package kingsgambit;
import java.util.Scanner;

public class Gambit {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("King's Gambit");
		int num = howManyPlayers();
		Player arr[] = constructPlayers(num);
		setNames(num, arr);
		setWallet(num, arr);
		System.out.println("Let's play");
		//input.nextLine();
		
		int r=0;
		while(r<3) {
			r = setRound(r);
			System.out.println("Round " + r);
			for(int i =0 ; i<num ; i++) {
				System.out.println(arr[i].character + " roll the dice");
				//input.nextLine();
				int m = Game.roll_1();
				System.out.println(m);
				
				arr[i].pos += m;
				
				//question
				if (arr[i].getRound()==1) {
					//Easy.
				} else if (arr[i].getRound()==2) {
					//Normal
				} else {
					Hard.showQuestion(arr[i].pos);
				}
				
				//area
				if (Game.buy()) {
					
					
					
				}
			}
			System.out.println("End of round " + r);
			setRounds(num,arr,r);
			
		}
		System.out.println("End of game");
	}

	
	
	
	
	public static int howManyPlayers() {
		System.out.println("Please insert the number of players");
		int num = input.nextInt();
		return num;
	}
	
	public static Player[] constructPlayers(int  n) {

		Player[] pAr = new Player[4];
		if (n==1) {
			Player p1 = new Player();
			pAr[0] = p1; 
		} else if (n==2) {
			Player p1 = new Player(); 
			Player p2 = new Player();
			pAr[0] = p1;
			pAr[1] = p2;
		} else if (n==3) {
			Player p1 = new Player(); 
			Player p2 = new Player();
			Player p3 = new Player();
			pAr[0] = p1;
			pAr[1] = p2;
			pAr[2] = p3;
		} else if (n==4) {
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
	
	public static void setNames(int num, Player[] arr) {
		int i;
		for(i = 0 ; i < num; i++) {
			System.out.println("Player " + (i+1) + " ,please type your name");
			String c = input.next();
			arr[i].setCharacter(c);
		}
	}
	
	public static void setWallet(int num, Player[] arr) {
		int i;
		for(i = 0 ; i < num; i++) {
			arr[i].setWallet(1000);
		}
	}
	
	public static int setRound(int r) {
		return r += 1;
	}
	
	public static void setRounds(int num, Player[] arr, int r) {
		int i;
		for(i = 0 ; i < num; i++) {
			arr[i].setRound(r + 1);
		}
	}
}
