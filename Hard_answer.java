
import java.util.Scanner;
public class Hard_answer {
		static Scanner input = new Scanner(System.in);
		public static String show_answer(Player p){
		    String quest  = Normal.showQuestion(p);
		    System.out.println(quest);
			String answer = input.nextLine();
			System.out.println("Give your answer." + answer);
			return answer;
		}
		
		public static boolean check_Answer(String[] hard_a, Player p) {
			if(show_answer(p) == hard_a[p.getPos()]){
				return true;
			} else {
				return false;
			}
		}
}
