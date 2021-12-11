
public class Normal extends Bank {
	protected static String[] normal_q;
	protected static int[] normal_a;
	public static String showQuestion(Player p) {
		System.out.println("The question is :" + normal_q[p.getPos()] );
		return normal_q[p.getPos()];
	}
	
	@Override
	public void giveMoney(Player p) {
		if(Normal_answer.check_Answer(normal_a, p) == true) {
			if (Game.Seat_check(p.getPos()) == false) {
				p.setWallet(Bank.getAmount() + 1000);
				Bank.setMoney(-1000);
			}
		}
	}

	@Override
	public void takeMoney(Player p) {
		if(Normal_answer.check_Answer(normal_a, p) == false) {
			if(Game.Seat_check(p.getPos()) == false) {
				p.setWallet(Bank.getAmount() - 700);
				Bank.setMoney(700);
			}
		}
	}

	@Override
	public void tranfer(Player p, Player p0) {
		if(Game.Seat_check(p.getPos()) == true) {
			if(Normal_answer.check_Answer(normal_a, p) == true) {
				p.setWallet(-Bank.getAmount());
				p0.setWallet(+Bank.getAmount());
			}else {
				p.setWallet(-(int)Bank.getAmount()*2/4);
				p0.setWallet(+(int)Bank.getAmount()*2/4);
			} 
		}
	}

	@Override
	public void buyProperty(Player p, String[] kn_cards) {
		if(Game.Seat_check(p.getPos()) == true) {
			if(Game.buy() == true) {
				if(Normal_answer.check_Answer(normal_a, p) == true) {
					p.setWallet(-Price[p.getPos()]);
					kn_cards[p.getPos()] = p.getCharacter();
				}
			} else {
				System.out.println("The player decided not to buy the area.");
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
