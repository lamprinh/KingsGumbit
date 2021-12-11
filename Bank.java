
public abstract class Bank {
	private static int money  = 30000000;

	public static int getMoney() {
		return money;
	}
	
	public static void setMoney(int mon) {
		 money += mon;
	}
	
	public void shareMoney(Player p) { // ������� ��� �� �������� ���� ���� ��� ���������� ��� �� �������� ���� ���������� ����� 
		                             //�� ������� ��� ���� �������
		System.out.println("The game starts , the kings will receive a sum of money.");
		p.wallet += 5000;
		money -= 5000;
	}
	
	public static final int AMOUNT = 2000;
	public static int getAmount() {
		return AMOUNT;
	}
	
	public abstract void  giveMoney(Player p); //{ // ������� ��� �������� ���� ����� � �������� ������� ��� �������� ��� �� ������� ��� �� ��� ����� 
		                                                       //�� ����� �� ����� � �� ����� ���� ������ ��� ��������� ���� 
		                                                       //������ ��������� � ���������� ��� ����� ��� �������� �� ��������� ��� � �������� ����� ����� 
	  
	
	public abstract void takeMoney(Player p); //{// ������� ��� ������� ��������� ���� ��� ������ � �� ��������� ���� ������� �� � �������� ����� �����.
     
	public abstract void tranfer(Player p, Player p0); 
	
	public abstract void buyProperty(Player p, int pos, String kn_cards[]) ;// ������� ��� �� �������� ��� �� �������� ���� �������� ��� ������� ��� ��� �������
	
	public static String[] Prop = new String[20];// ����������� 2 ������������� ������� ����������� ��� ������������ �� 
                                                //	�������� ��� �����
	                                            //  ������ �� ��������� ��� �� main ��� �� ��������������
	public static void setNamesArray() {
		Prop[0]= "Athina";
		Prop[1]= "Kalavrita";
		Prop[2]= "Tripoli";
		Prop[3]= "Lamia";
		Prop[4]= "Nafplio";
		Prop[5]= "Knosos";
		Prop[6]= "Delfoi";
		Prop[7]= "Faistos";
		Prop[8]= "Nemea";
		Prop[9]= "Ithaki";
		Prop[10]= "Sounio";
		Prop[11]= "Sparti";
		Prop[12]= "Amfipoli";
		Prop[13]= "Salamina";
		Prop[14]= "Viotia";
		Prop[15]= "Thessaloniki";
		Prop[16]= "Ioannina";
		Prop[17]= "Korinthos";
		Prop[18]= "Arkadia";
		Prop[19]= "Ydra";
	}
	
	public static int[] Price = new int[20];
	public static void setPricesArray() {
		Price[0]= 15000;
		Price[1]= 8000;
		Price[2]= 9000;
		Price[3]= 7500;
		Price[4]= 8500;
		Price[5]= 10000;
		Price[6]= 95000;
		Price[7]= 9000;
		Price[8]= 11000;
		Price[9]= 12000;
		Price[10]= 11500;
		Price[11]= 8000;
		Price[12]= 10500;
		Price[13]= 9600;
		Price[14]= 5500;
		Price[15]= 12000;
		Price[16]= 7500;
		Price[17]= 5000;
		Price[18]= 7000;
		Price[19]= 6000;
	}	
	
	public static int[] getPrices(int[] t) {// ���������� 3 ������� get ��� �� ������� �� ����� ������� ������ ���� �������
		t = Price;
		return t;
	}
	
	public static String[] getProperties(String[] t) {
		t = Prop;
		return t;
	}
		
	public static void salary(Player p ) {// ������� ��� �� �������� ��� �� ��������� ���� �������� ��� ���� ��� ��� ������� ����� ����� ��� ��� ��������
		p.setWallet (+10000);
	}	
}
