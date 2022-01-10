
import java.util.Scanner;
public class Hard_answer {
		static Scanner input = new Scanner(System.in);
		public static String show_answer(int i, Player []arr){
			System.out.println("Player" + arr[i] + "anwser the question");
			String answer = input.nextLine();
			System.out.println("Player's" + arr[i] +"answer is:"+ answer);
			return answer;
	    }
			public static boolean Check_Answer(Player []arr, int i, String answer){
				boolean flag = false;
				int x = arr[i].getPos();
				if (i == 1) {
					if ( x <=6) {
						if (Hard.hard_correct1.get(x).equals(answer)) {
							flag = true;
							return flag;
					} else {
						return flag;
					}
				}else if (x <= 11) {
					if (Hard.hard_correct2.get(x-5).equals(answer)) {
						flag = true;
						return flag;
					}else {
						return flag;
					}
				} else if (x <=16) {
					if (Hard.hard_correct3.get(x-10).equals(answer)) {
						flag = true ;
						return flag;
					} else {
						return flag;
					}
				} else {
					if (Hard.hard_correct4.get(x-15).equals(answer)) {
						flag = true;
						return flag;
					} else {
						return flag;
					}
				}
			} else if (i == 2) {
					if ( x <=6) {
							if (Hard.hard_correct1.get(x+5).equals(answer)) {
								flag = true;
								return flag;
						} else {
							return flag;
						}
					}else if (x <= 11) {
						if (Hard.hard_correct2.get(x).equals(answer)) {
							flag = true;
							return flag;
						}else {
							return flag;
						}
					} else if (x <=16) {
						if (Hard.hard_correct3.get(x-5).equals(answer)) {
							flag = true ;
							return flag;
						} else {
							return flag;
						}
					} else {
						if (Hard.hard_correct4.get(x-10).equals(answer)) {
							flag = true;
							return flag;
						} else {
							return flag;
						}
				}
			} else if (i ==3 ) {
					if ( x <=6) {
							if (Hard.hard_correct1.get(x+10).equals(answer)) {
								flag = true;
								return flag;
						} else {
							return flag;
						}
					}else if (x <= 11) {
						if (Hard.hard_correct2.get(x+5).equals(answer)) {
							flag = true;
							return flag;
						}else {
							return flag;
						}
					} else if (x <=16) {
						if (Hard.hard_correct3.get(x).equals(answer)) {
							flag = true ;
							return flag;
						} else {
							return flag;
						}
					} else {
						if (Hard.hard_correct4.get(x-5).equals(answer)) {
							flag = true;
							return flag;
						} else {
							return flag;
						}
				}
			} else {
					if ( x <=6) {
							if (Hard.hard_correct1.get(x+15).equals(answer)) {
								flag = true;
								return flag;
						} else {
							return flag;
						}
					}else if (x <= 11) {
						if (Hard.hard_correct2.get(x+10).equals(answer)) {
							flag = true;
							return flag;
						}else {
							return flag;
						}
					} else if (x <=16) {
						if (Hard.hard_correct3.get(x+5).equals(answer)) {
							flag = true ;
							return flag;
						} else {
							return flag;
						}
					} else {
						if (Hard.hard_correct4.get(x).equals(answer)) {
							flag = true;
							return flag;
						} else {
							return flag;
						}
				}
}}}
