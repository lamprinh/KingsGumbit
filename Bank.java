
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
		System.out.println("The game starts , the king will receive a sum of money." + p);
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
	
	public abstract void buyProperty(Player p, String kn_cards[]) ;// ������� ��� �� �������� ��� �� �������� ���� �������� ��� ������� ��� ��� �������
	
	public static String[] Prop = new String[20];// ����������� 2 ������������� ������� ����������� ��� ������������ �� 
                                                //	�������� ��� �����
	                                            //  ������ �� ��������� ��� �� main ��� �� ��������������
	public static void setNamesArray() {
		Prop[0]= "�����";
		Prop[1]= "���������";
		Prop[2]= "�������";
		Prop[3]= "�����";
		Prop[4]= "�������";
		Prop[5]= "���� ������";
		Prop[6]= "������";
		Prop[7]= "�������";
		Prop[8]= "�����";
		Prop[9]= "�����";
		Prop[10]= "K�����";
		Prop[11]= "���� ������";
		Prop[12]= "������";
		Prop[13]= "������";
		Prop[14]= "��������";
		Prop[15]= "��������";
		Prop[16]= "�������";
		Prop[17]= "���� ������";
		Prop[18]= "�����������";
		Prop[19]= "��������";
		Prop[20]= "��������";
		Prop[21]= "�������";
		Prop[22]= "����";
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
