public class Collega extends Contatto{
	
	private String qualifica;
	private long fax;
	
	public Collega(String nome, String cognome, long numeroDiTelefono, String qualifica, long fax){
		super(nome, cognome, numeroDiTelefono);
		this.qualifica=qualifica;
		this.fax=fax;
	}
	
	@Override
	public String toString(){
		return "Collega: " + super.toString() + "\nQualifica: " + getQualifica() + "\nFax: " + getQualifica() + "\n\n";
	}
	
	public String getQualifica(){
		return qualifica;
	}
	
	public long getFax(){
		return fax;
	}
}
