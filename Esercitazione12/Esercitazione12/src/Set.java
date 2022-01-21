import java.util.ArrayList;

public class Set{
	private ArrayList<PunteggiSet> set = new ArrayList<>();
	
	PunteggiSet punteggi = new PunteggiSet();

	public void avviaIncontro(){
		set.add(new PunteggiSet(0,0));
		int a;
		int b;
		do{
			a = (int)(Math.random()*2);
			b = (int)(Math.random()*2);
		}while(a==b);
		aggiornaPunteggi(a, b);
		while(!(calcolaVincitore())){
		do{
			a = (int)(Math.random()*2);
			b = (int)(Math.random()*2);
		}while(a==b);	
			aggiornaPunteggi(a,b);
	
		}
	}
	
	public void aggiornaPunteggi(int a, int b){
		int tmpA=0;
		int tmpB=0;
		for(PunteggiSet p : set){
			tmpA = p.getPGiocatore1();
			tmpB = p.getPGiocatore2();
		}
		set.add(new PunteggiSet(tmpA+a, tmpB+b));
	}
	
	public String stampa(){
		String s = "";
		for(PunteggiSet p : set){
			s += p.toString()+" ";
		}
		return s;
	}
	
	public boolean calcolaVincitore(){
		boolean vincitore = false;
		int tmpA=0;
		int tmpB=0;
		for(PunteggiSet p : set){
			tmpA = p.getPGiocatore1();
			tmpB = p.getPGiocatore2();
		}
		if((tmpA==6 || tmpB==6) && (tmpA==tmpB || tmpA==tmpB-1 || tmpB==tmpA-1)) return false;
		if(tmpA==tmpB || tmpA==tmpB-1 || tmpB==tmpA-1)
			vincitore = false;
		else
			vincitore = true;
		if((vincitore==true && tmpA<6) || (vincitore==true && tmpB<6))
			return false;

		return vincitore;
	}
	
	public int restituisciVincitore(){
		int tmpA=0;
		int tmpB=0;
		for(PunteggiSet p : set){
			tmpA = p.getPGiocatore1();
			tmpB = p.getPGiocatore2();
		}
		if(tmpA<tmpB) 
			return 2;
		else 
			return 1;
	}
	
	
}
