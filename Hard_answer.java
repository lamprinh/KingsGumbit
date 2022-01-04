
import java.util.Scanner;
public class Hard_answer {
		static Scanner input = new Scanner(System.in);
		public static boolean show_answer(){
			boolean answ = false;
			int pos = Game.roll_2(Game.move(Game.roll_1()));
			if (pos>=0 && pos<=4) {
				System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct1.get(pos)) {
					return true;
			    } else {
			    	return false;
			    }
			}else if (pos>=5 && pos<=10) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct2.get(pos)) {
					return true;
			    } else {
			    	return false;
			    }
			}else if (pos>=11 && pos<=15) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct3.get(pos)) {
					return true;
			    } else {
			    	return false;
			    }
			}else if (pos>=16 && pos<=20){
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
			    if(answer == Hard.hard_correct4.get(pos)) {
			    	return true;
			    } else {
			    	return false;
			    }
		    }
			return answ;
		}
}
