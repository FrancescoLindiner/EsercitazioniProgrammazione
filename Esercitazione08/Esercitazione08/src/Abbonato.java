public class Abbonato extends Persona {
    private int sconto;

    public Abbonato(String nome, String cognome, int eta, Data dataDiNascita, int sconto) {
        super(nome, cognome, eta, dataDiNascita);
        this.sconto = sconto;
    }

    public Abbonato() {
        this("-", "- ", -1, new Data(0, 0, 0), 0);
    }

    public void setSconto(int sconto) {
        if (getSconto() > 100) {
            this.sconto = sconto;
        }
        this.sconto = 0;
    }

    public int getSconto() {
        return sconto;
    }

    public String toString() {
        return super.toString() + "\nSconto applicato: " + getSconto() + "\n";
    }

    public int calcolaSconto(int importo){
        return importo - importo*getSconto()/100;
    }
}
