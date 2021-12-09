
public class Normal extends Bank {
	public static void showQuestion(int pos, String[] Knowledge_cards  ) {
		System.out.println("The question is :" + Knowledge_cards[pos] );
	}
	static boolean ans = Easy_answers.Check_Answer();
	boolean belong = Game.Seat_check(k.getPos());
	
	@Override
	public void giveMoney(King k) {
		if(ans == true) {
			if (belong == false) {
				k.setWallet = Bank.getAmount() + 1000;
				Bank.setMoney(-1000);
			}
		}
	}

	@Override
	public void takeMoney(King k) {
		if(ans == false) {
			if(belong == false) {
				k.setWallet = Bank.getAmount() - 700;
				Bank.setMoney(700);
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
				k.setWallet -= (int)Bank.getAmount()*2/4;
				k1.setWallet += (int)Bank.getAmount()*2/4;
			} 
		}
	}
	
	public static boolean roll_result() {
			if(Game.roll_1()%2 == 0) {
				return true;
			}else {
				return false;
			}
	}
}
