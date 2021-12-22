import java.util.Scanner;


public class GestioneInput {
	Scanner input = new Scanner(System.in);
	Partecipanti voto = new Partecipanti();
	
	public Partecipanti inserisciVoto(){
		System.out.print("Inserisci il numero di telefono: ");
		long numeroDiTelefono = input.nextLong();
		System.out.print("Inserisci il numero del cantante: ");
		int numeroCantante = input.nextInt();
		return new Partecipanti(numeroDiTelefono, numeroCantante);
	}
	
	
}
