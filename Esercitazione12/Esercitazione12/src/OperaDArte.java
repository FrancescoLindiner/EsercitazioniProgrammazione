public class OperaDArte{
	private String titolo, autore, dataDiCreazione;
	
	public OperaDArte(String titolo, String autore, String dataDiCreazione){
		this.titolo=titolo;
		this.autore=autore;
		this.dataDiCreazione=dataDiCreazione;
	}
	
	@Override
	public String toString(){
		return "\n\nTitolo: " + titolo + "\nAutore: " + autore + "\nData di creazione: " + dataDiCreazione;
	}
	
	public String getTitolo(){
		return titolo;
	}
}
