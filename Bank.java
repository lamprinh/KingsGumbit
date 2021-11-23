
import java.util.Scanner;

public class Bank {
	static Scanner input = new Scanner(System.in);
	private int money;
	public Bank() {// κατασκευαστής για το πέρασμα της τιμής στην μεταβλητή money
		this.money = 300000;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void shareMoney(King k) { // μέθοδος που θα καλείται στην αρχή του παιχνιδιού για το μοιρασμα ενός χρηματικού ποσού 
		                             //σε καθέναν από τους παίκτες
		System.out.println("The game starts , the kings will receive a sum of money.");
		k.wallet += 2000;
		this.money -= 2000;
	}
	
	static Bank pay = new Bank();
	
	
	public static void giveMoney(King k, String kn_cards[] ) { //  μέθοδος που καλείται οταν δώσει ο εκάστοτε παίκτης την απάντηση του σε ερώτηση που θα του τύχει 
		                                                       // με σκόπο να πάρει ή να δώσει στον παίκτη ενα χρηματικό ποσό 
		                                                       //έπειτα ακολουθεί η διαδικασία της αγοάς της περιοχής σε περίπτωση που η απάντηση είναι σωστή 
	    boolean belong;
		boolean ans;
		boolean flag = false;
		int pos = 0;
		int position;
		position = Game.move(pos);
		boolean answ = true;
		answ = Game.anwsercheck(pos);
		if(answ == true) {
			System.out.println("The answear was right, the king will receive 1500$");
			k.wallet += 1500;
			if(flag==false) {
				System.out.println("Area does not exist");
			} else {
				ans = Game.buy();
			    if (ans == true) {
			    	System.out.println("The king wants to buy the area.");
			    	belong = Game.Seat_check(position);
			    	if(belong == false) {
			    		  Bank.buyProperty(k, null, kn_cards);
			    	} else {
			    		  System.out.println("Property belongs to "+ kn_cards[position]+"you have to pay a tax.");
			    		  Bank.transfer(k, k, null);
			    		}
			    } else {
			    	System.out.println("The king does not want to buy this area.");
			    }
		    }
	    } else {
	    	System.out.println("The question is wrong, you have to pay.");
	    	pay.takeMoney(k);
	    }
	}
	
	public void takeMoney(King k) {//μέθοδος που παίρνει χρηματικό ποσό από παίκτη κ το μεταφέρει στην τράπεζα αν η απάντηση είναι λάθος .
			k.wallet -= 1200;
			this.money += 1200;
    }
     
    public static String[] Prop = new String[3];// δημιουργλια 2 μονοδιάστατων πίνακων παρράλληλων που αντιστοιχούν σε
                                                //	περιοχές και τιμές
	                                            // πρέπει να καλεστούν από τη main για να αρχικοποιηθούν
	public static void setNamesArray() {
		Prop[0]= "Athina";
		Prop[1]= "Sparti";
		Prop[2]= "Lamia";
	}
	
	public static int[] Price = new int[3];
	public static void setPricesArray() {
		Price[0]= 80000;
		Price[1]= 120000;
		Price[2]= 90000;
		}	
	
	public static int[] getPrices(int[] t) {// δημιουργία 3 μεθόδων get για να μπορούν οι άλλες κλάσεις καλούν τους πίνακες
		t = Price;
		return t;
	}
	
	public static String[] getProperties(String[] t) {
		t = Prop;
		return t;
	}
	
	public static double tax(int p) {// μέθοδος για φορολόγηση 10% κάθε βασιλιά που σταματάει σε κατεχόμενη περιοχή
		return p * 0.1 ;
	}
	
	public static void salary(King k) {// μέθοδος που θα καλέιται για να λαμβλανει κάθε βασιλιάς ένα ποσο από την τράπεζα όποτε περνά από την αφετηρία
		k.wallet += 10000;
	}
	
	public static void buyProperty(King k, String p, String kn_cards[]) {//  μέθοδος που θα καλείται για να αγοράσει ένας βασιλιάς μια περιοχή από την τράπεζα
		
		boolean flag = false;
		
		int x=0;
		int point=99;
		while ((x <= Prop.length) && !flag) {
			if(Prop[x] == p) {
				flag = true;
				point = x;
			}
			x++;
		}
		if(flag==false) {
			System.out.println("Area does not exist");
		} else {
		
			if(kn_cards[point] == null) {
				
				if(Price[point] >= k.wallet) {
					System.out.println("You bought this property");
					kn_cards[point]= k.name;
					System.out.println("It cost you " + Price[point] + " coins");
					k.wallet -= Price[point]; 
				} else {
					System.out.println("You cannot aford the property");
				}
			} else {
				System.out.println("Property belongs to "+ kn_cards[point]);
			}
		}
	}
    
	public static void transfer(King k1, King k2, String p) {//  μέθοδος που θα καλείται όταν ένας βασιλιάς θα πρέπει να πληρώσει φόρο σε εναν άλλο 
		
		int y=0;
		int point=99;
		boolean flag = false;
		while (y <= Prop.length && !flag) {
			if(p == Prop[y]) {
				point=y;
				flag=true;
			}
			y++;
		}
		if(point !=99) {
		k1.wallet -= tax(Price[point]);
		k2.wallet += tax(Price[point]);
		}
	}	
}
