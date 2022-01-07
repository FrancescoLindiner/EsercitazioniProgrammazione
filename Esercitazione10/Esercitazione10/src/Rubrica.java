import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Rubrica {
	ArrayList<Contatto> rubrica = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	int contattoCorrente = 0;

	public void inserisciAmico(){

		try{
		System.out.print("Inserisci nome: ");
		String nome = input.next();
		System.out.print("Inserisci cognome: ");
		String cognome = input.next();
		System.out.print("Inserisci numero di telefono: ");
		long numeroDiTelefono = input.nextLong();
		System.out.print("Inserisci indirizzo: ");
		String indirizzo = input.next();
		
		rubrica.add(new Amico(nome, cognome, numeroDiTelefono, indirizzo));

		System.out.println("Contatto inserito!!\n\n");
		}catch(InputMismatchException e){
			System.out.println("Input errato, riprova");
		}
	}

	public void inserisciCollega() {

		try{
		System.out.print("Inserisci nome: ");
		String nome = input.next();
		System.out.print("Inserisci cognome: ");
		String cognome = input.next();
		System.out.print("Inserisci numero di telefono: ");
		long numeroDiTelefono = input.nextLong();
		System.out.print("Inserisci qualifica: ");
		String qualifica = input.next();
		System.out.print("Inserisci fax: ");
		long fax = input.nextLong();

		rubrica.add(new Collega(nome, cognome, numeroDiTelefono, qualifica, fax));

		System.out.println("\n\nContatto inserito!!\n\n");
		aumentaContattoCorrente();
		}catch(InputMismatchException e){
			System.out.println("Input errato, riprova");	
		}
	}

	public void visualizzaContattoCorrente() {
		if (rubrica.size() == 0) {
			System.out.println("\n\nRubrica vuota, inserisci un contatto");
		} else {
			Contatto p = rubrica.get(contattoCorrente());

			if (p instanceof Amico) {
				Amico a = (Amico) p;
				System.out.println(a.toString());
			} else if (p instanceof Collega) {
				Collega c = (Collega) p;
				System.out.println(c.toString());
			}
		}
	}

	public void cancellaContattoCorrente() {

		rubrica.remove(contattoCorrente());

		System.out.println("\nContatto cancellato\n\n");

		decrementaContattoCorrente();
	}

	public int contattoCorrente() {
		return contattoCorrente;
	}

	public void aumentaContattoCorrente() {
		contattoCorrente++;
	}

	public void decrementaContattoCorrente() {
		contattoCorrente--;
	}

	public void modificaContattoCorrente() {
		Contatto p = rubrica.get(contattoCorrente());

		if (p instanceof Amico) {
			Amico a = (Amico) p;
			System.out.print("Inserisci nuovo nome: ");
			String nome = input.next();
			System.out.print("Inserisci nuovo cognome: ");
			String cognome = input.next();
			System.out.print("Inserisci nuovo numero di telefono: ");
			long numeroDiTelefono = input.nextLong();
			System.out.print("Inserisci nuovo indirizzo: ");
			String indirizzo = input.next();
			Amico amico = new Amico(nome, cognome, numeroDiTelefono, indirizzo);
			rubrica.set(contattoCorrente(), amico);
		} else if (p instanceof Collega) {
			Collega c = (Collega) p;
			System.out.print("Inserisci nuovo nome: ");
			String nome = input.next();
			System.out.print("Inserisci nuovo cognome: ");
			String cognome = input.next();
			System.out.print("Inserisci nuovo numero di telefono: ");
			long numeroDiTelefono = input.nextLong();
			System.out.print("Inserisci nuova qualifica: ");
			String qualifica = input.next();
			System.out.print("Inserisci nuovo fax: ");
			long fax = input.nextLong();
			Collega collega = new Collega(nome, cognome, numeroDiTelefono, qualifica, fax);
			rubrica.set(contattoCorrente(), collega);
		}

	}

	public void vaiAlPrecedente() {
		if (contattoCorrente() == 0) {
			System.out.println("\n\nNon esiste il contatto precedente\n\n");
		} else {
			Contatto c = rubrica.get(contattoCorrente() - 1);
			if (c instanceof Amico) {
				Amico amico = (Amico) c;
				System.out.println(amico.toString());
			} else if (c instanceof Collega) {
				Collega collega = (Collega) c;
				System.out.println(collega.toString());
			}
		}
	}

	public void stampaAmici() {
		for (Contatto c : rubrica) {
			if (c instanceof Amico) {
				Amico a = (Amico) c;
				System.out.println(a.toString());
			}
		}
	}

	public void stampaColleghi() {
		for (Contatto c : rubrica) {
			if (c instanceof Collega) {
				Collega coll = (Collega) c;
				System.out.println(coll.toString());
			}
		}
	}

	public void stampaContatti() {
		if (rubrica.size() == 0) {
			System.out.println("\n\nRubrica vuota\n\n");
		}
		for (Contatto c : rubrica) {
			if (c instanceof Collega) {
				Collega coll = (Collega) c;
				System.out.println(coll.toString());
			} else if (c instanceof Amico) {
				Amico a = (Amico) c;
				System.out.println(a.toString());
			} else {
				System.out.println("\n\nNessun contatto");
			}
		}
	}

	public void ricerca() {
		System.out.print("Inserisci cognome da cercare: ");
		String cognomeDaCercare = input.next();
		System.out.print("Inserisci nome da cercare: ");
		String nomeDaCercare = input.next();

		for (Contatto c : rubrica) {
			if(c.getCognome().equals(cognomeDaCercare) && c.getNome().equals(nomeDaCercare)){
				System.out.println(c.toString());
			}
		}
	}
}
