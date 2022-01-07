public class Amico extends Contatto{
	
	private String indirizzo;
	
	public Amico(String nome, String cognome, long numeroDiTelefono, String indirizzo){
		super(nome, cognome, numeroDiTelefono);
		this.indirizzo=indirizzo;
	}
	
	public Amico(){
		this("-", "-", -1, "-");
	}
	
	@Override
	public String toString(){
		return "Amico: \n" + super.toString() +"\nIndirizzo: "+getIndirizzo()+"\n\n";
	}
	
	public String getIndirizzo(){
		return this.indirizzo;
	}
	
}
