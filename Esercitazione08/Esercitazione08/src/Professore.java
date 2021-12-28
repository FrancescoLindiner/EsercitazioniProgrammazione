public class Professore extends Persona {
    private Data dataDiAssunzione;
    private String ruolo;
    private String dipartimentoAppartenenza;
    private double stipendio;

    public Professore(String nome, String cognome, int eta, Data dataDiNascita, Data dataDiAssunzione, String ruolo,
            String dipartimentoAppartenenza, double stipendio) {
        super(nome, cognome, eta, dataDiNascita);
        setDataDiAssunzione(dataDiAssunzione);
        setRuolo(ruolo);
        setDipartimentoAppartenenza(dipartimentoAppartenenza);
        setStipendio(stipendio);
    }

    public Professore() {
        this("-", "-", 0, new Data(0, "-", 0), new Data(0, "-", 0), "-", "-", 0.0);
    }

    public void setDataDiAssunzione(Data dataDiAssunzione) {
        this.dataDiAssunzione = dataDiAssunzione;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setDipartimentoAppartenenza(String dipartimentoAppartenenza) {
        this.dipartimentoAppartenenza = dipartimentoAppartenenza;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Data getDataDiAssunzione() {
        return dataDiAssunzione;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getDipartimentoAppartenenza() {
        return dipartimentoAppartenenza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData di assunzione: " + getDataDiAssunzione() + "\nRuolo: " + getRuolo()
                + "\nDipartimento di appartenenza: " + getDipartimentoAppartenenza() + "\nStipendio: " + getStipendio();
    }
}
