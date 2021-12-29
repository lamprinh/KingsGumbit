public class Easy extends Bank {
  protected static String[] easy_q;
  protected static String[] easy_a;
  public static void Showquestion( Player p) {
	  System.out.println("Question is:" + easy_q[p.getPos()]);
	}
  @Override public void giveMoney(player p ) {
	  if (Game.Seat_check(p.getPos()) == false ) {
	  if (Easy_anwser.checkanwser() == true) {
		  int x = p.wallet +Bank.getamount();
		 p.setWallet(x);
	  }
	  }
	  @Override public void takeMoney(player p ) {
		  if (Game.Seat_check(int pos) == false) {
			  if (Easy_anwser.checkanwser() == false) {
				  int x = p.wallet - Bank.getAmount();
				   p.setWallet(x);
 @Override public void transferMoney(player p, player p1) {
	 if (Game.Seat_check(int pos)== true) {
	 if (Easy_anwser.checkanwser()== false) {
		 int x = p.wallet - 2* Bank.getAmount();
		 int x1 = p1.wallet + 2* Bank.getAmount();
		  p.setWallet(x);
		  p1.setWallet(x1);
	 } else {
		 double  x = p.wallet - 0.75* Bank.getAmount();
		 double x1 = p1.wallet + 0.75*Bank.getAmount();
	     p.setWallet(x);
	     p1.setWallet(x1);
}
 } }
 @Override public static buyProperty(Player p String[] kn_cards){
	  if (Game.Seat_check(p.getPos())== true ){
	   if (Game.buy() == true){
		   if (Easy_anwser.checkanwser() == true) {
			   int x = p.wallet - Bank.Price(p.getPos();
			   p.setWallet(x);
			   kn_cards[p.getPos()] = "p" ;
		   }
	   } else {
		   System.out.println("Player k decided not to buy the Area");
	   } }


	  }






