import java.util.Scanner;

public class MainListaCircolare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ListaCircolare<String> lista = new ListaCircolare<>();
		
		while(true){
			System.out.println("1)Aggiungi elemento\n2)Cancella elemento\n3)Vai avanti\n4)Vai indietro\n5)Stampa\n6)Elemento corrente");
			
			System.out.print("Inserisci opzione: ");
			int op = input.nextInt();
			
			switch(op){
				case 1:
					System.out.print("Inserisci ");
					String s = input.next();
					lista.aggiungi(s);
					break;
				case 2:
					lista.rimuovi();
					break;
				case 3:
					lista.vaiAvanti();
					break;
				case 4:
					lista.vaiIndietro();
					break;
				case 5:
					lista.stampa();
					break;
				case 6:
					lista.stampaElementoCorrente();
					break;
			}
		}
		
		
	}
}
