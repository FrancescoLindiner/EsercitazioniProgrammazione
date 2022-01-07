public class Contatto{
	private String nome, cognome;
	private long numeroDiTelefono;
	
	public Contatto(String nome, String cognome, long numeroDiTelefono){
		this.nome=nome;
		this.cognome=cognome;
		this.numeroDiTelefono=numeroDiTelefono;
	}
	
	public Contatto(){
		this("-", "-", -1);
	}
	
		public String getNome(){
		return nome;
	}
	
	
	public String getCognome(){
		return cognome;
	}
	
	
	public long getNumeroDiTelefono(){
		return this.numeroDiTelefono;
	}
	
	public String toString(){
		return "Nome: " + getNome() + "\nCognome: " + getCognome() +"\nNumero di Telefono: " +getNumeroDiTelefono();
	}
}
