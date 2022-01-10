
import java.util.Scanner;	
public class Normal_answer {	
	static Scanner input = new Scanner(System.in);
	public static boolean show_answer(int i, Player []arr){
		boolean answ = false;
		if(i == 1) {
		    if (arr[i].getPos()>=0 && arr[i].getPos()<=4) {
			    System.out.println("The answers are :" + Normal.normal_a1.get(arr[i].getPos()));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct1.get(arr[i].getPos())) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        } 
		    }else if (arr[i].getPos()>=5 && arr[i].getPos()<=10) {
			    System.out.println("The answers are :" + Normal.normal_a2.get(arr[i].getPos() - 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct2.get(arr[i].getPos()- 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (arr[i].getPos()>=11 && arr[i].getPos()<=15) {
			    System.out.println("The answers are :" + Normal.normal_a3.get(arr[i].getPos() - 10));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct3.get(arr[i].getPos() - 10)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (arr[i].getPos()>=16 && arr[i].getPos()<=20){
			    System.out.println("The answers are :" + Normal.normal_a4.get(arr[i].getPos() - 15) );
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
		        if(answer == Normal.normal_correct4.get(arr[i].getPos() - 15)) {
		    	    return answ = true;
		        } else {
		    	    return answ = false;
		        }
	        }
		} if (i ==2) {
			if (arr[i].getPos()>=0 && arr[i].getPos()<=4) {
			    System.out.println("The answers are :" + Normal.normal_a1.get(arr[i].getPos() + 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct1.get(arr[i].getPos() + 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        } 
		    }else if (arr[i].getPos()>=5 && arr[i].getPos()<=10) {
			    System.out.println("The answers are :" + Normal.normal_a2.get(arr[i].getPos()));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct2.get(arr[i].getPos())) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (arr[i].getPos()>=11 && arr[i].getPos()<=15) {
			    System.out.println("The answers are :" + Normal.normal_a3.get(arr[i].getPos() - 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct3.get(arr[i].getPos() - 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (arr[i].getPos()>=16 && arr[i].getPos()<=20){
			    System.out.println("The answers are :" + Normal.normal_a4.get(arr[i].getPos() - 10 ) );
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
		        if(answer == Normal.normal_correct4.get(arr[i].getPos() - 10)) {
		    	    return answ = true;
		        } else {
		    	    return answ = false;
		        }
	        }
		}if(i == 3) {
		if (arr[i].getPos()>=0 && arr[i].getPos()<=4) {
		    System.out.println("The answers are :" + Normal.normal_a1.get(arr[i].getPos() + 10));
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
		    if(answer == Normal.normal_correct1.get(arr[i].getPos() + 10)) {
			    return answ = true;
	        } else {
	    	    return answ = false;
	        } 
	    }else if (arr[i].getPos()>=5 && arr[i].getPos()<=10) {
		    System.out.println("The answers are :" + Normal.normal_a2.get(arr[i].getPos() + 5));
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
		    if(answer == Normal.normal_correct2.get(arr[i].getPos() + 5)) {
			    return answ = true;
	        } else {
	    	    return answ = false;
	        }
	    }else if (arr[i].getPos()>=11 && arr[i].getPos()<=15) {
		    System.out.println("The answers are :" + Normal.normal_a3.get(arr[i].getPos()));
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
		    if(answer == Normal.normal_correct3.get(arr[i].getPos())) {
			    return answ = true;
	        } else {
	    	    return answ = false;
	        }
	    }else if (arr[i].getPos()>=16 && arr[i].getPos()<=20){
		    System.out.println("The answers are :" + Normal.normal_a4.get(arr[i].getPos() - 5) );
	        System.out.println("Choose your answer.");
	        String answer = input.nextLine();
	        if(answer == Normal.normal_correct4.get(arr[i].getPos() - 5)) {
	    	    return answ = true;
	        } else {
	    	    return answ = false;
	        }
        }
	    if(i==4) {
			if (arr[i].getPos()>=0 && arr[i].getPos()<=4) {
			    System.out.println("The answers are :" + Normal.normal_a1.get(arr[i].getPos() + 20));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct1.get(arr[i].getPos() + 20)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        } 
		    }else if (arr[i].getPos()>=5 && arr[i].getPos()<=10) {
			    System.out.println("The answers are :" + Normal.normal_a2.get(arr[i].getPos() + 15));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct2.get(arr[i].getPos() + 15)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (arr[i].getPos()>=11 && arr[i].getPos()<=15) {
			    System.out.println("The answers are :" + Normal.normal_a3.get(arr[i].getPos() + 5));
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
			    if(answer == Normal.normal_correct3.get(arr[i].getPos() + 5)) {
				    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }else if (arr[i].getPos()>=16 && arr[i].getPos()<=20){
			    System.out.println("The answers are :" + Normal.normal_a4.get(arr[i].getPos()) );
		        System.out.println("Choose your answer.");
		        String answer = input.nextLine();
		        if(answer == Normal.normal_correct4.get(arr[i].getPos())) {
		    	    return answ = true;
		        } else {
		    	    return answ = false;
		        }
		    }
		}
	}return answ;
  }	
}