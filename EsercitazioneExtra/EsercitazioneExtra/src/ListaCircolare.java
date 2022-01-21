import java.util.List;
import java.util.ArrayList;

public class ListaCircolare<T>{

	private List<T> listaCircolare;
	private int elementoCorrente = 0;
	
	public ListaCircolare(){
		listaCircolare = new ArrayList<>();
	}
	
	public void aggiungi(T t){
		if(isFull()){
			System.out.println("Lista Piena");
		}else{
			listaCircolare.add(this.elementoCorrente, t);	
			this.elementoCorrente++;
		}	
	}
	
	public void stampa(){
		for(int i = 0; i<listaCircolare.size(); i++){
			System.out.println(listaCircolare.get(i));
		}
	}

	public boolean isFull(){
		if(listaCircolare.size()==3) return true;
		else return false;
	}
	
	public void rimuovi(){
		this.elementoCorrente--;
		if(this.elementoCorrente==this.listaCircolare.size()){
			this.elementoCorrente=0;
			listaCircolare.remove(this.elementoCorrente);
		}else if(this.elementoCorrente==-1){
			this.elementoCorrente=this.listaCircolare.size()-1;
			listaCircolare.remove(this.elementoCorrente);
		}else
			listaCircolare.remove(this.elementoCorrente);
		System.out.println("Elemento corrente cancellato");
	}	
	
	public void stampaElementoCorrente(){
		if(this.elementoCorrente==this.listaCircolare.size()){
			this.elementoCorrente=0;
			System.out.println(listaCircolare.get(this.elementoCorrente));
		}else
			System.out.println(listaCircolare.get(this.elementoCorrente));
	}
	
	public void vaiAvanti(){
		this.elementoCorrente++;
		if(this.elementoCorrente==this.listaCircolare.size() || this.elementoCorrente==this.listaCircolare.size()+1){
			this.elementoCorrente=0;
			System.out.println(listaCircolare.get(this.elementoCorrente));
		}else{
			System.out.println(listaCircolare.get(this.elementoCorrente));
		}
	}
	
	public void vaiIndietro(){
		this.elementoCorrente--;
		if(this.elementoCorrente==-1){
			this.elementoCorrente=this.listaCircolare.size()-1;
			System.out.println(listaCircolare.get(this.elementoCorrente));
		}else
			System.out.println(listaCircolare.get(this.elementoCorrente));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
