public class Vettore2D{
    private double x, y;

    public Vettore2D(double x, double y){
        setX(x);
        setY(y);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }
}