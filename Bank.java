public abstract class Bank {
	protected int money;
	public Bank() {// κατασκευαστής για το πέρασμα της τιμής στην μεταβλητή money
		money = 300000;
	}
	
	public void shareMoney(King k) { // μέθοδος που θα καλείται στην αρχή του παιχνιδιού για το μοιρασμα ενός χρηματικού ποσού 
		                             //σε καθέναν από τους παίκτες
		System.out.println("The game starts , the kings will receive a sum of money.");
		k.wallet += 2000;
		money -= 2000;
	}
	
	public abstract int giveMoney(King k, String []Knowledge_cards ); //{ // μέθοδος που καλείται οταν δώσει ο εκάστοτε παίκτης την απάντηση του σε ερώτηση που θα του τύχει 
		                                                       //με σκόπο να πάρει ή να δώσει στον παίκτη ενα χρηματικό ποσό 
		                                                       //έπειτα ακολουθεί η διαδικασία της αγοάς της περιοχής σε περίπτωση που η απάντηση είναι σωστή 
	  
	
	public abstract int takeMoney(King k); //{// μέθοδος που παίρνει χρηματικό ποσό από παίκτη κ το μεταφέρει στην τράπεζα αν η απάντηση είναι λάθος.
     
    public static String[] Prop = new String[20];// δημιουργλια 2 μονοδιάστατων πίνακων παρράλληλων που αντιστοιχούν σε 
                                                //	περιοχές και τιμές
	                                            //  πρέπει να καλεστούν από τη main για να αρχικοποιηθούν
	public static void setNamesArray() {
		Prop[0]= "Athina";
		Prop[1]= "Sparti";
		Prop[2]= "Lamia";
		Prop[3]= "Lamia";
		Prop[4]= "Lamia";
		Prop[5]= "Lamia";
		Prop[6]= "Lamia";
		Prop[7]= "Lamia";
		Prop[8]= "Lamia";
		Prop[9]= "Lamia";
		Prop[10]= "Lamia";
		Prop[12]= "Lamia";
		Prop[13]= "Lamia";
		Prop[14]= "Lamia";
		Prop[15]= "Lamia";
		Prop[16]= "Lamia";
		Prop[17]= "Lamia";
		Prop[18]= "Lamia";
		Prop[19]= "Lamia";		
	}
	
	public static int[] Price = new int[20];
	public static void setPricesArray() {
		Price[0]= 80000;
		Price[1]= 120000;
		Price[2]= 90000;
		Price[3]= 90000;
		Price[4]= 90000;
		Price[5]= 90000;
		Price[6]= 90000;
		Price[7]= 90000;
		Price[8]= 90000;
		Price[9]= 90000;
		Price[10]= 90000;
		Price[11]= 90000;
		Price[12]= 90000;
		Price[13]= 90000;
		Price[14]= 90000;
		Price[15]= 90000;
		Price[16]= 90000;
		Price[17]= 90000;
		Price[18]= 90000;
		Price[19]= 90000;
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
	
	public static void buyProperty(King k, String p, String kn_cards[]) {// μέθοδος που θα καλείται για να αγοράσει ένας βασιλιάς μια περιοχή από την τράπεζα
		
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
    
//public static void transfer(King k1, King k2, String p) {// μέθοδος που θα καλείται όταν ένας βασιλιάς θα πρέπει να πληρώσει φόρο σε εναν άλλο 
		
		//int y=0;
		//int point=99;
		//boolean flag = false;
		//while (y <= Prop.length && !flag) {
			//if(p == Prop[y]) {
				//point=y;
				//flag=true;
			//}
			//y++;
		//}
		//if(point !=99) {
		//k1.wallet -= tax(Price[point]);
		//k2.wallet += tax(Price[point]);
		//}
	//}	 
	
}

