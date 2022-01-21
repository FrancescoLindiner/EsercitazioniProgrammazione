import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Deque<String> deque = new LinkedList<>();
		String s;
		do{
			System.out.print("Inserisci parola: ");
			s = input.next();
			deque.add(s);
		}while(!(check(s)));
	}
	
	public static boolean check(String input){
		Pattern pattern = Pattern.compile(".$");
		Matcher matcher = pattern.matcher(input);
  		if (matcher.matches()) 
    		return true;
  		else
   			return false;
	}
}
