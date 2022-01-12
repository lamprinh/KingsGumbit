
public abstract class Bank {
	public Bank() {
	}
	private static int money  = 30000000;

	public static int getMoney() { // ������� ��� �������� ��� �� ���������� �� ���� ��� �������� ��� ���� ��� ������� ��� � �������
		return money;
	}
	
	public static void setMoney(int mon) {// ������� ��� �������� ��� �� ����������� �� ���� ��� �������� ��� ���� ��� ������� ��� � �������
		 money += mon;
	}
	
	public static void shareMoney(Player [] arr, int i) { // ������� ��� �� �������� ���� ���� ��� ���������� ��� �� �������� ���� ���������� ����� 
		                             //�� ������� ��� ���� �������
		System.out.println("The game starts , the king will receive a sum of money." + arr[i]);
		int x = 5000;
		arr[i].setWallet(x);
		Bank.setMoney(-x);
	}
	
	public static final int AMOUNT = 2000;
	public static int getAmount() { // ������� ��� ���������� ��� ���������������� ��� �������� � ������� �� ��������� ����� �� �������
		return AMOUNT;
	}
	
	public  abstract  void  giveMoney(int i, Player []arr);  // ������� ��� �������� ���� ����� � �������� ������� ����� ��������  �� ������� ��� �� ��� ����� 
		                                                       //�� �����  �� ����� ���� ������ ��� ��������� ����
	  
	
	public abstract void takeMoney(int i, Player []arr); // ������� ��� ������� ��������� ���� ��� ������ � �� ��������� ���� ������� �� � �������� ����� �����.
     
	public abstract void transfer(int i, int i0, Player []arr);// ������� ��� �������� ��� �� ��������� ���� ��� ��� ��� ������ ���� ���� �� ��������� ��� �
	                                                           // ������� ��� ������ ��������� �� ���� ����� �� ���������� �������
	
	public abstract void buyProperty(int i, Player []arr) ;// ������� ��� �� �������� ��� �� �������� ���� �������� ��� ������� ��� ��� �������
	
	public static String[] Prop = new String[24]; // ������� ��� �������� �� ������� ��� ��������
	public static void setNamesArray() {
		Prop[0]= "��������";
		Prop[1]= "�����";
		Prop[2]= "���������";
		Prop[3]= "�������";
		Prop[4]= "�����";
		Prop[5]= "�������";
		Prop[6]= "���� ������";
		Prop[7]= "������";
		Prop[8]= "�������";
		Prop[9]= "�����";
		Prop[10]= "�����";
		Prop[11]= "K�����";
		Prop[12]= "���� ������";
		Prop[13]= "������";
		Prop[14]=  "������";
		Prop[15]= "��������";
		Prop[16]= "��������";
		Prop[17]= "�������";
		Prop[18]= "���� ������";
		Prop[19]= "�����������";
		Prop[20]= "��������";
		Prop[21]= "��������";
		Prop[22]= "�������";
		Prop[23] = "����";
	}
	
	public static int[] Price = new int[24]; // ������� ��� �������� ��� ����� ������ ��� ��� ��������
	public static void setPricesArray() {
		Price[0]= 0;
		Price[1]= 15000;
		Price[2]= 8000;
		Price[3]= 9000;
		Price[4]= 7500;
		Price[5]= 8500;
		Price[6]= 0;
		Price[7]= 10000;
		Price[8]= 95000;
		Price[9]= 9000;
		Price[10]= 11000;
		Price[11]= 12000;
		Price[12]= 0;
		Price[13]= 11500;
		Price[14]= 8000;
		Price[15]= 10500;
		Price[16]= 9600;
		Price[17]= 5500;
		Price[18]= 0;
		Price[19]= 12000;
		Price[20]= 7500;
		Price[21]= 5000;
		Price[22]= 7000;
		Price[23]= 6000;
	}
	
	public static int[] King_area = new int[24];// ������� ��� �������� ��� ������ ��� ������ ���� ����� ������ � �������
	public static void setArea() {
		King_area[0] = 0;
		King_area[1] = 0;
		King_area[2] = 0;
		King_area[3] = 0;
		King_area[4] = 0;
		King_area[5] = 0;
		King_area[6] = 0;
		King_area[7] = 0;
		King_area[8] = 0;
		King_area[9] = 0;
		King_area[10] = 0;
		King_area[11] = 0;
		King_area[12] = 0;
		King_area[13] = 0;
		King_area[14] = 0;
		King_area[15] = 0;
		King_area[16] = 0;
		King_area[17] = 0;
		King_area[18] = 0;
		King_area[10] = 0;
		King_area[20] = 0;
		King_area[21] = 0;
		King_area[22] = 0;
		King_area[23] = 0;
	}
	public static int[] getPrices(int[] t) {// ���������� 3 ������� get ��� �� ������� �� ����� ������� ������ ���� �������
		t = Price;
		return t;
	}
	
	public static String[] getProperties(String[] t) {
		t = Prop;
		return t;
	}
		
	public static void salary(int i, Player []arr ) {// ������� ��� �� �������� ��� �� ��������� ���� �������� ��� ���� ��� ��� ������� ����� ����� ��� ��� ��������
		int x = arr[i].wallet + 10000;
		arr[i].setWallet (x);
		Bank.setMoney(-10000);
	}
}
