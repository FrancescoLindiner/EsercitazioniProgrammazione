import java.util.Scanner;
import java.util.InputMismatchException;

public class MainRubrica{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Rubrica rubrica = new Rubrica();
		int op;
		
		do{
			try{
				System.out.println("1)Inserisci un nuovo amico\n2)Inserisci un nuovo collega\n3)Visualizza contatto corrente\n4)Cancella contatto corrente\n5)Modifica contatto corrente\n6)Vai al precedente\n7)Stampa lista degli amici\n8)Stampa lista dei colleghi\n9)Stampa lista dei contatti\n10)Ricerca un numero di telefono a partire dal cognome e nome\n11)Esci");
				System.out.print("Inserisci un opzione: ");
		
				op = input.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Opzione non valida\n");
			}
			switch(op){
				case 1:
					rubrica.inserisciAmico();
					break;
				case 2:
					rubrica.inserisciCollega();
					break;
				case 3:
					rubrica.visualizzaContattoCorrente();
					break;
				case 4:
					rubrica.cancellaContattoCorrente();
					break;
				case 5:
					rubrica.modificaContattoCorrente();
					break;
				case 6:
					rubrica.vaiAlPrecedente();
					break;
				case 7:
					rubrica.stampaAmici();
					break;
				case 8: 
					rubrica.stampaColleghi();
					break;
				case 9:
					rubrica.stampaContatti();
					break;
				case 10:
					rubrica.ricerca();
					break;
				case 11:
					System.out.println("Arrivederci");
					break;
			}		
		}while(op != 11);
	}
}
