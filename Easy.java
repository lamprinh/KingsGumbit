public class Easy extends Bank {
  protected static String[] easy_q;
  protected static String[] easy_a;
  public static void Showquestion( int pos) {
	  System.out.println("Question is:" + easy_q[pos]);
	}
  @Override public void giveMoney(player p ,int amount ) {
	  if (Game.Seat_check(int pos) == false ) {
	  if (Easy_anwser.checkanwser() == true) {
		  int x = p.wallet + amount;
		 p.setWallet(x);
	  }
	  }
	  @Override public void takeMoney(player p int amount) {
		  if (Game.Seat_check(int pos) == false) {
			  if (Easy_anwser.checkanwser() == false) {
				  int x = p.wallet - amount;
				   p.setWallet(x);
 @Override public void transferMoney(player p, player p1,int amount) {
	 if (Game.Seat_check(int pos)== true) {
	 if (Easy_anwser.checkanwser()== false) {
		 int x = p.wallet - 2* amount;
		 int x1 = p1.wallet + 2* amount;
		  p.setWallet(x);
		  p1.setWallet(x1);
	 } else {
		 double  x = p.wallet - 0.75* amount;
		 double x1 = p1.wallet + 0.75*amount;
	     p.setWallet(x);
	     p1.setWallet(x1);
}
 } }
 public static buyArea(int pos int amount ){
	  if (Game.Seat_check(pos)== true ){
	   if (Game.buy() == true){
		   if (Easy_anwser.checkanwser() == true) {
			   int x = p.wallet - amount ;
			   p.setWallet(x);
			   kn_cards[pos] = "p" ;
		   }
	   } else {
		   System.out.println("Player k decided not to buy the Area");
	   } }


	  }






