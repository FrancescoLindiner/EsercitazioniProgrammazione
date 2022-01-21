public class Square extends Shape implements Comparable<Square>{
    private double lato;

    public Square(String color, boolean filled, double lato) {
        super(color, filled);
        setLato(lato);
    }

    public Square() {
        this("Black", true, 1);
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return this.lato;
    }

    public double area() {
        return getLato() * getLato();
    }

    public String toString() {
        return "Square: " + getColor() + " " + getFilled() + " " + getLato() + " " + area();
    }
    
    public int compareTo(Square s){
    	if(this.area()==s.area()) return 0;
    	else if(this.area()<s.area()) return -1;
    	else return 1;
    }

}
