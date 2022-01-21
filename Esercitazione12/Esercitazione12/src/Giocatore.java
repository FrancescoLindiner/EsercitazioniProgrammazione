
public class Giocatore{
	private int posClassifica;
	private String nome, cognome;
	
	public Giocatore(String nome, String cognome, int posClassifica){
		this.nome=nome;
		this.cognome=cognome;
		this.posClassifica=posClassifica;
	}
	
	@Override
	public String toString(){
		return nome + " " + cognome + " " + posClassifica;
	}
	
	public int getPosClassifica(){
		return posClassifica;
	}
	
	public void setPosClassifica(int posClassifica){
		this.posClassifica=posClassifica;
	}
	
	public String stampa(){
		return nome + " " + cognome;
	}
}
