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
        for (Studente studente : studenti) {
            if (studente.getNome().equals(nomeDaCercare)) {
                System.out.println("Studente trovato"); 
            }
        }
    }
}
