import java.util.Scanner;
public class Menucards {
 public void Menu1 (int amount Player []arr, int i, int j , int k, int l)
  int x = 3*amount  + arr[i].getWallet();
  arr[i].setWallet(x);
  int x1= arr[j].getWallet() - amount;
  int x2= arr[k].getWallet() - amount;
  int x3= arr[l].getWallet() - amount;
 arr[j].setWallet(x1);
  arr[k].setWallet(x2);
 arr[l].setWallet(x3);
  }
  public void Menu2 (int i , Player[] arr) {
  Player p = arr[i];
  int pos = p.getPos();
  p.setPos(pos-3);
  }
  public boolean Menu3 (int pos, Player []arr, int i) {
  Player p = arr[i];
  boolean flag = false;
  int f_pos = p.getPos();
  int l_pos = p.setPos(pos);
  if (f_pos > l_pos) {
    System.out.println("Ο παίκτης" + p + " περνάει από την αφετηρία αλλά δεν δικαιούται να πάρει το χρηματικό ποσό");
    flag= true;
}
 if (Bank.King_Area[l_pos] = 1 && p != p1) {
		w1= p.getWallet() - 500;
		w2= arr[0].getWallet() +500;
		p.setWallet(w1);
		arr[0].setWallet(w2);
} else if ( Bank.King_Area[l_pos] = 2 && p != p2) {
		w1= p.getWallet() - 500;
		w3= arr[1].getWallet() +500;
		p.setWallet(w1);
		arr[1].setWallet(w3);
} else if (Bank.King_Area[l_pos] = 3 && p != p3) {
		w1= p.getWallet() - 500;
		w4= arr[2].getWallet() +500;
		p.setWallet(w1);
		arr[2].setWallet(w4);

} else if (Bank.King_Area[l_pos] = 4 && p != p4) {
		w1= p.getWallet() - 500;
		w5= arr[3].getWallet() +500;
		p.setWallet(w1);
		arr[3].setWallet(w5);
}
return flag;
}
public boolean Menu4 (int amount Player []arr, int j) {
	for (int i=0; i< Bank.King_Area.length(); i++) {
		if (Bank.King_Area[i] = arr[j]) {
			int w = arr[j].getWallet() + amount;
			arr[j].setWallet(w);
			break;
	}
}
}
public boolean Menu5 (int amount Player []arr, int j , int k) {
	int counterp = 0;
	int counterp1 = 0;
	for (int i=0; i< Bank.King_Area.length(); i++) {
		if (Bank.King_Area[i] = arr[j]) {
			counterp++;
	    } else if (Bank.King_Area[i] = arr[k]) {
			counterp1++;
		}
	}
	if (counterp > counterp1) {
		int w = arr[j].getWallet() + amount;
		int w1 = arr[k].getWallet() - amount;
		arr[j].setWallet(w);
		arr[k].setWallet(w1);
} else if (counterp < counterp1) {
	    int w = arr[j].getWallet() - amount;
		int w1 = arr[k].getWallet() + amount;
	    arr[j].setWallet(w);
		arr[k].setWallet(w1);
	}
}
public void Menu7(Player []arr, int i) {
	int pos = arr[i].getPos() + 2;
	arr[i].setPos(pos);
	// Να βαλω ενα Ιφ στη main ωστε αν ειναι η 7η καρτα να ξαναριχνει ζαρι (καλωντας τη ρολ νταισ)
	//
}
public static void Menu8(int i, Player[]arr)  {
			if(Game.levelfinder(i, arr).equals("easy")) {
				int x = arr[i].wallet + 5000;
				arr[i].setWallet(x);
				Bank.setMoney(-5000);
			} else {
				System.out.println("O παίκτης" + arr[i] + " δεν βρίσκεται στο εύκολο επίπεδο.");
		}
	}

public static void Menu9(int i, Player[]arr) {
	if(Game.levelfinder(i, arr).equals("normal")) {
		System.out.println("Choose a player.");
		int z = input.nextInt();
		int x = arr[i].wallet - 2000;
		arr[i].setWallet(-x);
        int w = arr[z].wallet + 2000;
		arr[z].setWallet(w);
	} else {
		System.out.println("O παίκτης" + arr[i] + " δεν βρίσκεται στο μέτριο επίπεδο.");

	}
}
	public static void Menu10(int x, int []King_area, Player []arr) {
			if(Game.levelfinder(x, arr).equals("hard")) {
			int belong = 0;
			for(int i = 0; i<King_area.length; i++) {
				if(King_area[i] !=0) {
						if(King_area[i] == x) {
							belong = belong +=1;
						}
			     }
		     }
			if(belong >= 5) {
				int z = arr[x].wallet - 1000;
				arr[x].setWallet(z);
				Bank.setMoney(1000);
			} else {
				int z = arr[x].wallet + 1000;
				arr[x].setWallet(z);
				Bank.setMoney(-1000);
			}
	      } else {
		System.out.println("O παίκτης" + arr[x] + " δεν βρίσκεται στο δύσκολο επίπεδο.");
	}
}




public void Menu11(Player []arr, int k) {
 Player p = arr[k];
 Scanner input = new Scanner(System.in);
	int j = 0;
	int[] B = 0 ;
	for (int i=0; i<Bank.King_Area.length; i++) {
		if (Bank.KIng_Area[i] = 0) {
			B[j] = i;
			j++ ;
		}
}
System.out.println("Οι παρακάτω περιοχές είναι διαθέσιμες");
for (int i =0; i < B.length; i++) {
	System.out.println( + B[i]);
}
System.out.println("Θα ήθελες να αγοράσεις κάποια περιοχή;");
String answer = input.nextLine();
 if (answer.equals("YES")) {
	 System.out.println("Διάλεξε ποία περιοχή από τις διαθέσιμες θες να αγοράσεις.");
	 int area = input.nextLine();
	 int m = p.getWallet() - Bank.Price[area] ;
	 p.setWallet(m);
	 Bank.King_Area[area] = p;
	 Bank.setMoney(Bank.Price[area]);
 } else {
	 System.out.println(" Ο παίκτης" + p + " αποφάσισε να μην αγοράσει κάποια περιοχή.");
 }
}
public void Menu6 (Player []arr, int i , int j, int k, int l, int amount) {
	Player p = arr[i];
	Player p1 = arr[j];
	Player p2 = arr[k];
	Player p3 = arr[l];
	wallet = p.getWallet() - 3 * amount;
	wallet1 = p1.getWallet() + amount;
	wallet2 = p2.getWallet() + amount;
	wallet3 = p3.getWallet() + amount;
	p.setWallet(wallet);
	p1.setWallet(wallet1);
	p2.setWallet(wallet2);
	p3.setWallet(wallet3);
}
public void Menu12 Player []arr, int i , int j , int k , int l, int amount, int sum) {
    Player p = arr[i];
	Player p1 = arr[j];
	Player p2 = arr[k];
	Player p3 = arr[l];
	int counter = 0;
	for (int m=0; i < Bank.King_Area.length(); i++) {
		if (Bank.King_Area[m] = p) {
			counter++;
		}
	}
	if  (counter >= sum) {
			wallet = p.getWallet() + 3 * amount;
			wallet1 = p1.getWallet() - amount;
			wallet2 = p2.getWallet() - amount;
			wallet3 = p3.getWallet() - amount;
			p.setWallet(wallet);
			p1.setWallet(wallet1);
			p2.setWallet(wallet2);
	        p3.setWallet(wallet3);
} else {
		wallet = p.getWallet() - 3 * amount;
		wallet1 = p1.getWallet() + amount;
		wallet2 = p2.getWallet() + amount;
		wallet3 = p3.getWallet() + amount;
		p.setWallet(wallet);
		p1.setWallet(wallet1);
		p2.setWallet(wallet2);
	    p3.setWallet(wallet3);
	}









