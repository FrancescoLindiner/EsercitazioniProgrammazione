import java.util.ArrayList;

public class Porto{
	private ArrayList<Nave> porto = new ArrayList<>();
	
	public void inserisciNave(Nave n){
		porto.add(n);
	}
	
	public void eliminaNave(String codiceUnivoco){
		for(Nave nave : porto){
			if(codiceUnivoco.equals(nave.getCodiceUnivoco())){
				porto.remove(nave);
				break;
			}
		}
	}
	
	public void faiAvanzareLeNavi(){
		for(Nave n : porto){
			n.avanza();
		}
		for(int i = 0; i<porto.size()-1; i++){
			for(int j = 1; i<porto.size()-1; j++){
				if(verificaCollisioni(porto.get(i), porto.get(j)))
					System.out.println("Possibilità di collisione tra la nave " + porto.get(i) + "e la nave " + porto.get(j));
			}
		}
	}
	
	public boolean verificaCollisioni(Nave n1, Nave n2){
		double dx = n2.getX()-n1.getX();
		double dy = n2.getY()-n1.getY();
		double distanza = Math.sqrt(dx*dx+dy*dy);
		if(distanza<50)
			return true;
		return false;
	}
	
	public void stampa(){
		for(Nave n : porto){
			System.out.println(n.toString());
		}
	}
}
