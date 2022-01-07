public class Rectangle extends Shape {
    private double width, length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public Rectangle() {
        this("Black", true, 1, 2);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double area() {
        return getLength() * getWidth();
    }

    public String toString() {
        return "Rectangle: " + getColor() + " " + getFilled() + " " + getWidth() + " " + getLength() + " " + area();
    }
}
