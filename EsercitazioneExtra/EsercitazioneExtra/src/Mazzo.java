import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Mazzo{
	private List<Carta> mazzo = new ArrayList<>();
	
	public void riempi(){
		for(int i = 1; i<=4; i++){
			for(int j = 1; j<=10; j++){
				mazzo.add(new Carta(i, j));
			}
		}
	}
	
	public void stampa(){
		for(Carta c : mazzo){
			System.out.print(c.toString() + " ");
		}
	}
	
	public void shuffle(){
		Collections.shuffle(mazzo);
	}
}
