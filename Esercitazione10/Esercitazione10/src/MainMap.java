import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class MainMap{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<>();
		
		while(true){
			System.out.print("Inserisci opzione: ");
			int op = input.nextInt();
			switch(op){
				case 1:
					System.out.print("Inserisci nome: ");
					String nome = input.next();
					System.out.print("Insetisci voto: ");
					String voto = input.next();
					map.put(nome, voto);
					break;
				case 2: 
					for(String s : map.keySet()){
						System.out.println("key: "+s+"values: "+map.get(s));
					}
			}
		}
	}
}
