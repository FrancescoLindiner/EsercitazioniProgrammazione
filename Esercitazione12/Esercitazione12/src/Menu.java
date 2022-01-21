import java.util.Scanner;

public class Menu{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		GestioneInput gestioneInput = new GestioneInput();
		
		while(true){
			System.out.println("1)Inserisci scultura\n2)Inserisci dipinto\n3)Stampa i dettagli di tutti gli oggetti\n4)Elimina un elemento in base al titolo\n5)Stampa i dettagli di un'opera attraverso il titolo");
			System.out.print("Inserisci opzione: ");
			int op = input.nextInt();
			switch(op){
				case 1:
					gestioneInput.inserisciScultura();
					System.out.println("Scultura inserita");
					break;
				case 2:
					gestioneInput.inserisciDipinto();
					System.out.println("Dipinto inserito");
					break;
				case 3:
					gestioneInput.stampaDettagli();
					break;
				case 4:
					gestioneInput.eliminaPerTitolo();
					break;
				case 5:
					gestioneInput.stampaPerTitolo();
				}
		}
	}
}
