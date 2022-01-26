public class Candidato extends Studente{
	private String lista;
	
	public Candidato(String nome, String cognome, long matricola, long codiceControllo, String lista){
		super(nome, cognome, matricola, codiceControllo);
		this.lista=lista;
	}
	
	public Candidato(){
		this("","",-1,-1,"");
	}
	
	@Override
	public String toString(){
		return "Candidato\n" + "Nome: " + super.getNome() + "\nCognome: " + super.getCognome() + "\nLista: " + lista + "\n";		
	}
}
