
public class Hard extends Bank {
	protected static String[] hard_q;
	protected static String[] hard_a;
	public static void showQuestion(Player p, String[] hard_q  ) {
		System.out.println("The question is :" + hard_q[p.getPos()] );
	}
	
	@Override
	public void giveMoney(Player p) {
		if(Hard_answer.check_Answer(hard_a, p) == true) {
			if (Game.Seat_check(p.getPos()) == false) {
				p.setWallet(Bank.getAmount() + 2000);
				Bank.setMoney(-2000);
			}
		}
	}

	@Override
	public void takeMoney(Player p) {
		if(Hard_answer.check_Answer(hard_a, p) == false) {
			if(Game.Seat_check(p.getPos()) == false) {
				p.setWallet(Bank.getAmount() - 800);
				Bank.setMoney(800);
			}
		}
	}

	@Override
	public void tranfer(Player p, Player p0) {
		if(Game.Seat_check(p.getPos()) == true) {
			if(Hard_answer.check_Answer(hard_a, p) == true) {
				p.setWallet(-Bank.getAmount());
				p0.setWallet(+Bank.getAmount());
			}else {
				p.setWallet(-(int)(Bank.getAmount() - Bank.getAmount()*0.3));
				p0.setWallet(+(int)(Bank.getAmount() + Bank.getAmount()*0.3));
		    } 
		}
	}
	
	public static boolean correct(Player p) {
			if(Hard_answer.check_Answer(hard_a, p) == true) {
				return true;
			}else {
				return false;
			}
	}

	@Override
	public void buyProperty(Player p, String[] kn_cards) {
		if(Game.Seat_check(p.getPos()) == true) {
			if(Game.buy() == true) {
				if(Hard_answer.check_Answer(hard_a, p) == true) {
					p.setWallet(- (int) (Price[p.getPos()] - Price[p.getPos()] * 0.3));
					kn_cards[p.getPos()] = p.getCharacter();
				}
			} else {
				System.out.println("The player decided not to buy the area.");
			}
		}
	}
}
	