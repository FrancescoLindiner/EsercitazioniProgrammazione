public class Carta{
	private int seme;
	private int valore; 
	
	public void puntiBriscola(){
		
	}
	
	public Carta(int seme, int valore){
		this.seme=seme;
		this.valore=valore;
	}
	
	@Override
	public String toString(){
		return "Seme: " + getSeme() + "\nValore: " + valore; 	
	}
	
	public String getSeme(){
		if(seme==1) return "Oro";
		else if(seme==2) return "Spade";
		else if(seme==3) return "Bastoni";
		else return "Coppe";
	
	}
	
}
