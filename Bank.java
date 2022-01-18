
public abstract class Bank {

	private static int money = 30000000; // private metavliti pou periexei to poso po katexei h trapeza

	public static int getMoney() { // methodos pou kaleitai gia na epistrepsei ton arithmo twn xrimatwn pou exei
									// sti diathesi tis i trapeza
		return money;
	}

	public static void setMoney(int mon) {// methodos pou kaleitai gia na tropopoihsei to poso twn xrimatwn pou exei sti
											// diathesi tis h trapeza
		money += mon;
	}

	public static final int AMOUNT = 2000; // dimosia metabliti pou periexei ena kathorismeno poso
											// pou lamvanei h xanei o paiktis analoga me to an exei apatisei swsta se
											// erwtisi

	public static int getAmount() { // methodos pou epistrefei ena sigekrimeno poso pou kerdizei o paiktis an
									// apantisei swsta se erwtisi
		return AMOUNT;
	}

	public abstract void giveMoney(int i, Player[] arr);

	public abstract void takeMoney(int i, Player[] arr);

	// dilwsi abstract methodwn pou tha apoktisoun
	public abstract void transferTrue(int i, Player[] arr); // swma stiw klaseis Hard, Normal kai Easy

	public abstract void transferFalse(int i, Player[] arr);

	public abstract void buyProperty(int i, Player[] arr);

	public static String[] Prop = new String[24]; // dilwsi pinaka pou perixei ta onomata twn perioxwn tou tablo

	public static void setNamesArray() { // methodos pou kaleitai sti main otan xekinaei to paixnidi gia to gemisma tou
											// pinaka
		Prop[0] = "��������";
		Prop[1] = "�����";
		Prop[2] = "���������";
		Prop[3] = "�������";
		Prop[4] = "�����";
		Prop[5] = "�������";
		Prop[6] = "���� ������";
		Prop[7] = "������";
		Prop[8] = "�������";
		Prop[9] = "�����";
		Prop[10] = "�����";
		Prop[11] = "K�����";
		Prop[12] = "���� ������";
		Prop[13] = "������";
		Prop[14] = "������";
		Prop[15] = "��������";
		Prop[16] = "��������";
		Prop[17] = "�������";
		Prop[18] = "���� ������";
		Prop[19] = "�����������";
		Prop[20] = "��������";
		Prop[21] = "��������";
		Prop[22] = "�������";
		Prop[23] = "����";
	}

	public static int[] Price = new int[24]; // dilwsi pinaka pou perixei tis times pou antistoixoun stis perioxes tou
												// tablo

	public static void setPricesArray() { // methodos pou kaleitai sti main otan xekinaei to paixnidi gia to gemisma tou
											// pinaka
		Price[0] = 0;
		Price[1] = 15000;
		Price[2] = 8000;
		Price[3] = 9000;
		Price[4] = 7500;
		Price[5] = 8500;
		Price[6] = 0;
		Price[7] = 10000;
		Price[8] = 95000;
		Price[9] = 9000;
		Price[10] = 11000;
		Price[11] = 12000;
		Price[12] = 0;
		Price[13] = 11500;
		Price[14] = 8000;
		Price[15] = 10500;
		Price[16] = 9600;
		Price[17] = 5500;
		Price[18] = 0;
		Price[19] = 12000;
		Price[20] = 7500;
		Price[21] = 5000;
		Price[22] = 7000;
		Price[23] = 6000;
	}

	public static int[] King_area = new int[24]; // dilwsi pinaka pou perixei ton arithmo tou paikti pou agorase perioxi

	public static void setArea() { // methodos pou kaleitai sti main otan xekinaei to paixnidi gia to gemisma tou
									// pinaka
		King_area[0] = 9;
		King_area[1] = 9;
		King_area[2] = 9;
		King_area[3] = 9;
		King_area[4] = 9;
		King_area[5] = 9;
		King_area[6] = 9;
		King_area[7] = 9;
		King_area[8] = 9;
		King_area[9] = 9;
		King_area[10] = 9;
		King_area[11] = 9;
		King_area[12] = 9;
		King_area[13] = 9;
		King_area[14] = 9;
		King_area[15] = 9;
		King_area[16] = 9;
		King_area[17] = 9;
		King_area[18] = 9;
		King_area[19] = 9;
		King_area[20] = 9;
		King_area[21] = 9;
		King_area[22] = 9;
		King_area[23] = 9;
	}

	public static void salary(int i, Player[] arr) { // methodos pou kaleitai otan o paiktis perna tin afetiria gia na
														// lamvanei ena poso
		arr[i].setWallet(10000);
		Bank.setMoney(-10000);
	}
}
