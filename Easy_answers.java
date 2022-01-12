import java.util.Scanner;
public class Easy_answers{
 Scanner input = new Scanner(System.in);
 public static String show_answer(Player []arr1, int i){
String answer;
System.out.println("Player" +arr1[i] "anwser the question");
 String answer = input.nextLine();
 System.out.println("Player's" + arr1[i] "answer is:"+ answer);
 return answer;
    }
public static boolean Check_Answer(Player []arr1, int i, String answer){
	flag = false;
	int arr1[i].getPos() = x;
	if (i=1) {
		if ( x <=6) {
			if (Easy_correct1.get[x].equals(answer) {
				flag = true;
				return flag;
		} else {
			return flag;
		}
	}else if (x <= 11) {
		if (Easy_correct2.get[x-5].equals(answer) {
			flag = true;
			return flag;
		}else {
			return flag;
		}
	} else if (x <=16) {
		if (Easy_correct3.get[x-10].equals(answer) {
			flag = true ;
			return flag;
		} else {
			return flag;
		}
	} else {
		if (Easy_correct4.get[x-15].equals(answer) {
			flag = true;
			return flag;
		} else {
			return flag;
		}
	}
} else if (i=2) {
		if ( x <=6) {
				if (Easy_correct1.get[x+5].equals(answer) {
					flag = true;
					return flag;
			} else {
				return flag;
			}
		}else if (x <= 11) {
			if (Easy_correct2.get[x].equals(answer) {
				flag = true;
				return flag;
			}else {
				return flag;
			}
		} else if (x <=16) {
			if (Easy_correct3.get[x-5].equals(answer) {
				flag = true ;
				return flag;
			} else {
				return flag;
			}
		} else {
			if (Easy_correct4.get[x-10].equals(answer) {
				flag = true;
				return flag;
			} else {
				return flag;
			}
	}
} else if (i=3) {
		if ( x <=6) {
				if (Easy_correct1.get[x+10].equals(answer) {
					flag = true;
					return flag;
			} else {
				return flag;
			}
		}else if (x <= 11) {
			if (Easy_correct2.get[x+5].equals(answer) {
				flag = true;
				return flag;
			}else {
				return flag;
			}
		} else if (x <=16) {
			if (Easy_correct3.get[x].equals(answer) {
				flag = true ;
				return flag;
			} else {
				return flag;
			}
		} else {
			if (Easy_correct4.get[x-5].equals(answer) {
				flag = true;
				return flag;
			} else {
				return flag;
			}
	}
} else {
		if ( x <=6) {
				if (Easy_correct1.get[x+15].equals(answer) {
					flag = true;
					return flag;
			} else {
				return flag;
			}
		}else if (x <= 11) {
			if (Easy_correct2.get[x+10].equals(answer) {
				flag = true;
				return flag;
			}else {
				return flag;
			}
		} else if (x <=16) {
			if (Easy_correct3.get[x+5].equals(answer) {
				flag = true ;
				return flag;
			} else {
				return flag;
			}
		} else {
			if (Easy_correct4.get[x].equals(answer) {
				flag = true;
				return flag;
			} else {
				return flag;
			}
	}
