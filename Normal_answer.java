
import java.util.Scanner;	
public class Normal_answer {	
	static Scanner input = new Scanner(System.in);
	public static boolean show_answer(int i, Player p){
		boolean answ = false;
		if(i == 1) {
		    if (p.getPos()>=0 && p.getPos()<=4) {
			    System.out.println("The answers are :" + Normal.normal_a1.get(p.getPos()));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct1.get(p.getPos())) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        } 
		    }else if (p.getPos()>=5 && p.getPos()<=10) {
			    System.out.println("The answers are :" + Normal.normal_a2.get(p.getPos() - 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct2.get(p.getPos()- 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (p.getPos()>=11 && p.getPos()<=15) {
			    System.out.println("The answers are :" + Normal.normal_a3.get(p.getPos() - 10));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct3.get(p.getPos() - 10)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (p.getPos()>=16 && p.getPos()<=20){
			    System.out.println("The answers are :" + Normal.normal_a4.get(p.getPos() - 15) );
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
		        if(answer == Normal.normal_correct4.get(p.getPos() - 15)) {
		    	    return answ = true;
		        } else {
		    	    return answ = false;
		        }
	        }
		} if (i ==2) {
			if (p.getPos()>=0 && p.getPos()<=4) {
			    System.out.println("The answers are :" + Normal.normal_a1.get(p.getPos() + 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct1.get(p.getPos() + 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        } 
		    }else if (p.getPos()>=5 && p.getPos()<=10) {
			    System.out.println("The answers are :" + Normal.normal_a2.get(p.getPos()));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct2.get(p.getPos())) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (p.getPos()>=11 && p.getPos()<=15) {
			    System.out.println("The answers are :" + Normal.normal_a3.get(p.getPos() - 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct3.get(p.getPos() - 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (p.getPos()>=16 && p.getPos()<=20){
			    System.out.println("The answers are :" + Normal.normal_a4.get(p.getPos() - 10 ) );
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
		        if(answer == Normal.normal_correct4.get(p.getPos() - 10)) {
		    	    return answ = true;
		        } else {
		    	    return answ = false;
		        }
	        }
		}if(i == 3) {
		if (p.getPos()>=0 && p.getPos()<=4) {
		    System.out.println("The answers are :" + Normal.normal_a1.get(p.getPos() + 10));
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
		    if(answer == Normal.normal_correct1.get(p.getPos() + 10)) {
			    return answ = true;
	        } else {
	    	    return answ = false;
	        } 
	    }else if (p.getPos()>=5 && p.getPos()<=10) {
		    System.out.println("The answers are :" + Normal.normal_a2.get(p.getPos() + 5));
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
		    if(answer == Normal.normal_correct2.get(p.getPos() + 5)) {
			    return answ = true;
	        } else {
	    	    return answ = false;
	        }
	    }else if (p.getPos()>=11 && p.getPos()<=15) {
		    System.out.println("The answers are :" + Normal.normal_a3.get(p.getPos()));
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
		    if(answer == Normal.normal_correct3.get(p.getPos())) {
			    return answ = true;
	        } else {
	    	    return answ = false;
	        }
	    }else if (p.getPos()>=16 && p.getPos()<=20){
		    System.out.println("The answers are :" + Normal.normal_a4.get(p.getPos() - 5) );
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
	        if(answer == Normal.normal_correct4.get(p.getPos() - 5)) {
	    	    return answ = true;
	        } else {
	    	    return answ = false;
	        }
        }
	    if(i==4) {
			if (p.getPos()>=0 && p.getPos()<=4) {
			    System.out.println("The answers are :" + Normal.normal_a1.get(p.getPos() + 20));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct1.get(p.getPos() + 20)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        } 
		    }else if (p.getPos()>=5 && p.getPos()<=10) {
			    System.out.println("The answers are :" + Normal.normal_a2.get(p.getPos() + 15));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct2.get(p.getPos() + 15)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (p.getPos()>=11 && p.getPos()<=15) {
			    System.out.println("The answers are :" + Normal.normal_a3.get(p.getPos() + 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct3.get(p.getPos() + 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (p.getPos()>=16 && p.getPos()<=20){
			    System.out.println("The answers are :" + Normal.normal_a4.get(p.getPos()) );
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
		        if(answer == Normal.normal_correct4.get(p.getPos())) {
		    	    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }
		}
	}return answ;
  }	
}