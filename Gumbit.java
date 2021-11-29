package gumbit;
import java.util.Scanner;

public class Gumbit {
	
	Scanner input = new Scanner(System.in);
	
	public void main(String args[]) {
		
		int NumberOfPlayers = NumOfPlayers();
		player[] Players;
		Players = new player[NumberOfPlayers];
		ChooseCharacter(NumberOfPlayers);
		Bank myBank = new Bank();
		
		for (int i=0; i<NumberOfPlayers; i++) {
			myBank.sharemoney(Players[i]);
		}
		do {
			
			
			
		}	while 
			
		
		
	}
	
	public int NumOfPlayers () {
		System.out.println("How many players will you play?");
		int players = input.nextInt();
		return players;
	}
	
	public static void ChooseCharacter (int numberofplayers) { //καθε παιχτης(αντικειμενο) ερωτάται ποιο πιονι προτιμάει και αυτο το πιονι καταχωρειται 
		System.out.println("these  are these available characters");
		System.out.println("Character1: Character2: Character3: Character4: ");
		for (int i=0; i<numberofplayers; i++) {
			definecharacters(numberofplayers);
		}
	}
	
	public static void definecharacters (int i) {
		System.out.println("Player" + i + "Choose your character");
		String character = input.nextLine();
		Players[i].setCharacter(character);
	}
	
	public boolean checkendofgame ()
	

}
