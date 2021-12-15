public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Blue", true, 4, 3);
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle.toString());
        System.out.println(rectangle2.toString());

        Square square = new Square("Pink", false, 3);
        Square square2 = new Square();
        System.out.println(square.toString());
        System.out.println(square2.toString());

        Circle circle = new Circle("Violet", false, 4.3);
        Circle circle2 = new Circle();
        System.out.println(circle.toString());
        System.out.println(circle2.toString());

        Shape shape = new Shape("White", true);
        Shape shape2 = new Shape();
        System.out.println(shape.toString());
        System.out.println(shape2.toString());

    }
}
