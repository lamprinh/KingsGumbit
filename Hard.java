
public class Hard extends Bank {
	public static void showQuestion(int pos, String[] Knowledge_cards  ) {
		System.out.println("The question is :" + Knowledge_cards[pos] );
	}
	static boolean ans = Easy_answers.Check_Answer();
	boolean belong = Game.Seat_check(k.getPos());
	
	@Override
	public void giveMoney(King k) {
		if(ans == true) {
			if (belong == false) {
				k.setWallet = Bank.getAmount() + 2000;
				Bank.setMoney(-2000);
			}
		}
	}

	@Override
	public void takeMoney(King k) {
		if(ans == false) {
			if(belong == false) {
				k.setWallet = Bank.getAmount() - 800;
				Bank.setMoney(800);
			}
		}
	}

	@Override
	public void tranfer(King k, King k1) {
		if(belong == true) {
			if(ans == true) {
				k.setWallet -= Bank.getAmount();
				k1.setWallet += Bank.getAmount();
			}else {
				k.setWallet -= (int)Bank.getAmount()*0.3;
				k1.setWallet += (int)Bank.getAmount()*0.3;
		    } 
		}
	}
	
	public static boolean correct() {
			if(ans == true) {
				return true;
			}else {
				return false;
			}
	}
}
	