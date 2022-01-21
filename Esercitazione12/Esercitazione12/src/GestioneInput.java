import java.util.Scanner;
import java.util.ArrayList;

public class GestioneInput{
	Scanner input = new Scanner(System.in);
	private ArrayList<OperaDArte> listaOpere = new ArrayList<>();
	
	public void inserisciScultura(){
		System.out.println("Inserisci titolo: ");
		String titolo = input.next();
		System.out.println("Inserisci autore: ");
		String autore = input.next();
		System.out.println("Inserisci data di creazione: ");
		String dataDiCreazione = input.next();
		System.out.println("Inserisci materiale: ");
		String materiale = input.next();
		System.out.println("Inserisci altezza: ");
		int altezza = input.nextInt();
		
		Scultura scultura = new Scultura(titolo, autore, dataDiCreazione, materiale, altezza);
		listaOpere.add(scultura);
	}
	
	public void inserisciDipinto(){
		System.out.println("Inserisci titolo: ");
		String titolo = input.next();
		System.out.println("Inserisci autore: ");
		String autore = input.next();
		System.out.println("Inserisci data di creazione: ");
		String dataDiCreazione = input.next();
		System.out.println("Inserisci tecnica: ");
		String tecnica = input.next();
		System.out.println("Inserisci larghezza: ");
		double larghezza = input.nextDouble();
		System.out.println("Inserisci altezza: ");
		double altezza = input.nextDouble();
		
		Dipinto dipinto = new Dipinto(titolo, autore, dataDiCreazione, tecnica, larghezza, altezza);
		listaOpere.add(dipinto);
	}
	
	public void stampaDettagli(){
		if(listaOpere.size()==0)
			System.out.println("Lista vuota\n\n");
		for(OperaDArte o : listaOpere){
			System.out.println(o.toString());
		}
	}
	
	public void eliminaPerTitolo(){
		System.out.print("Inserisci titolo: ");
		String titolo = input.next();
		for(OperaDArte o : listaOpere){
			if(titolo.equals(o.getTitolo())){
				listaOpere.remove(o);
				System.out.println("Opera rimossa\n\n");
				break;
			}
		}
	}
	
	public void stampaPerTitolo(){
		System.out.print("Inserisci titolo: ");
		String titolo = input.next();
		for(OperaDArte o : listaOpere){
			if(titolo.equals(o.getTitolo())){
				System.out.println(o.toString());
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
