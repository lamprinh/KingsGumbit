public class Easy extends Bank {
  protected static String[] easy_q;
  protected static String[] easy_a;
  public static void Showquestion( int pos) {
	  if (Game.buy()== true) {
	  System.out.println("Question is:" + easy_q[pos]);
  } else {
	  System.out.println("Player decided not to buy the area");
  }}
  public void giveMoney(King k ,int ammount ) {
	  if (Game.Seat_check(int pos) == false ) {
	  if (Easy_anwser.checkanwser() == true) {
		  k.setWallet(ammount);
	  } else {
	      k.setWallet(-ammount);

	  } }}
 public void takeMoney(King k, King k1,int ammount) {
	 if (Game.Seat_check(int pos)== true) {
	 if (Easy_anwser.checkanwser()== false) {
		 k.setWallet(-2*ammount);
		 k1.setWallet(2* ammount);
	 } else {
	    k.setWallet(-0.75*ammount);
	    k1.setWallet(0.75*ammount);
}
 } }}





