import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Seggio{
	private List<Studente> studenti = new ArrayList<>();
	private List<Candidato> candidati = new ArrayList<>();
	private List<Studente> votanti = new ArrayList<>();
	private Map<String, Integer> votiCandidati = new HashMap<>();
		
	public Seggio(){
		Studente s1 = new Studente("Nome1", "Cognome1", 123, 123);
		Studente s2 = new Studente("Nome2", "Cognome2", 1234, 1231);
		Studente s3 = new Studente("Nome3", "Cognome3", 1235, 1232);
		Studente s4 = new Studente("Nome4", "Cognome4", 1236, 1233);
		Studente s5 = new Studente("Nome5", "Cognome5", 1237, 1234);
		Studente s6 = new Studente("Nome6", "Cognome6", 1238, 1235);
		Studente s7 = new Studente("Nome7", "Cognome7", 1239, 1236);
		Studente s8 = new Studente("Nome8", "Cognome8", 12310, 1237);
		Studente s9 = new Studente("Nome9", "Cognome9", 12311, 1238);
		Studente s10 = new Studente("Nome10", "Cognome10", 12312, 1239);
		
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
		studenti.add(s4);
		studenti.add(s5);
		studenti.add(s6);
		studenti.add(s7);
		studenti.add(s8);
		studenti.add(s9);
		studenti.add(s10);
		
		Candidato c1 = new Candidato("Nome1", "Cognome1", 123, 123, "lista1");
		Candidato c2 = new Candidato("Nome42", "Cognome51", 12232, 14213, "lista2");
		Candidato c3 = new Candidato("Nome34", "Cognome35", 12332, 12313, "lista3");
		
		candidati.add(c1);
		candidati.add(c2);
		candidati.add(c3);
	}
	
	public boolean controllaDati(long matricola, long codiceControllo){
		for(Studente s : studenti){
			if(s.getMatricola()==matricola && s.getCodiceControllo()==codiceControllo) return true;
		}
		return false;	
	}
	
	public void stampaListaStudenti(){
		for(Studente s : studenti){
			System.out.println(s.toString());
		}
	}
	
	public void stampaListaCandidati(){
		int i=1;
		for(Candidato c : candidati){
			System.out.println(i+" "+c.toString());
		}
	}
	
	public int sizeCandidati(){
		return candidati.size();
	}
	
	public boolean controllaVotante(long matricola, long codiceControllo){
		for(Studente s : votanti){
			if(s.getMatricola()==matricola && s.getCodiceControllo()==codiceControllo)
				return true;
		}
		return false;
	}
	
	public void inserisciVotante(long matricola, long codiceControllo){
		Studente studente;
		for(Studente s : studenti){
			if(s.getMatricola()==matricola && s.getCodiceControllo()==codiceControllo){
				studente = s;
				votanti.add(s);
				break;
			}
		}
	}
	
	public void inserisciVoto(String lista){
		if(votiCandidati.size()==0)
			votiCandidati.put(lista, 1);
		else if(votiCandidati.containsKey(lista)){
			for(String key : votiCandidati.keySet()) {
				if(key.equals(lista)){
					votiCandidati.put(lista, votiCandidati.get(key)+1);
				}
			}
		}else if(!(votiCandidati.containsKey(lista))){
			votiCandidati.put(lista, 1);
		}
	}
	
	public void stampaVoti(){
		System.out.println(votiCandidati);
	}
	
	public void spoglio(int listeBianche, int schedeNulle){
		if(studenti.size()!=votanti.size()) 
			;
		else{
			System.out.println("Numero votanti: " + votanti.size());
			System.out.println("Schede bianche: " + listeBianche + "\nSchede nulle: " + schedeNulle);
		}
		for (Map.Entry<String, Integer> entry : votiCandidati.entrySet()) {
		    System.out.println(entry.getKey()+" = "+entry.getValue());
		}
			
	}
	
	public int getSizeStudenti(){
		return studenti.size();
	}
	
	public int getSizeVotanti(){
		return votanti.size();
	}
}
