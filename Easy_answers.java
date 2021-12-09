import java.util.Scanner;
public class Easy_answers{
 Scanner input = new Scanner(System.in);
 public static String show_answer(int pos){
String answer;
 System.out.println(Easy.Showquestion(pos));
 String answer = input.nextLine();
 System.out.println("King's answer is:"+ answer);
 return answer;
    }
public static boolean Check_Answer(){
	if(show_answer(player.getPos()).equals(easy_a[player.getPos()])){
		return true;
	} else {
		return false;
    }
  }
}
