
public class PunteggiSet{
	private int pGiocatore1;
	private int pGiocatore2;
	
	public PunteggiSet(){
		;
	}
	
	public PunteggiSet(int p1, int p2){
		this.pGiocatore1=p1;
		this.pGiocatore2=p2;	
	}
	
	public PunteggiSet resituisciUnNumero(){
		int p1 = (int)(Math.random()*2);
		int p2 = (int)(Math.random()*2);
		return new PunteggiSet(p1, p2);
	}
	
	@Override
	public String toString(){
		return pGiocatore1 + "-" + pGiocatore2;
	}
	
	public int getPGiocatore1(){
		return pGiocatore1;
	}
	
	public int getPGiocatore2(){
		return pGiocatore2;
	}
}
