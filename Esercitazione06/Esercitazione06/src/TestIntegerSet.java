public class TestIntegerSet {
    public static void main(String[] args) {
        IntegerSet s = new IntegerSet();
        IntegerSet t = new IntegerSet();
        s.insertElement(2);
        s.insertElement(45);
        s.insertElement(22);
        s.insertElement(34);
        s.insertElement(3);
        s.insertElement(21);

        t.insertElement(15);
        t.insertElement(45);
        t.insertElement(27);
        t.insertElement(34);

        System.out.println("S: " + s.toString());
        System.out.println("T: " + s.toString());
        s.deleteElement(34);
        IntegerSet n = new IntegerSet();
        n = s.intersectionOfIntegerSet(t);
        System.out.println("N: " + n.toString());
        n=s.unionOfInteger(t);
        System.out.println("N: " + n.toString());

    }
}
