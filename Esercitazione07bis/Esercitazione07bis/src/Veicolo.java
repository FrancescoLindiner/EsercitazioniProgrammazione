public class Veicolo {
    private Vettore2D pos, vel, accel;

    public Veicolo(Vettore2D pos, Vettore2D vel, Vettore2D accel){
        this.pos=pos;
        this.vel=vel;
        this.accel=accel;
    }

    public void muovi(double t){
        double x = pos.getX() + vel.getX()*t + accel.getX()*t*t; 
        double y = pos.getY() + vel.getY()*t + accel.getY()*t*t;

        pos.setX(x);
		pos.setY(y);
	}
	
	public String posizione(){
		return "(" + pos.getX() + ", " + pos.getY() + ")";
	}
}
