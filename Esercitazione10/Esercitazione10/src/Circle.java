public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }

    public Circle() {
        this("Black", true, 1);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius = radius;
    }

    public double area() {
        return Math.PI * getRadius() * getRadius();
    }

    public String toString() {
        return "Circle: " + getColor() + " " + getFilled() + " " + getRadius() + " " + area();
    }
}
