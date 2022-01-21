import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MainVialetto{
	public static void main(String[] args){
		Vialetto vialetto = new Vialetto();
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("\n1)Inserisci macchina nel vialetto\n2)Rimuovi macchina\n)Stampa");
			int op = input.nextInt();
			switch (op) {
				case 1:
					System.out.println("Inserisci macchina: ");
					String auto = input.next();
					vialetto.inserisciAutoVialetto(auto);
					System.out.println("Macchina inserita");
					break;
				case 2:
					System.out.println("Inserisci macchina da rimuovere: ");
					String a = input.next();
					vialetto.spostaAuto(a);
					System.out.println("Macchina rimossa");
					break;
				case 3:
					vialetto.stampa();
					break;
				default:
					break;
			}
		}
	}
}
