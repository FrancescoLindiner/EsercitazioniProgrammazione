public class Automobile extends VeicoloAMotore {
    private String targa;

    public Automobile(Vettore2D pos, Vettore2D vel, Vettore2D accel, int cilindrata, String targa) {
        super(pos, vel, accel, cilindrata);
        this.targa=targa;
    }
    
}
