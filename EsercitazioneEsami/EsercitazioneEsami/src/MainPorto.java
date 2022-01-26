import java.util.Scanner;

public class MainPorto{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Porto porto = new Porto();
		
		while(true){
			System.out.println("1)Inserisci nave\n2)Elimina nave\n3)Fai avanzare le navi\n4)Stampa porto");
			int op = input.nextInt();
			switch(op){
				case 1:
					System.out.print("Inserisci codice univoco: ");
					String codice = input.next();
					System.out.print("Inserisci x: ");
					double x = input.nextDouble();
					System.out.print("Inserisci y: ");
					double y = input.nextDouble();
					System.out.print("Inserisci velocita': ");
					double velocita = input.nextDouble();
					System.out.print("Inserisci direzione: ");
					int direzione = input.nextInt();
					System.out.print("Inserisci lunghezza: ");
					double lunghezza = input.nextDouble();
					System.out.print("Inserisci larghezza: ");
					double larghezza = input.nextDouble();
					System.out.print("Inserisci numero di passeggeri: ");
					int num_pass = input.nextInt();
					porto.inserisciNave(new Nave(codice, x, y, velocita, direzione, lunghezza, larghezza, num_pass));
					System.out.println("\nNave inserita");
					break;
				case 2:
					System.out.print("Inserisci codice univoco: ");
					String c = input.next();
					porto.eliminaNave(c);
					break;
				case 3:
					porto.faiAvanzareLeNavi();
				case 4:
					porto.stampa();
			}
		}
	}
}
