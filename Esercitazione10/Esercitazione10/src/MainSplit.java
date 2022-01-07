import java.util.Map;
import java.util.HashMap;

public class MainSplit{
	public static void main(String[] args){
		String text = "Scrivete un programma che, utilizzando il 			metodo split su una stringa contenente il testo di questo esercizio, determina il numero totale di parole presenti nel testo e la parola che compare con maggiore	frequenza. Potreste anche pensare di utilizzare una Map<String, Integer> per memorizzare la frequenza di ciascuna parola utilizzando la parola stessa come chiave.";
		
		Map<String, Integer> map = new HashMap<>();
		String[] string = text.split(" ");
		for(String s : string){
			if(map.get(s) != null){
				map.put(s, map.get(s)+1);
			}else{
				map.put(s, 1);
			}
		}
		
		System.out.println(map);
	}
}
