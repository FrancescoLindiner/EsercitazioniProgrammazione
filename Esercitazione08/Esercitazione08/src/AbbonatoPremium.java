public class AbbonatoPremium extends Abbonato {

    private int totaleAcquisti = 0;

    public AbbonatoPremium(String nome, String cognome, int eta, Data dataDiNascita, int sconto, int spesa) {
        super(nome, cognome, eta, dataDiNascita, sconto);
        setTotaleAcquisti(spesa);
    }

    public AbbonatoPremium() {
        super();
    }

    public void setTotaleAcquisti(int spesa) {
        this.totaleAcquisti = spesa;
    }

    public int getTotaleAcquisti() {
        return totaleAcquisti;
    }

    public void calcolaAcquisti(int importoAcquisto) {
        totaleAcquisti += importoAcquisto;
        if (verificaOmaggio()) {
            System.out.println("Complimenti, hai diritto ad un acquisto gratuito");
        }
    }

    public boolean verificaOmaggio() {
        if (totaleAcquisti > 100) {
            return true;
        } else {
            return false;
        }
    }

    public void usaOmaggio() {
        if (verificaOmaggio()) {
            totaleAcquisti -= -100;
            System.out.println("Hai utilizzato l'omaggio");
        } else {
            System.out.println("Non puoi ancora utilizzare l'omaggio");
        }
    }

    public String toString() {
        return super.toString() + "\nTotale Acquisti: " + getTotaleAcquisti() + "\nDiritto all'omaggio: "
                + verificaOmaggio() + "\n";
    }
}
