public class Studente{
	private long matricola, codiceControllo;
	private String nome, cognome;
	
	public Studente(String nome, String cognome, long matricola, long codiceControllo){
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
		this.codiceControllo=codiceControllo;
	}
	
	public long getMatricola(){
		return matricola;
	}
	
	public long getCodiceControllo(){
		return codiceControllo;
	}
	
	@Override
	public String toString(){
		return "\nNome:" + nome + "\nCognome: " + cognome + "\nMatricola: " + matricola + "\nCodice di controllo: " + codiceControllo + "\n\n";
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
}
