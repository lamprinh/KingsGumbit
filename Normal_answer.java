
import java.util.Scanner;
public class Normal_answer {
	static Scanner input = new Scanner(System.in);
	public static int show_answer(Player p){
		String quest  = Normal.showQuestion(p);
	    System.out.println(quest);
		int answer = input.nextInt();
		System.out.println("Choose your answer." + answer);
		return answer;
	}
	
	public static boolean check_Answer(int[] normal_a, Player p) {
		if(show_answer(p) == normal_a[p.getPos()]) {
			return true;
		} else {
			return false;
		}
	}
}
