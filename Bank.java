package kingsgambit;

public class Bank {

//	Ftiaxno 3 monodiastatous paralilous pinakes pou antistixizoun 
//	perioxes times kai basilia ston opoio anhkei
//	Prepei na kalestoun apo th main gia na arxikopoiithoun
	
	public static String[] Prop = new String[3];
	public static void setNamesArray() {
		Prop[0]= "Athina";
		Prop[1]= "Sparti";
		Prop[2]= "Lamia";
		//...
		//...
	}
	
	public static int[] Price = new int[3];
	public static void setPricesArray() {
		Price[0]= 80000;
		Price[1]= 120000;
		Price[2]= 90000;
		//...
		//...
		}	
	
	public static String[] Names = new String[3];
	public static void setAvailabilityArray() {
		Names[0]= null;
		Names[1]= null;
		Names[2]= null;
		//...
		//...
	}
	
	
	
	//ftiaxno 3 getters gia na mporoun oi alles klaseis na kaloun tous pinakes an toys xreiastoun
	
	public static int[] getPrices(int[] t) {
		t = Price;
		return t;
	}
	
	public static String[] getProperties(String[] t) {
		t = Prop;
		return t;
	}
	
	public static String[] getNames(String[] t) {
		t = Names;
		return t;
	}
	
	
	//vazo foro to 1/10 ths agorastikhs aksias tis perioxis 
	//tha dinei auta ta xrhmata o basilias poy pernaei apo perioxh alou basilia pou tin exei agorasei
	
	public static double tax(int p) {
		return p * 0.1 ;
	}
	
	
//Ftiaxno proxeira thn klasi king gia na bgazoun nohma oi methodoi tis bank 
//	
//	public class King {
//
//	  public String name;
//	  public int wallet;
//	
//	  public King (String n) {
//		name = n;
//	  }
//  }
// ftiaxno tous vasiliades os antikeimena tupou King me idiotites name, wallet kai alles	
	
	
	
	//plironi kathe vasilia otan pernaei se kathe guro apo thn afethria
	
	public static void salary(King k) {
		k.wallet += 10000;
	}
	
	
	//kalite gia na agorasi enas basilias mia perioxh apo thn trapeza
	
	public static void buyProperty(King k, String p) {
		
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
		
			if(Names[point] == null) {
				
				if(Price[point] >= k.wallet) {
					System.out.println("You bought this property");
					Names[point]= k.name;
					System.out.println("It cost you " + Price[point] + " coins");
					k.wallet -= Price[point]; 
				} else {
					System.out.println("You cannot aford the property");
				}
			} else {
				System.out.println("Property belongs to "+ Names[point]);
			}
		}
	}

	
	////kalite otan prepei enas vasilias na plhrosei foro se enan allo
	
	public static void transfer(King k1, King k2, String p) {
		
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
