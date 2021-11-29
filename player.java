package gumbit;

public class player {
	public int wallet;
	public int pos;
	public int round;
	public String character = null;
	
	public player() {
		wallet = 0;
		pos = 0;
		round = 1;
		character = null;
	}
	
	public int getWallet() {
		return wallet;
	}
	
	public void setWallet(int wallet) {
		this.wallet = wallet ;
	}
	
	public int getPos() {
		return pos;
	}
	
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public int getRound() {
		return round;
	}
	
	public void setRound(int round) {
		this.round = round;
	}
	
	public String getCharacter() {
		return character;
	}
	
 	public void setCharacter(String character) {
 		this.character = character;
 	}
}
