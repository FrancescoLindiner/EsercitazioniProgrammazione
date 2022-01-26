import java.util.Scanner;

public class MainSeggio{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Seggio seggio = new Seggio();
		
		while(true){
			int listeBianche=0;
			int schedeNulle=0;
			System.out.print("Inserisci matricola: ");
			long matricola = input.nextLong();
			System.out.print("Inserisci codice di controllo: ");
			long codiceControllo = input.nextLong();
			
			if(!(seggio.controllaDati(matricola, codiceControllo))){
				System.out.println("Dati non validi");
			}else if(seggio.controllaVotante(matricola, codiceControllo)){
				System.out.println("Hai gia' votato");
			}else if(!(seggio.controllaVotante(matricola, codiceControllo))){
				seggio.inserisciVotante(matricola, codiceControllo);
				seggio.stampaListaCandidati();
				
				System.out.print("Inserisci la tua opzione: ");
				int op = input.nextInt();
				switch(op){
					case 1:
						seggio.inserisciVoto("lista1");
						break;
					case 2:
						seggio.inserisciVoto("lista2");
						break;
					case 3:
						seggio.inserisciVoto("lista3");
						break;
					case 0:
						System.out.println("Scheda bianca");
						listeBianche++;
						break;
					default:
						schedeNulle++;
						System.out.println("Scheda nulla");
						break;
				}
			}
			if(seggio.getSizeVotanti()==seggio.getSizeStudenti())
				seggio.spoglio(listeBianche, schedeNulle);
		}
	}
}
