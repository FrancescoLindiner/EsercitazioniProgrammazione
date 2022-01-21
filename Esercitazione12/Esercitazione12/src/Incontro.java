import java.util.ArrayList;

public class Incontro{
	private Giocatore g1, g2;
	private Set set1, set2, set3;

	
	public Incontro(Giocatore g1, Giocatore g2){
		this.g1=g1;
		this.g2=g2;
	}
	
	public void avviaSimulazione(){
		int vincitore1=0;
		int vincitore2=0;
		System.out.println(g1.toString());
		System.out.println(g2.toString());

		System.out.println("Inizia la partita!");
		set1=new Set();
		set1.avviaIncontro();
		if(set1.restituisciVincitore()==1){
			System.out.println("Simulazione set 1: " + g1.toString());
			vincitore1++;
		}else{
			System.out.println("Simulazione set 1: " + g2.toString());
			vincitore2++;
		}
		
		set2=new Set();
		set2.avviaIncontro();
		if(set2.restituisciVincitore()==1){
			System.out.println("Simulazione set 2: " + g1.toString());
			vincitore1++;
		}else{	
			System.out.println("Simulazione set 2: " + g2.toString());
			vincitore2++;
		}
		
		set3=new Set();
		set3.avviaIncontro();
	if(set3.restituisciVincitore()==1){
			System.out.println("Simulazione set 3: " + g1.toString());
			vincitore1++;
		}else{ 	
			System.out.println("Simulazione set 3: " + g2.toString());
			vincitore2++;
		}
		
		System.out.println("Set 1: " + set1.stampa());
		System.out.println("Set 2: " + set2.stampa());
		System.out.println("Set 3: " + set3.stampa());
		
		if(vincitore1>vincitore2){
			System.out.println("Ha vinto la partita " + g1.stampa());
		}else
			System.out.println("Ha vinto la partita " + g2.stampa());
		
		
	}
}
