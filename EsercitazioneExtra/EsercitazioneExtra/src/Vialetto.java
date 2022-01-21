import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Vialetto{
	private LinkedList<String> v = new LinkedList<>();
	private LinkedList<String> strada = new LinkedList<>();
	
	public void inserisciAutoVialetto(String auto){
		v.add(auto);
	}
	
	public void inserisciAutoStrada(String auto){
		strada.add(auto);
	}
	
	public void spostaAuto(String auto){
		
		int indice = indice(auto);

		if(indice==v.size()-1){
			v.removeLast();
		}else{
			while(!(v.getLast().equals(auto))){
				String s = v.removeLast();
				strada.add(s);
			}
			/*while(v.size()>0){
				String s = v.removeLast();
				strada.add(s);
				indice++;
			}*/
			System.out.println();
			v.remove(auto);
			while(strada.size()>0){
				String s1 = strada.removeLast();
				v.add(s1);
				indice++;
			}
		}
	}
	
	public int indice(String auto){
		int i = 0;
		for(String s : v){
			if(auto.equals(s)){
				return i;
			}
			else
				i++;
		}
		return i;
	}
	public void stampa(){
		System.out.print("Vialetto: ");
		for(String s : v){
			System.out.print(s + " ");	
		}
		System.out.print("\nStrada: ");

		for(String s : strada){
			System.out.print(s + " ");	
		}
	}
}
