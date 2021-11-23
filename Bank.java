
import java.util.Scanner;

public class Bank {
	static Scanner input = new Scanner(System.in);
	private int money;
	public Bank() {// ������������� ��� �� ������� ��� ����� ���� ��������� money
		this.money = 300000;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void shareMoney(King k) { // ������� ��� �� �������� ���� ���� ��� ���������� ��� �� �������� ���� ���������� ����� 
		                             //�� ������� ��� ���� �������
		System.out.println("The game starts , the kings will receive a sum of money.");
		k.wallet += 2000;
		this.money -= 2000;
	}
	
	static Bank pay = new Bank();
	
	
	public static void giveMoney(King k, String kn_cards[] ) { // ������� ��� �������� ���� ����� � �������� ������� ��� �������� ��� �� ������� ��� �� ��� ����� 
		                                                       //�� ����� �� ����� � �� ����� ���� ������ ��� ��������� ���� 
		                                                       //������ ��������� � ���������� ��� ����� ��� �������� �� ��������� ��� � �������� ����� ����� 
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
	
	public void takeMoney(King k) {// ������� ��� ������� ��������� ���� ��� ������ � �� ��������� ���� ������� �� � �������� ����� �����.
			k.wallet -= 1200;
			this.money += 1200;
    }
     
    public static String[] Prop = new String[3];// ����������� 2 ������������� ������� ����������� ��� ������������ �� 
                                                //	�������� ��� �����
	                                            //  ������ �� ��������� ��� �� main ��� �� ��������������
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
	
	public static int[] getPrices(int[] t) {// ���������� 3 ������� get ��� �� ������� �� ����� ������� ������ ���� �������
		t = Price;
		return t;
	}
	
	public static String[] getProperties(String[] t) {
		t = Prop;
		return t;
	}
	
	public static double tax(int p) {// ������� ��� ���������� 10% ���� ������� ��� ��������� �� ���������� �������
		return p * 0.1 ;
	}
	
	public static void salary(King k) {// ������� ��� �� �������� ��� �� ��������� ���� �������� ��� ���� ��� ��� ������� ����� ����� ��� ��� ��������
		k.wallet += 10000;
	}
	
	public static void buyProperty(King k, String p, String kn_cards[]) {// ������� ��� �� �������� ��� �� �������� ���� �������� ��� ������� ��� ��� �������
		
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
    
	public static void transfer(King k1, King k2, String p) {// ������� ��� �� �������� ���� ���� �������� �� ������ �� �������� ���� �� ���� ���� 
		
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
