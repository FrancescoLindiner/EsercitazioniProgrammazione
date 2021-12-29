public class VeicoloAMotore extends Veicolo {
    private int cilindrata;

    public VeicoloAMotore(Vettore2D pos, Vettore2D vel, Vettore2D accel, int cilindrata){
        super(pos, vel, accel);
        this.cilindrata=cilindrata;
    }
}
