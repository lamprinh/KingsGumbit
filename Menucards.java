package paketolamp;

import java.util.Scanner;

public class Menucards {
	public static void Menu1(int amount, Player[] arr, int i) {
		System.out.println(arr[i].getCharacter() + " Pare 500 euro ap tous upoloipous paiktes.");
		arr[i].getWallet();
		arr[i].setWallet(3 * amount);
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != p) {
				arr[j].getWallet();
				arr[j].setWallet(-amount);
				System.out.println("O apaiktis  " + arr[j].getCharacter() + "  exei meiosi sto portofoli tou kata  "
						+ amount + " euro kai pleon exei " + arr[j].getWallet() + " euro.");
			}
		}
		System.out.println("O paiktis  " + p.getCharacter() + "  exei afksisi sto portofoli tou kata " + 3 * amount
				+ " euro kai pleon exei " + p.getWallet() + " euro.");
	}

	public static void Menu2(int i, Player[] arr) {
		System.out.println(arr[i].getCharacter() + " Metakinisou 3 theseis piso.");
		Player p = arr[i];
		p.getPos();
		p.setPos(-3);
		System.out.println(p.getCharacter() + " briskesai stin thesi " + p.getPos() + ".");
	}

	public static void Menu3(int pos, Player[] arr, int i) {
		System.out.println(arr[i].getCharacter()
				+ " Pigaine stous delfous. An anikei se kapoion i perioxi tou ofeileis 500 euro. An peraseis apo tin afetiria sou afairountai 1000euro.");
		Player p = arr[i];
		int f_pos = p.getPos();
		p.setPos(pos - f_pos);
		int l_pos = p.getPos();
		if (pos > f_pos) {
			System.out.println("O paiktis  " + p.getCharacter() + " brisketai stin thesi " + p.getPos() + ".");
		} else if (pos < f_pos) {
			p.setWallet(-1000);
			System.out.println("O paiktis  " + p.getCharacter()
					+ " pernaei apo tin afetiria alla tou afairountai ta 1000 euro pou dikaioutai.");
			System.out.println("O paiktis  " + p.getCharacter() + " brisketai stin thesi " + p.getPos() + ".");
		}
		for (int j = 0; j < arr.length; j++) {
			if (Bank.King_area[l_pos] == j && i != j) {
				p.setWallet(-500);
				arr[j].setWallet(500);
				System.out.println("Afaireitai apo ton paikti " + p.getCharacter()
						+ " to poso twn 500euro kai metaferetai ston paikti  " + arr[j].getCharacter()
						+ " . H aksia twn portofoliwn tous isoutai me " + p.getWallet() + arr[j].getWallet()
						+ " antistoixa.");
			}
		}
	}

	public static void Menu4(int amount, Player[] arr, int j) {
		System.out.println(arr[j].getCharacter() + " Afksithikan oi aksies twn perioxwn pou katexeis pare 250 euro.");
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == j) {
				arr[j].setWallet(amount);
				Bank.setMoney(-amount);
				System.out.println(" O paiktis " + arr[j].getCharacter() + " pairnei " + amount
						+ " euro kai pleon exei " + arr[j].getWallet() + " euro.");
				break;
			}
		}
	}

	public static void Menu5(int amount, Player[] arr, int j, int k) { // An o epomenos paiktis katexei perissoteres
																		// perioxes tou ofeileis 500 euro. Diaforetika
																		// sou ofeilei 500 euro.
		System.out.println(arr[j].getCharacter()
				+ "An o epomenos paiktis katexei perissoteres perioxes tou ofeileis 500 euro. Diaforetika sou ofeilei 500 euro.");
		int counterp = 0;
		int counterp1 = 0;
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == j) {
				counterp++;
			} else if (Bank.King_area[i] == k) {
				counterp1++;
			}
		}
		if (counterp > counterp1) {
			arr[j].setWallet(amount);
			arr[k].setWallet(-amount);
			System.out.println("O paiktis  " + arr[j].getCharacter() + " katexei perissoteres perioxes apo ton paikti "
					+ arr[k].getCharacter() + " kai afksanetai to portofoli tou kata " + amount + " euro. Pleon exei "
					+ arr[j].getWallet());
			System.out.println("O paiktis  " + arr[k].getCharacter() + " katexei ligoteres perioxes apo ton paikti "
					+ arr[j].getCharacter() + " kai meionetai to portofoli tou kata " + amount + " euro. Pleon exei "
					+ arr[k].getWallet());
		} else if (counterp < counterp1) {
			arr[j].setWallet(-amount);
			arr[k].setWallet(amount);
			System.out.println("O paiktis  " + arr[k].getCharacter() + " katexei perissoteres perioxes apo ton paikti "
					+ arr[j].getCharacter() + "  kai afksanetai to portofoli tou kata " + amount + " euro. Pleon exei "
					+ arr[k].getWallet());
			System.out.println("O paiktis " + arr[j].getCharacter() + " katexei ligoteres perioxes apo ton paikti "
					+ arr[k].getCharacter() + " kai meionetai to portofoli tou kata " + amount + " euro. Pleon exei "
					+ arr[j].getWallet());

		}
	}

	public static void Menu7(Player[] arr, int i) {
		System.out.println(arr[i].getCharacter() + " Kinisou 2 theseis mprosta.");
		arr[i].setPos(2);
		System.out.println("O paiktis " + arr[i].getCharacter() + " brisketai stin thesi " + arr[i].getPos() + ".");
	}

	public static void Menu8(int i, Player[] arr) {
		System.out.println(arr[i].getCharacter() + " An to epipedo duskolias einai eukolo sou afairountai 5000 euro.");
		if (Game.levelfinder(i, arr).equals("easy")) {
			arr[i].setWallet(-5000);
			Bank.setMoney(5000);
			System.out.println(" To portofoli tou paikti " + arr[i].getCharacter()
					+ " meiothike kata 5000 euro kai pleon isoutai me " + arr[i].getWallet() + " ευρώ.");
		} else {
			System.out.println("O paiktis " + arr[i].getCharacter() + " den brisketai sto eukolo epipedo.");
		}
	}

	public static void Menu9(int i, Player[] arr) {
		System.out.println(arr[i].getCharacter()
				+ " An to epipedo duskolias einai metrio ofeileis 5000 euro se enan apo tous paiktes. Dikaiousai na dialekseis.");
		Scanner input = new Scanner(System.in);
		if (Game.levelfinder(i, arr).equals("normal")) {
			boolean flag = false;
			int z=-1;
			while (flag == false) {
		    System.out.println("Dialekse ton paikti.");
		    z = input.nextInt();
		    for ( int l=0; l<arr.length; l++) {
				 if ( arr[z] == arr[l]) {
					flag = true;
				}
			}
			   if (flag == false) {
				   System.out.println("Edwses mi diathesimi epilogi. Dwse ksana apantisi.");
			   }
		   }
			arr[i].setWallet(-5000);
			arr[z].setWallet(5000);
			System.out.println(" O paiktis  " + arr[z].getCharacter() + " pairnei 5000 euro kai pleon exei "
					+ arr[z].getWallet() + " euro.");
			System.out.println(" O paiktis   " + arr[i].getCharacter() + " xanei 5000 euro kai pleon exei "
					+ arr[i].getWallet() + " euro.");
		} else {
			System.out.println("O paiktis" + arr[i].getCharacter() + " den brisketai sto metrio epipedo.");

		}
	}

	public static void Menu10(int x, int[] King_area, Player[] arr) {
		System.out.println(arr[x].getCharacter()
				+ " An to epipedo duskolias einai duskolo kai katexeis 5 i perissoteres perioxes xaneis 1000 euro. Allios kerdizeis 1000 euro.");
		if (Game.levelfinder(x, arr).equals("hard")) {
			int belong = 0;
			for (int i = 0; i < King_area.length; i++) {
				if (King_area[i] != 9) {
					if (King_area[i] == x) {
						belong = belong += 1;
					}
				}
			}
			if (belong >= 5) {
				arr[x].setWallet(-1000);
				Bank.setMoney(1000);
				System.out.println(
						"O paiktis " + arr[x].getCharacter() + " xanei apo to portofoli tou " + 1000 + " euro.");
			} else {
				arr[x].setWallet(1000);
				Bank.setMoney(-1000);
				System.out.println(
						"O paiktis " + arr[x].getCharacter() + " prosthetei sto portofoli tou " + 1000 + " euro.");
			}
		} else {
			System.out.println("O paiktis " + arr[x].getCharacter() + " den brisketai sto duskolo epipedo.");
		}
	}

	public static void Menu11(Player[] arr, int k) {
		System.out.println(arr[k].getCharacter()
				+ " Dikaiousai na agoraseis mia mi katexomeni perioxi xwris na apantiseis kapoia erotisi.");
		Player p = arr[k];
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		int j = 0;
		int[] B = new int[24];
		for (int i = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[i] == 9) {
				B[j] = i;
				flag = true;
				j++;
			}
		}
		if (flag) {
			System.out.println("Oi parakato perioxes einai diathesimes.");
			for (int i = 0; i < B.length; i++) {
				System.out.println(+B[i]);
			}
		} else {
			System.out.println("Den yparxei diathesimi perioxi.");
		}
		System.out.println("Tha itheles na agoraseis kapoia perioxi;");
		System.out.println("Dektes apantiseis:(Nai/Oxi)");
		String answer = input.nextLine();
				while ( answer.compareTo("Nai")!=0 && answer.compareTo("Oxi")!=0 ) {
					System.out.println("Den edwses mia apo tis diathesimes apantiseis. Dektes apantiseis: (Nai/Oxi)");
					System.out.println("Ksanadwse apantisi");
					answer = input.nextLine();
}
		if (answer.equals("Nai")) {
			System.out.println("Dialekse poia apo tis diathesimes perioxes thes na agoraseis.");
			int area = input.nextInt();
			p.setWallet(-Bank.Price[area]);
			Bank.King_area[area] = k;
			Bank.setMoney(Bank.Price[area]);
			System.out.println(
					"O paiktis " + p.getCharacter() + " xanei apo to portofoli tou " + Bank.Price[area] + " euro");
			System.out.println("O paiktis " + p.getCharacter() + " agorase tin perioxi " + Bank.Prop[area] + ".");
		} else {
			System.out.println("O paiktis " + p.getCharacter() + " apofasise na min agorasei kapoia perioxi.");
		}
	}

	public static void Menu6(Player[] arr, int i, int amount) {
		System.out.println(arr[i].getCharacter() + " Dose 600 euro stous upoloipous paiktes.");
		Player p = arr[i];
		for (int j = 0; j < arr.length; j++) {
			if (j != i) {
				p.setWallet(-amount);
				System.out.println("O paiktis " + p.getCharacter() + "xanei apo to portofoli tou " + amount + " euro ");
				arr[j].setWallet(amount);
				System.out.println(
						"O paiktis" + arr[j].getCharacter() + " prosthetei sto portofoli tou " + amount + " euro ");
			}
		}
	}

	public static void Menu12(Player[] arr, int i, int amount, int sum) {
		System.out.println(
				"An katexeis panw apo 4 perioxes pairneis 700 euro apo tous upoloipous paiktes. Diaforetika dineis 700 euro stous upoloipous paiktes.");
		Player p = arr[i];
		int counter = 0;
		for (int m = 0; i < Bank.King_area.length; i++) {
			if (Bank.King_area[m] == i) {
				counter++;
			}
		}
		if (counter >= sum) {
			for (int j = 0; j < arr.length; j++) {
				int num = 0 ;
				if (j != i) {
					num++ ;
					p.setWallet(amount);
					arr[j].setWallet(-amount);
					System.out.println(
							"O paiktis " + p.getCharacter() + " prosthetei sto portofoli tou " + num * amount + " euro.");
					System.out.println("O paiktis " + arr[j].getCharacter() + " xanei " + amount + " euro.");
				}
			}
		} else {
			for (int j = 0; j < arr.length; j++) {
				int num = 0 ;
				if ( j!= i) {
				num++ ;
				p.setWallet(-amount);
				arr[j].setWallet(amount);
				System.out.println(
						"O paiktis " + arr[j].getCharacter() + " prosthetei sto portofoli tou " + amount + " euro.");
				System.out.println("O paiktis " + p.getCharacter() + " xanei " + num * amount + " euro.");

			}

		}
	}
}}
