public class Scultura extends OperaDArte{
	private String materiale;
	private int altezza;
	
	public Scultura(String titolo, String autore, String dataDiCreazione, String materiale, int altezza){
		super(titolo, autore, dataDiCreazione);
		this.materiale=materiale;
		this.altezza=altezza;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nMateriale: " + materiale + "\nAltezza: " + altezza + "\n\n";
	}
}
