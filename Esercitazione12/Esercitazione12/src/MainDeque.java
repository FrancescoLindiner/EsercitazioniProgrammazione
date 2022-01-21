import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		
		deque.add("prova1");
		deque.add("prova2");
		deque.add("prova3");
		
		System.out.println(deque);	
	}
}
