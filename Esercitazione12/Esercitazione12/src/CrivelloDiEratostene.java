import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class CrivelloDiEratostene{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Set<Integer> insieme = new HashSet<>();
		
		System.out.println("Inserisci n: ");
		int n = input.nextInt();
	
		for(int i = 2; i<=n; i++){
			insieme.add(i);
		}
	
		System.out.println(insieme);
	
		for(Integer k : insieme){
	    	for(int m = 2*k ; m <= n ; m += k)  
	         	insieme.remove(m);
		}
		System.out.println(insieme);
	}
}
