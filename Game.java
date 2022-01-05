import java.util.Scanner;
import java.util.Random;
public class Game {
	Scanner input = new Scanner(System.in);
	List<String>Menu_cards= new ArrayList<String>();
	list.add("Πάρε χ ποσό από τους υπόλοιπους παίκτες");
	list.add("Μετακινήσου 3 θέσεις πίσω");
	list.add("Πήγαινε στην χ περιοχή αν ανήκει σε κάποιον πλήρωσε το διπλάσιο απο το καθορισμένο πόσο. Σε περίπτωση που περάσεις από την αφετηρία δεν παίρνεις χρήματα.");
	list.add("Αυξήθηκαν οι αξίες των περιοχών που κατέχεις πάρε χ ποσό.");
	list.add("Αν ο επόμενος παίκτης κατέχει περισσότερες περιοχές του οφείλεις χ ποσό, διαφορετικά σου οφείλει χ ποσό.");
	list.add("Δώσε χ ποσό στους υπόλοιπους παίκτες.");
	list.add("Κινήσου 2 θέσεις μπροστά και ξανά παίξε.");
	list.add("Αν το επίπεδο δυσκολίας είναι εύκολο την επόμενη φορά που θα περάσεις απο την αφετηρία πάρε το μισό χρηματικό ποσό.");
	list.add("Αν το επίπεδο δυσκολίας είναι μέτριο την επόμενη φορά που θα περάσεις από την αφετηρία δίνεις το μισό χρηματικό ποσό στον επόμενο παίκτη.");
	list.add("Αν το επίπεδο δυσκολίας είναι δύσκολο διάλεξε έναν από τους υπόλοιπους παίκτες ώστε να μη λάβει λεφτά από την αφετηρία.");
	list.add("Δικαιούσαι να αγοράσεις μια μη κατεχόμενη περιοχή χωρίς να απαντήσεις σε κάποια ερώτηση.");
	list.add("Αν κατέχεις πάνω απο χ περιοχές, παίρνεις χ ποσό διαφορετικά δίνεις χ ποσό στους υπόλοιπους παίκτες.");
	list.add("Την επόμενη φορά που θα περάσεις από κατέχομενη περιοχή δικαιούσαι να μην πληρώσεις το χρηματικό ποσο.");

	int players;
	Random dicenumber=new Random();
	public Game(int players) {
		this.players=players;
	}

	public boolean buy() {
		System.out.println("Would you like to buy this Area?(Yes/No)");
		String answer = input.nextLine();
		if (answer=="YES") {
			return true; }
		else {
			return false; }
		}
			public int roll_1() {
		 int dice;
		 dice = 1 +dicenumber.nextInt(6);
		 return dice;
		}
		public String roll_easy(int i) {
			if (i=1) {
				if (Player.getPos()>0 && and Player.getPos()<=5) {
					return Easy.easy_q1[Player.getPos];
			} else if (PlayPlayer.getPos()<=10) {
			        return Easy.easy_q2[Player.getPos()-5];
		   } else if (Player.getPos()<=15) {
			       return Easy.easy_q3[Player.getPos()-10];
	   } else
			return Easy.easy_q4[Player.getPos()-15];
   }} else if (i=2) {
	   			if (Player.getPos()>0 && and Player.getPos()<=5) {
	   					return Easy.easy_q1[Player.getPos()+5];
	   			} else if (PlayPlayer.getPos()<=10) {
	   			        return Easy.easy_q2[Player.getPos()];
	   		   } else if (Player.getPos()<=15) {
	   			       return Easy.easy_q3[Player.getPos()-5];
	   	   } else
			return Easy.easy_q4[Player.getPos()-10];
		}} else if (i=3) {
						if (Player.getPos()>0 && and Player.getPos()<=5) {
								return Easy.easy_q1[Player.getPos()+10];
						} else if (PlayPlayer.getPos()<=10) {
						        return Easy.easy_q2[Player.getPos()+5];
					   } else if (Player.getPos()<=15) {
						       return Easy.easy_q3[Player.getPos()];
				   } else
			return Easy.easy_q4[Player.getPos()-5];
		}} else if (i=4) {
			if (Player.getPos()>0 && and Player.getPos()<=5) {
					return Easy.easy_q1[Player.getPos()+15];
			} else if (PlayPlayer.getPos()<=10) {
			        return Easy.easy_q2[Player.getPos()+10];
		   } else if (Player.getPos()<=15) {
			       return Easy.easy_q3[Player.getPos()+5];
	   } else
			return Easy.easy_q4[Player.getPos()];
		}}}

   public String roll_normal(int i) {
	   if (i=1) {
		   	if (Player.getPos()>0 && and Player.getPos()<=5) {
		   					return Normal.normal_q1[Player.getPos()];
		   			} else if (Player.getPos()<=10) {
		   			        return Normal.normal_q2[Player.getPos()-5];
		   		   } else if (Player.getPos()<=15) {
		   			       return Normal.normal_q3[Player.getPos()-10];
		   	   } else {
			return Normal.normal_q4[Player.getPos()-15];
}} else if (i=2) {
	if (Player.getPos()>0 && and Player.getPos()<=5) {
			   					return Normal.normal_q1[Player.getPos()+5];
			   			} else if (Player.getPos()<=10) {
			   			        return Normal.normal_q2[Player.getPos()];
			   		   } else if (Player.getPos()<=15) {
			   			       return Normal.normal_q3[Player.getPos()-5];
			   	   } else {
			return Normal.normal_q4[Player.getPos()-10];
		} } else if (i=3) {
				if (Player.getPos()>0 && and Player.getPos()<=5) {
						   					return Normal.normal_q1[Player.getPos()+10];
						   			} else if (Player.getPos()<=10) {
						   			        return Normal.normal_q2[Player.getPos()+5];
						   		   } else if (Player.getPos()<=15) {
						   			       return Normal.normal_q3[Player.getPos()];
						   	   } else {
			return Normal.normal_q4[Player.getPos()-5];
		}} else if (i=4) {
				if (Player.getPos()>0 && and Player.getPos()<=5) {
						   					return Normal.normal_q1[Player.getPos()+15];
						   			} else if (Player.getPos()<=10) {
						   			        return Normal.normal_q2[Player.getPos()+10];
						   		   } else if (Player.getPos()<=15) {
						   			       return Normal.normal_q3[Player.getPos()+5];
						   	   } else {
			return Normal.normal_q4[Player.getPos()];
		}}}


   public String roll_hard(int i) {
	   if (i=1) {
		   	if (Player.getPos()>0 && and Player.getPos()<=5) {
		   					return Hard.hard_q1[Player.getPos];
		   			} else if (Player.getPos()<=10) {
		   			        return Hard.hard_q2[Player.getPos()-5];
		   		   } else if (Player.getPos()<=15) {
		   			       return Hard.hard_q3[Player.getPos()-10];
		   	   } else
			return Hard.hard_q4[Player.getPos()-15];
		}
	} else if (i=2) {
		if (Player.getPos()>0 && and Player.getPos()<=5) {
				   					return Hard.hard_q1[Player.getPos()+5];
				   			} else if (Player.getPos()<=10) {
				   			        return Hard.hard_q2[Player.getPos()];
				   		   } else if (Player.getPos()<=15) {
				   			       return Hard.hard_q3[Player.getPos()-5];
				   	   } else
			return Hard.hard_q4[Player.getPos()-10];
		} } else if (i=3) {
			if (Player.getPos()>0 && and Player.getPos()<=5) {
					   					return Hard.hard_q1[Player.getPos()+10];
					   			} else if (Player.getPos()<=10) {
					   			        return Hard.hard_q2[Player.getPos()+5];
					   		   } else if (Player.getPos()<=15) {
					   			       return Hard.hard_q3[Player.getPos()];
					   	   } else
			return Hard.hard_q4[Player.getPos()-5];
		}} else if (i=4) {
			if (Player.getPos()>0 && and Player.getPos()<=5) {
					   					return Hard.hard_q1[Player.getPos()+15];
					   			} else if (Player.getPos()<=10) {
					   			        return Hard.hard_q2[Player.getPos()+10];
					   		   } else if (Player.getPos()<=15) {
					   			       return Hard.hard_q3[Player.getPos()+5];
					   	   } else
			return Hard.hard_q4[Player.getPos()];
		}} }

		public int roll_3() {
		 int dice;
		 dice = 1 +dicenumber.nextInt(13);
		 return dice;
}
	public int move(int pos) {
	  pos = pos + roll_1();
	  return pos;

	  }
	  public String levelfinder() {
		  String level;
		  if (player.setround=1) {
		  level = easy;
	  } else if (Player.setround=2) {
		  level = normal;
	  } else {
		  level = hard;
	  }
	  return level ;
  }
}








