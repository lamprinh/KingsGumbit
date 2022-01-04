
import java.util.Scanner;	
public class Normal_answer {	
	static Scanner input = new Scanner(System.in);
	public static boolean show_answer(){
		boolean answ = false;
		int pos = Game.roll_2(Game.move(Game.roll_1()));
		if (pos>=0 && pos<=4) {
			System.out.println("The answers are :" + Normal.normal_a1.get(pos) );
		    System.out.println("Choose your answer.");
		    String answer = input.nextLine();
			if(answer == Normal.normal_correct1.get(pos)) {
				return true;
		    } else {
		    	return false;
		    }
		}else if (pos>=5 && pos<=10) {
			System.out.println("The answers are :" + Normal.normal_a2.get(pos));
		    System.out.println("Choose your answer.");
		    String answer = input.nextLine();
			if(answer == Normal.normal_correct2.get(pos)) {
				return true;
		    } else {
		    	return false;
		    }
		}else if (pos>=11 && pos<=15) {
			System.out.println("The answers are :" + Normal.normal_a3.get(pos) );
		    System.out.println("Choose your answer.");
		    String answer = input.nextLine();
			if(answer == Normal.normal_correct3.get(pos)) {
				return true;
		    } else {
		    	return false;
		    }
		}else if (pos>=16 && pos<=20){
			System.out.println("The answers are :" + Normal.normal_a4.get(pos) );
		    System.out.println("Choose your answer.");
		    String answer = input.nextLine();
		    if(answer == Normal.normal_correct4.get(pos)) {
		    	return true;
		    } else {
		    	return false;
		    }
	    }
		return answ;
	}
}
