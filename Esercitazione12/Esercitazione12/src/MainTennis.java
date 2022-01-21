import java.util.Scanner;
import java.util.ArrayList;

public class MainTennis{
	public static void main(String[] args){

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci nome giocatore 1: ");
		String nome = input.next();
		System.out.print("Inserisci cognome giocatore 1: ");
		String cognome = input.next();
		System.out.print("Inserisci posizione in classifica: ");
		int posClassifica = input.nextInt();
		
		System.out.print("Inserisci nome giocatore 2: ");
		String nome2 = input.next();
		System.out.print("Inserisci cognome giocatore 2: ");
		String cognome2 = input.next();
		System.out.print("Inserisci posizione in classifica: ");
		int posClassifica2 = input.nextInt();
		Incontro incontro = new Incontro(new Giocatore(nome, cognome, posClassifica), new Giocatore(nome2, cognome2, posClassifica2));
		
		incontro.avviaSimulazione();

	}
}
