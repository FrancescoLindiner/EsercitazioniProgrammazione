import java.util.ArrayList;

public class VectorInteger{
	
	ArrayList<Integer> vector;
	
	public VectorInteger(int dim){
		vector = new ArrayList<>();
		for(int i = 0; i<dim; i++){
			vector.add(0);
		}
	}
	
	public VectorInteger(){
		this(10);
	}
	
	public void setVector(int i, int e) throws IllegalArgumentException{
		if(i>=0 && i<vector.size()){
			vector.set(i, e);
		}else{
			throw new IllegalArgumentException("Indice " + i + " non valido");
		}
	} 
	
	public int get(int i) throws IllegalArgumentException{
		if(i>=0 && i<vector.size()){
			return vector.get(i);
		}else{
			throw new IllegalArgumentException("Indice " + i + " non valido"); 
		}
	}
	
	public VectorInteger somma(VectorInteger v)throws IllegalArgumentException{
		VectorInteger ris;
		if(this.vector.size()!=v.vector.size()){
			throw new IllegalArgumentException("Dimensione vettori diversa!!");
		}else{
			ris = new VectorInteger(this.vector.size());
			for(int i = 0; i<this.vector.size(); i++){
				ris.setVector(i, this.get(i)+v.get(i));
			}
		}
		return ris;
	}
	
		public VectorInteger sottrazione(VectorInteger v)throws IllegalArgumentException{
		VectorInteger ris;
		if(this.vector.size()!=v.vector.size()){
			throw new IllegalArgumentException("Dimensione vettori diversa!!");
		}else{
			ris = new VectorInteger(this.vector.size());
			for(int i = 0; i<this.vector.size(); i++){
				ris.setVector(i, this.get(i)-v.get(i));
			}
		}
		return ris;
	}
	
		public VectorInteger moltiplicazione(VectorInteger v)throws IllegalArgumentException{
		VectorInteger ris;
		if(this.vector.size()!=v.vector.size()){
			throw new IllegalArgumentException("Dimensione vettori diversa!!");
		}else{
			ris = new VectorInteger(this.vector.size());
			for(int i = 0; i<this.vector.size(); i++){
				ris.setVector(i, this.get(i)*v.get(i));
			}
		}
		return ris;
	}
	
	public VectorInteger scalare(VectorInteger v, int scalare){
		VectorInteger ris = new VectorInteger(v.vector.size());
		
		for(int i = 0; i<v.vector.size(); i++){
			ris.setVector(i, v.get(i)*scalare);
		}
		
		return ris;
	}
	
	public double modulo(){
		double ris = 0.0;
		
		for(int i = 0; i<this.vector.size(); i++){
			ris = ris +this.get(i)*this.get(i);
		}
		return Math.sqrt(ris);
	}
	
	public int compareTo(VectorInteger o){
		if(this.modulo()>o.modulo()){
			return 1;
		}else if(this.modulo()==o.modulo()){
			return 0;
		}else{
			return -1;
		}
	}
	
	@Override
	public String toString(){
		return vector.toString();
	}
	
	
}
