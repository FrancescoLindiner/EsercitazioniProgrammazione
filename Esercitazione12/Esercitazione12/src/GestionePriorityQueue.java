import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public class GestionePriorityQueue{
	Scanner input = new Scanner(System.in);
	InserimentoDati dati = new InserimentoDati();
	PriorityQueue<dati> queue = new PriorityQueue<>();
	
	public void add(){
		System.out.print("Inserisci priorita': ");
		int priorita = input.nextInt();
		System.out.print("Inserisci descrizione: ");
		String descrizione = input.next();
		dati.add(priorita, descrizione);
		queue.add(priorita, descrizione);
	}
	
}
