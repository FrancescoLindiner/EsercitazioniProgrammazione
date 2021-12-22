import java.util.Scanner;

public class MainGestioneVoti{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	GestioneInput inputUtente = new GestioneInput();
	
	while(true){
		System.out.println("1)Inserisci voto\n2)Stampa voti ricevuti\n3)Stampa numeri voti di ciascun cantante");
		int opzione = input.nextInt();
		switch(opzione){
			case 1:
				Partecipanti votoUtente = inputUtente.inserisciVoto();
				votoUtente.inserisciVoto(votoUtente);
			break;
			case 2:
				Partecipanti voto = new Partecipanti();
				voto.stampa();
		}
	}
}
}
