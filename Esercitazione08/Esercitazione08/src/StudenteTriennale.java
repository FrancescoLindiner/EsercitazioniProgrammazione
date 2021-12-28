public class StudenteTriennale extends Studente {
    private String scuolaDiProvenienza;
    private final int CFU_DA_CONSEGUIRE = 180;

    public StudenteTriennale(String nome, String cognome, int eta, Data dataDiNascita, Data dataDiIscrizione,
            long matricola, String corsoDiLaurea, double tassa, String scuolaDiProvenienza) {
        super(nome, cognome, eta, dataDiNascita, dataDiIscrizione, matricola, corsoDiLaurea, tassa);
        setScuolaDiProvenienza(scuolaDiProvenienza);
    }

    public StudenteTriennale() {
        this("-", "-", 0, new Data(0, "-", 0), new Data(0, "-", 0), 0, "-", 0.0, "-");
    }

    public void setScuolaDiProvenienza(String scuolaDiProvenienza) {
        this.scuolaDiProvenienza = scuolaDiProvenienza;
    }

    public String getScuolaDiProvenienza() {
        return scuolaDiProvenienza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScuola di provenienza: " + getScuolaDiProvenienza();
    }
}
