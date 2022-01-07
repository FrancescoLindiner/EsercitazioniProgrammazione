public class MainVectorInteger{
	public static void main(String[] args){
		VectorInteger v1, v2, v3;
		
		v1 = new VectorInteger(5);
		v2 = new VectorInteger(5);
		v3 = new VectorInteger();
		
		try{
			v1.setVector(0, 1);
			v1.setVector(1, 2);
			v1.setVector(2, 3);
			v1.setVector(3, 4);
			v1.setVector(4, 5);
			
			v2.setVector(0, 5);
			v2.setVector(1, 5);
			v2.setVector(2, 5);
			v2.setVector(3, 5);
			v2.setVector(4, 5);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Primo vettore: " + v1.toString());
		System.out.println("Secondo vettore: " + v2.toString());
		VectorInteger ris = v1.somma(v2);
		System.out.println("Vettore somma: "+ris.toString());
		
		
		ris = v1.sottrazione(v2);
		System.out.println("Vettore differenza: "+ris.toString());
		
		ris = v1.moltiplicazione(v2);
		System.out.println("Vettore moltiplicazione: "+ris.toString());
		
		System.out.println(v1.compareTo(v3));
		
		System.out.println(v1.modulo());
		System.out.println(v2.modulo());
	}
}
