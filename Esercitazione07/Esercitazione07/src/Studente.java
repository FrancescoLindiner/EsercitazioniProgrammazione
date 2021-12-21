import java.util.ArrayList;

public class Studente extends Persona {
    private Data dataDiIscrizione;
    private long matricola;
    private String corsoDiLauera;
    private double tassa;

    ArrayList<Studente> studenti = new ArrayList<>();
    Singleton input = Singleton.getIstance();

    public Studente(String nome, String cognome, int eta, Data dataDiNascita, Data dataDiIscrizione, long matricola,
            String corsoDiLaurea, double tassa) {
        super(nome, cognome, eta, dataDiNascita);
        setDataDiIscrizione(dataDiIscrizione);
        setMatricola(matricola);
        setCorsoDiLaurea(corsoDiLaurea);
        setTassa(tassa);
    }

    public Studente() {
        this("-", "-", 0, new Data(0, "-", 0), new Data(0, "-", 0), 0, "-", 0.0);
    }

    public void setDataDiIscrizione(Data dataDiIscrizione) {
        this.dataDiIscrizione = dataDiIscrizione;
    }

    public void setMatricola(long matricola) {
        this.matricola = matricola;
    }

    public void setCorsoDiLaurea(String corsoDiLaurea) {
        this.corsoDiLauera = corsoDiLaurea;
    }

    public void setTassa(double tassa) {
        this.tassa = tassa;
    }

    public Data getDataDiIscrizione() {
        return dataDiIscrizione;
    }

    public long getMatricola() {
        return matricola;
    }

    public String getCorsoDiLauera() {
        return corsoDiLauera;
    }

    public double getTassa() {
        return tassa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData di iscrizione: " + getDataDiIscrizione() + "\nMatricola: " + getMatricola()
                + "\n" + getCorsoDiLauera() + "\nTassa: " + getTassa();
    }

    public void insertStudent(){
        String nome = input.insertString("Inserisci nome: ");
        String cognome = input.insertString("Inserisci cognome: ");
        int eta = input.insertInteger("Inserisci eta': ");
        int giornoDiNascita = input.insertInteger("Inserisci giorno di nascita: ");
        String meseDiNascita = input.insertString("Inserisci mese di nascita: ");
        int annoDiNascita = input.insertInteger("Inserisci anno di nascita: ");
        int  giornoIscrizione = input.insertInteger("Inserisci giorno di nascita: ");
        String meseIscrizione= input.insertString("Inserisci mese di nascita: ");
        int annoIscrizione = input.insertInteger("Inserisci anno di nascita: ");
        long matricola = input.insertLong("Inserisci matricola: ");
        String corsoDiLaurea = input.insertString("Inserisci il corso di laurea: ");
        double tassa = input.insertDouble("Inserisci la tassa: ");
        Studente studente = new Studente(nome, cognome, eta, new Data(giornoDiNascita, meseDiNascita, annoDiNascita), new Data(giornoIscrizione, meseIscrizione, annoIscrizione), matricola, corsoDiLaurea, tassa);
        studenti.add(studente);
        System.out.println("Studente inserito");
    }

    public void deleteStudent() {
        long matricolaDaCercare = input.insertLong("Inserisci la matricola: ");
        for (Studente studente : studenti) {
            if (matricolaDaCercare == studente.getMatricola()) {
                studenti.remove(studente);
                System.out.println("Studente rimosso con successo!");
                break;
            }
        }
    }

    public void stampa(){
        for (Studente studente : studenti) {
            System.out.println(studente.toString());
        }
    }
}
