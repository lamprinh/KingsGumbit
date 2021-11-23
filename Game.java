import java.util.Scanner;
import java.util.Random;
public class Game {
	Scanner input = new Scanner(System.in);
	public static  String[] Knowledge_cards; //πίνακας των ερωτήσεων
	public static  String[] Menu_cards;// πίνακας με το Menu εντολών
	public static String[] Answers; // πίνακας με τις απάντησεις των ερωτήσεων 
	public static String[] kn_cards; // πίνακας που δείχνει σε ποίον ανήκει η κάθε θέση/περιοχή
	int players;
	Random dicenumber=new Random();
	public Game(int players) { //κατασκεαυστής που ορίζει τον αριθμό των παικτών
		this.players=players;
	}
	public static boolean Seat_check(int seat) { //ελέγχει αν η εκάστοτε περιοχή ανήκει σε κάποιον παίκτη
		if (kn_cards[seat].equals("null")) {
			return true;

		}
		else {
			return false ;
		}
	}
	public static boolean buy() {  // δίνει την επιλογή αγοράς στον εκάστοτε παίκτη
		System.out.println("Would you like to buy this Area?(Yes/No)");
		String answer = input.nextLine();
		if (answer=="YES") {
			return true; }
		else {
			return false; }


		}
			public static int roll_1() { // φέρει ένα τυχαίο αποτέλεσμα(1-6) για την κίνηση των παικτών στο ταμπλό
		 int dice;
		 dice = 1 +dicenumber.nextInt(6);
		 return dice;
		}
		public static int roll_2(int pos) { //επίστρεφει με βάση την περιοχή που βρίσκεται ο παίκτης στο ταμπλό μια θέση για την επιλογή τυχαίας ερώτησης
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
		public static int roll_3() {//επιστρέφει μια τυχαία τιμή για την επιλογή κάρτας από το Menu εντολών
		 int x;
		 x= 1 +dicenumber.nextInt(15);
		 return x;
}
	public static int move(int pos) { //μετακινεί τον παίκτη που έχει σείρα με βάση το αποτέλεσμα του ζαριού
	  pos = pos + roll_1();
	  return pos;
	}
	public static boolean anwsercheck(int pos) { //ελέγχει αν η απάντηση που έδωσε ο παίκτης είναι σωστή
		System.out.println("Please enter your anwser here");
	    String anwser = input.nextLine();
	    if (anwser.equals("Anwsers[pos]")) {
	     return true;
	    }
	    else {
		  return false;
	  }
  }



	}



