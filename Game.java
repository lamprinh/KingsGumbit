import java.util.Scanner;
import java.util.Random;
public class Game {
	Scanner input = new Scanner(System.in);
	public static  String[] Knowledge_cards; // πινακας με τις καρτες ερωτήσεων για τις περιοχες
	public static  String[] Menu_cards; // πινακας για καρτες εντολων( προχωρα 2 θεσεις κτλ)
	String[] kn_cards; // πινακας που δείχνει αν η περιοχη ανήκει η οχι σε καποιον
	int players;
	Random dicenumber=new Random();
	public Game(int players) { // κατασκευαστης θετει τον αριθμο των παικτων ανάλογα με την είσοδο που θα δωσουν οι χρηστες
		this.players=players;
	}
	public static boolean Seat_check(int seat) { // ελεγχει αν ανηκει η περιοχη σε καποιον παικτη
		if (kn_cards[seat]=true) {
			return true;

		}
		else {
			return false ;
		}
	}
	public static boolean buy() { //μεθοδος που δινει την επιλογη αγορας 
		System.out.println("Would you like to buy this Area?(Yes/No)");
		String answer = input.nextLine();
		if (answer=="YES") {
			return true; }
		else {
			return false; }


		}
			public static int roll_1() { //μεθοδος που φερνει αποτελεσμα στο ζαρι (1-6)
		 int dice;
		 dice = 1 +dicenumber.nextInt(6);
		 return dice;
		}
		public static  int roll_2(int pos) { // μεθοδος που τραβαει τυχαια καρτα ερωτησης για τις περιοχες αναλογα με το που βρισκεται ο παικτης 
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
		public static int roll_3() { //μεθοδος που τραβαει τυχαια καρτα απ το μενου εντολων
		 int x;
		 x= 1 +dicenumber.nextInt(15);
		 return x;
}
	public static int move(int pos) { //μεθοδος που μετακινει τον χαρακτηρα με βαση το ζαρι που εφερε
	  pos = pos + roll_1();
	  return pos;
	}
	
	}



