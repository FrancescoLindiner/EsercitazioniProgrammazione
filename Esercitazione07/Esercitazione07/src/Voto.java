import java.util.ArrayList;

public class Voto{
	
	private static final int NUMERO_PARTECIPANTI = 15;
	private static final int NUMERO_MAX_VOTI = 5;
	private long numeroDiTelefono;
	private int numeroCantante;
	private int numeroVoti;
	
	ArrayList<Voto> voti = new ArrayList<>();
	
	public Voto(){
		this(0, 0);
	}
	
	public Voto(long numeroDiTelefono, int numeroCantante){
		this.numeroDiTelefono=numeroDiTelefono;
		this.numeroCantante=numeroCantante;
	}
	
	public long getNumeroDiTelefono(){
		return numeroDiTelefono;
	}
	
	public int getNumeroCantante(){
		return numeroCantante;
	}
	
	public void inserisciVoto(Voto voto){
		if(controllaVoto(voto)){
			voti.add(voto);
			System.out.println("Voto inserito");
		}else{
			System.out.println("Non puoi inserire più di 5");
		}
	}
	
	public int getNumeroVoti(){
		return numeroVoti;
	}
	
	public boolean controllaVoto(Voto altroVoto){
		if(altroVoto.getNumeroVoti()<5) return true;
		else return false;
	}
	
	public void stampa(){
		for(Voto voto : voti){
			System.out.println(voto.toString());
		}
	}
}
