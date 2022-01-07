public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    }

    public boolean equals(Punto altro) {
        if (getX() == altro.getX() && getY() == altro.getY())
            return true;
        return false;
    }

    public double distanzaDa(Punto altro) {
        return Math.sqrt((this.getX() - altro.getX()) * (this.getX() - altro.getX()) +
                (this.getY() - altro.getY()) * (this.getY() - altro.getY()));
    }

    public Punto puntoMedio(Punto altro){
        double x, y;
        x = (getX()+altro.getX())/2;
        y = (getY()+altro.getY())/2;
        return new Punto(x, y);
    }   
}
