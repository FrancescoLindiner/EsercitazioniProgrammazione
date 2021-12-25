public class TestPositiveIntegerSet {
    public static void main(String[] args) {
        PositiveIntegerSet positiveIntegerSet1 = new PositiveIntegerSet(1,2,3,4,5,7,8,9,10);
        PositiveIntegerSet positiveIntegerSet2 = new PositiveIntegerSet();
        PositiveIntegerSet positiveIntegerSet3 = new PositiveIntegerSet(1,2,3,4,5,6,7);

        PositiveIntegerSet difference;
        difference = positiveIntegerSet1.difference(positiveIntegerSet3);
        difference.stampa();
    }
}
