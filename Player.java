package paketolamp;

public class Player {
	public int wallet;
	public int pos;
	public int round;
	public String character = null;

	public Player() {
		wallet = 0;
		pos = 0;
		round = 1;
		character = null;
	}

	public int getWallet() {
		return wallet; // methodos get gia emfanish xrimatwn pou exei sti diathesei tou o paiktis
	} // methodos set gia tropopoihsh xrimatwn paikti

	public void setWallet(int wallet) {
		this.wallet += wallet;
	}

	public int getPos() {
		return pos;
	} // methodos get gia emfanisi thesis paikti

	public void setPos(int pos) { // methoodos set gia tropopoihsh thesis paikti
		this.pos += pos;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) { // methodos get gia emfanisi girou paikti
		this.round = round; // methoodos set gia tropopoihsh girou paikti
	}

	public String getCharacter() { // methoodos set gia tropopoihsh xaraktira paikti
		return character; // methoodos set gia tropopoihsh xaraktira paikti
	}

	public void setCharacter(String character) {
		this.character = character;
	}

}
