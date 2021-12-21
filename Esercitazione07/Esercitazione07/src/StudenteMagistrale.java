public class StudenteMagistrale extends StudenteTriennale {
    private String corsoTriennale;
    private final int CFU_DA_CONSEGUIRE = 120;

    public StudenteMagistrale(String nome, String cognome, int eta, Data dataDiNascita, Data dataDiIscrizione,
            long matricola, String corsoDiLaurea, double tassa, String scuolaDiProvenienza, String corsoTriennale) {
        super(nome, cognome, eta, dataDiNascita, dataDiIscrizione, matricola, corsoDiLaurea, tassa,
                scuolaDiProvenienza);
        setCorsoTriennale(corsoTriennale);
    }

    public void setCorsoTriennale(String corsoTriennale) {
        this.corsoTriennale = corsoTriennale;
    }

    public String getCorsoTriennale() {
        return corsoTriennale;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCorso triennale: " + getCorsoTriennale();
    }
}
