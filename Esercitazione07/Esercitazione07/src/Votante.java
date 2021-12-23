public class Votante {
    private long numeroDiTelefono;
    private int numeroVoti;

    public Votante(long numeroDiTelefono) {
        this.numeroDiTelefono=numeroDiTelefono;
    }

    public Votante(long numeroDiTelefono, int numeroVoti){
        this.numeroDiTelefono=numeroDiTelefono;
        this.numeroVoti=numeroVoti;
    }
    
    public long getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public int getNumeroVoti() {
        return numeroVoti;
    }

    public void setNumeroVoti(int numeroVoti) {
        this.numeroVoti++;
    }
}
