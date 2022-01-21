public class Dipinto extends OperaDArte{
	private String tecnica;
	private double larghezza, altezza;
	
	public Dipinto(String titolo, String autore, String dataDiCreazione, String tecnica, double larghezza, double altezza){
		super(titolo, autore, dataDiCreazione);
		this.tecnica=tecnica;
		this.larghezza=larghezza;
		this.altezza=altezza;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nTecnica: " + tecnica + "\nLarghezza: " + larghezza + "\nAltezza: " + altezza + "\n\n";
	}
}
