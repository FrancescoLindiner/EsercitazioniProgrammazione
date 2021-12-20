public class Persona {
    private String nome, cognome;
    private int eta;
    private Data dataDiNascita;

    public Persona(String nome, String cognome, int eta, Data dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.dataDiNascita = dataDiNascita;
    }

    public Persona() {
        this.nome = "Nessun nome inserito";
        this.cognome = "Nessun cognome inserito";
        this.eta = -1;
        this.dataDiNascita = new Data(1, " ", 1970);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nCognome: " + getCognome() + "\nEta': " + getEta() + "\nData di nascita: "
                + dataDiNascita;
    }

    public boolean equals(Persona p1, Persona p2) {
        boolean uguali = false;

        if (p1.getNome().equals(p2.getNome()) && p2.getCognome().equals(p2.getCognome())
                && p1.getEta() == p2.getEta()) {
            uguali = true;
        }
        return uguali;
    }

}
