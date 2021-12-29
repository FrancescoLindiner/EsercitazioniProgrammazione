public class Bicicletta extends Veicolo{
    private String modello;

    public Bicicletta(Vettore2D pos, Vettore2D vel, Vettore2D accel, String modello) {
        super(pos, vel, accel);
        this.modello=modello;
    }
    
}
