import java.util.Scanner;

public class MainPriorityQueue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		GestionePriorityQueue gestione = new GestionePriorityQueue();
		
		while(true){
			System.out.println("1)add priorita' descrizione\n2)next\n3)quit");
			System.out.print("Inserisci opzione: ");
			int op = input.nextInt();
			
			switch(op){
				case 1:
					//gestione.add();
			}
		}
		
	}
}
