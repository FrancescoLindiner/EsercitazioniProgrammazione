import java.util.ArrayList;

public class GestioneCorsoLaurea {
    private ArrayList<Persona> corso = new ArrayList<>();
    
    public int sizeCheck(){
        return corso.size();
    }

    public double costoSalari(){
        double totale=0;
        for(Persona p : corso){
            if(p instanceof Professore){
                Professore prof = (Professore)p;
                totale += prof.getStipendio();
            }
        }
        return totale;
    }

    public double ricavo(){
        double totale=0;
        for(Persona p : corso){
            if(p instanceof Studente){
                Studente studente = (Studente)p;
                totale += studente.getTassa();
            }
        }
        return totale;
    }

    public void aggiungi(Persona p){
        if(sizeCheck()<100)
            corso.add(p);
        else 
            System.out.println("Numero massimo raggiunto");
    }

    public void stampa(){
        for (Persona persona : corso) {
            if (persona instanceof Studente) {
                Studente stud = (Studente)persona;
                System.out.println(stud.toString());
            }else if(persona instanceof Professore){
                Professore prof = (Professore)persona;
                System.out.println(prof.toString());
            }else if(persona instanceof StudenteTriennale){
                StudenteTriennale studenteTriennale = (StudenteTriennale)persona;
                System.out.println(studenteTriennale.toString());
            }else if(persona instanceof StudenteMagistrale){
                StudenteMagistrale studenteMagistrale = (StudenteMagistrale)persona;
                System.out.println(studenteMagistrale.toString());
            }
        }
    }
}
