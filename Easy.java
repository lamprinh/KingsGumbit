public class Easy extends Bank {
  protected static String[] easy_q;
  protected static String[] easy_a;
  public static void Showquestion( int pos) {
	  System.out.println("Question is:" + easy_q[pos]);
	}
  @Override public void giveMoney(player p ,int amount ) {
	  if (Game.Seat_check(int pos) == false ) {
	  if (Easy_anwser.checkanwser() == true) {
		  p.wallet= p.wallet +p.setWallet(amount);
	  } else {
	      p.wallet = p.wallet + p.setWallet(-amount);

	  } }}
 @Override public void transferMoney(player p, player p1,int amount) {
	 if (Game.Seat_check(int pos)== true) {
	 if (Easy_anwser.checkanwser()== false) {
		 p.wallet= p.wallet+ p.setWallet(-2*amount);
		 p1.wallet = p1.wallet +p1.setWallet(2* amount);
	 } else {
	    p.wallet= p.wallet+ p.setWallet(-0.75*ammount);
	    p1.wallet= p1.wallet + p1.setWallet(0.75*amount);
}
 } }
 public static buyArea(int pos){
	  if (Game.Seat_check(pos)== true ){
	   if (Game.buy() == true){
		   if (Easy_anwser.checkanwser() == true) {
			   k.setWallet(-ammount);
			   kn_cards[pos] = "k" ;
		   }
	   } else {
		   System.out.println("Player k decided not to buy the Area");
	   } }


	  }






