
public abstract class Bank {
	private static int money  = 30000000;

	public static int getMoney() {
		return money;
	}
	
	public static void setMoney(int mon) {
		 money += mon;
	}
	
	public void shareMoney(Player p) { // μέθοδος που θα καλείται στην αρχή του παιχνιδιού για το μοιρασμα ενός χρηματικού ποσού 
		                             //σε καθέναν από τους παίκτες
		System.out.println("The game starts , the king will receive a sum of money." + p);
		p.wallet += 5000;
		money -= 5000;
	}
	
	public static final int AMOUNT = 2000;
	public static int getAmount() {
		return AMOUNT;
	}
	
	public abstract void  giveMoney(Player p); //{ // μέθοδος που καλείται οταν δώσει ο εκάστοτε παίκτης την απάντηση του σε ερώτηση που θα του τύχει 
		                                                       //με σκόπο να πάρει ή να δώσει στον παίκτη ενα χρηματικό ποσό 
		                                                       //έπειτα ακολουθεί η διαδικασία της αγοάς της περιοχής σε περίπτωση που η απάντηση είναι σωστή 
	  
	
	public abstract void takeMoney(Player p); //{// μέθοδος που παίρνει χρηματικό ποσό από παίκτη κ το μεταφέρει στην τράπεζα αν η απάντηση είναι λάθος.
     
	public abstract void tranfer(Player p, Player p0); 
	
	public abstract void buyProperty(Player p, String kn_cards[]) ;// μέθοδος που θα καλείται για να αγοράσει ένας βασιλιάς μια περιοχή από την τράπεζα
	
	public static String[] Prop = new String[20];// δημιουργλια 2 μονοδιάστατων πίνακων παρράλληλων που αντιστοιχούν σε 
                                                //	περιοχές και τιμές
	                                            //  πρέπει να καλεστούν από τη main για να αρχικοποιηθούν
	public static void setNamesArray() {
		Prop[0]= "Αθήνα";
		Prop[1]= "Καλάβρυτα";
		Prop[2]= "Τρίπολη";
		Prop[3]= "Λαμία";
		Prop[4]= "Ναύπλιο";
		Prop[5]= "Πάρε εντολή";
		Prop[6]= "Δελφοί";
		Prop[7]= "Φαιστός";
		Prop[8]= "Νεμέα";
		Prop[9]= "Ιθάκη";
		Prop[10]= "Kνωσός";
		Prop[11]= "Πάρε εντολή";
		Prop[12]= "Σούνιο";
		Prop[13]= "Σπάρτη";
		Prop[14]= "Αμφίπολη";
		Prop[15]= "Σαλαμίνα";
		Prop[16]= "Βοιωτία";
		Prop[17]= "Πάρε εντολή";
		Prop[18]= "Θασσαλονίκη";
		Prop[19]= "Ιωάννινα";
		Prop[20]= "Κόρινθος";
		Prop[21]= "Αρκαδία";
		Prop[22]= "Ύδρα";
	}
	
	public static int[] Price = new int[20];
	public static void setPricesArray() {
		Price[0]= 15000;
		Price[1]= 8000;
		Price[2]= 9000;
		Price[3]= 7500;
		Price[4]= 8500;
		Price[5]= 0;
		Price[6]= 10000;
		Price[7]= 95000;
		Price[8]= 9000;
		Price[9]= 11000;
		Price[10]= 12000;
		Price[11]= 0;
		Price[12]= 11500;
		Price[13]= 8000;
		Price[14]= 10500;
		Price[15]= 9600;
		Price[16]= 5500;
		Price[17]= 0;
		Price[18]= 12000;
		Price[19]= 7500;
		Price[20]= 5000;
		Price[21]= 7000;
		Price[22]= 6000;
	}	
	
	public static int[] getPrices(int[] t) {// δημιουργία 3 μεθόδων get για να μπορούν οι άλλες κλάσεις καλούν τους πίνακες
		t = Price;
		return t;
	}
	
	public static String[] getProperties(String[] t) {
		t = Prop;
		return t;
	}
		
	public static void salary(Player p ) {// μέθοδος που θα καλέιται για να λαμβλανει κάθε βασιλιάς ένα ποσο από την τράπεζα όποτε περνά από την αφετηρία
		p.setWallet (+10000);
	}	
}
