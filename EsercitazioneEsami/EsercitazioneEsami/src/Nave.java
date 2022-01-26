
public class Nave{
	private String codiceUnivoco;
	private double x, y;
	private double velocita;
	private int direzione;
	private double lunghezza, larghezza;
	private int num_passeggeri;
	
	public Nave(String codiceUnivoco, double x, double y, double velocita, int direzione, double lunghezza, double larghezza, int num_passeggeri){
		this.codiceUnivoco=codiceUnivoco;
		this.x=x;
		this.y=y;
		this.velocita=velocita;
		setDirezione(direzione);
		this.lunghezza=lunghezza;
		this.larghezza=larghezza;
		this.num_passeggeri=num_passeggeri;
	}
	
	public void setDirezione(int direzione){
		if(direzione>=0 && direzione<360)
			this.direzione=direzione;
		else 
			this.direzione=-1;
	}
	
	public void avanza(){
		this.x+=velocita*Math.cos((direzione*Math.PI)/180);
		this.y+=velocita*Math.sin((direzione*Math.PI)/180);
	}
	
	public double getX(){
		return x;
	}
	
	public String getCodiceUnivoco(){
		return codiceUnivoco;
	}
	
	public double getY(){
		return y;
	}
	
	@Override
	public String toString(){
		return "Codice: " + codiceUnivoco + "\nCoordinate: " + x + " " + y + "\nVelocita': " + velocita + "\nDirezione: " + direzione + "\nLunghezza e larghezza: " + lunghezza + " " + larghezza + "\nNumero passeggeri: " + num_passeggeri;  
	}
}
