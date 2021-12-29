public class Ciclomotore extends VeicoloAMotore {
    private long telaio;

    public Ciclomotore(Vettore2D pos, Vettore2D vel, Vettore2D accel, int cilindrata, long telaio){
        super(pos, vel, accel, cilindrata);
        this.telaio=telaio;
    }
}
