import java.util.ArrayList;

public class Appello {
    Singleton singletonInput = Singleton.getIstance();
    private ArrayList<Studente> studenti;

    public Appello() {
        studenti = new ArrayList<>();
    }

    public void insertStudent() {
        String nome = singletonInput.insertString("Inserisci il nome: ");
        String cognome = singletonInput.insertString("Inserisci il cognome: ");
        int giornoDiNascita = singletonInput.insertInteger("Inserisci il giorno di nascita: ");
        String meseDiNascita = singletonInput.insertString("Inserisci il mese di nascita: ");
        int annoDiNascita = singletonInput.insertInteger("Inserisci l'anno di nascita: ");
        Data dataDiNascita = new Data(giornoDiNascita, meseDiNascita, annoDiNascita);
        long matricola = singletonInput.insertLong("Inserisci la matricola: ");
        Studente studente = new Studente(nome, cognome, matricola, dataDiNascita);
        studenti.add(studente);
    }

    public void cercaStudente(){
        String nomeDaCercare = singletonInput.insertString("Inserisci nome da cercare: ");
        String cognomeDaCercare = singletonInput.insertString("Inserisci cognome da cercare: ");
        for (Studente studente : studenti) {
            if (studente.getNome().equals(nomeDaCercare) && studente.getCognome().equals(cognomeDaCercare)) {
                System.out.println("Studente trovato\n\n"); 
                System.out.println(studente.toString());
            }
        }
    }

    public void cercaMatricola(){
        boolean trovato=false;
        long matricolaDaCercare = singletonInput.insertLong("Inserisci matricola da cercare: ");
        for (Studente studente : studenti) {
            if (studente.getMatricola()==matricolaDaCercare) {
                System.out.println("Studente trovato\n\n");
                System.out.println(studente.toString());
                trovato=true;
                break;
            }
        }
        if (!trovato) {
            System.out.println("Studente non trovato\n\n");
        }
    }

    public void cancellaStudente(){
        boolean trovato=false;
        long matricolaDaCercare = singletonInput.insertLong("Inserisci matricola da cancellare: ");
        for (Studente studente : studenti) {
            if (studente.getMatricola()==matricolaDaCercare) {
                studenti.remove(studente);
                System.out.print("Studente rimosso con successo\n\n");
                break;
            }
        }
        if (!trovato) {
            System.out.println("Studente non trovato\n\n");
        }
    }

    public void cancellaLista(){
        String risposta = singletonInput.insertString("Sei sicuro di cancellare l'intera lista?(Si, No) ");
        if (risposta.equals("Si") || risposta.equals("si")) {
            studenti.clear();
            System.out.println("Lista cancellata con successo\n\n");
        }
        else if(risposta.equals("No") || risposta.equals("no")){
            System.out.println("Lista non cancellata");
        }
    }

    public void stampaLista(){
        for (Studente studente : studenti) {
            System.out.println(studente);
        }
    }
}
