import java.util.ArrayList;

public class Partecipanti{
	
	private long numeroDiTelefono;
	private int numeroCantante;
	private int numeroVoti;
	
	ArrayList<Partecipanti> votiPartecipanti = new ArrayList<>();
	
	public Partecipanti(){
		this(0, 0);
	}
	
	public Partecipanti(long numeroDiTelefono, int numeroCantante){
		this.numeroDiTelefono=numeroDiTelefono;
		this.numeroCantante=numeroCantante;
	}
	
	public long getNumeroDiTelefono(){
		return numeroDiTelefono;
	}
	
	public int getNumeroCantante(){
		return numeroCantante;
	}
	
	public void inserisciVoto(Partecipanti voto){
		if(controllaVoto(voto)){
			votiPartecipanti.add(voto);
			System.out.println("Voto inserito");
		}else{
			System.out.println("Non puoi inserire più di 5");
		}
	}
	
	public int getNumeroVoti(){
		return numeroVoti;
	}
	
	public boolean controllaVoto(Partecipanti altroVoto){
		if(altroVoto.getNumeroVoti()<5) return true;
		else return false;
	}
	
	public void stampa(){
		for(Partecipanti voto : votiPartecipanti){
			System.out.println(voto.toString());
		}
	}
}
