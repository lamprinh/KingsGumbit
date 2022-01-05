
import java.util.Scanner;
public class Hard_answer {
		static Scanner input = new Scanner(System.in);
		public static boolean show_answer(int i, Player p){
			boolean answ = false;
			if( i == 1) {
			if (p.getPos()>=0 && p.getPos()<=4) {
				System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct1.get(p.getPos())) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=5 && p.getPos()<=10) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct2.get(p.getPos() - 5)) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=11 && p.getPos()<=15) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct3.get(p.getPos() - 10)) {
					return answ= true;
			    } else {
			    	return answ =false;
			    }
			}else if (p.getPos()>=16 && p.getPos()<=20){
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
			    if(answer == Hard.hard_correct4.get(p.getPos() - 15)) {
			    	return answ = true;
			    } else {
			    	return answ = false;
			    }
		    }
		}
		if( i == 2) {
			if (p.getPos()>=0 && p.getPos()<=4) {
				System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct1.get(p.getPos() + 5)) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=5 && p.getPos()<=10) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct2.get(p.getPos())) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=11 && p.getPos()<=15) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct3.get(p.getPos() - 5)) {
					return answ= true;
			    } else {
			    	return answ =false;
			    }
			}else if (p.getPos()>=16 && p.getPos()<=20){
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
			    if(answer == Hard.hard_correct4.get(p.getPos() - 10)) {
			    	return answ = true;
			    } else {
			    	return answ = false;
			    }
		    }
		}
		if( i == 3) {
			if (p.getPos()>=0 && p.getPos()<=4) {
				System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct1.get(p.getPos() + 10)) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=5 && p.getPos()<=10) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct2.get(p.getPos() + 5)) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=11 && p.getPos()<=15) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct3.get(p.getPos())) {
					return answ= true;
			    } else {
			    	return answ =false;
			    }
			}else if (p.getPos()>=16 && p.getPos()<=20){
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
			    if(answer == Hard.hard_correct4.get(p.getPos() - 5)) {
			    	return answ = true;
			    } else {
			    	return answ = false;
			    }
		    }
		}
		if( i == 4) {
			if (p.getPos()>=0 && p.getPos()<=4) {
				System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct1.get(p.getPos() + 20)) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=5 && p.getPos()<=10) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct2.get(p.getPos() + 15)) {
					return answ = true;
			    } else {
			    	return answ = false;
			    }
			}else if (p.getPos()>=11 && p.getPos()<=15) {
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
				if(answer == Hard.hard_correct3.get(p.getPos() + 5)) {
					return answ= true;
			    } else {
			    	return answ =false;
			    }
			}else if (p.getPos()>=16 && p.getPos()<=20){
			    System.out.println("Give your answer.");
			    String answer = input.nextLine();
			    if(answer == Hard.hard_correct4.get(p.getPos())) {
			    	return answ = true;
			    } else {
			    	return answ = false;
			    }
			}
		}return answ;
	}
}
