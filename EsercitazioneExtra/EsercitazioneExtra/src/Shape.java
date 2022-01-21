public class Shape{

    private String color;
    private boolean filled;

    public Shape() {
        this("Black", false);
    }

    public Shape(String color, boolean b) {
        this.color = color;
        this.filled = b;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public String toString() {
        return "Shape: " + color + " " + filled;
    }
    
}
