public class TestLancia {
    public static void main(String[] args) {
        Moneta m1 = new Moneta();
        System.out.println("Lanci moneta");
        for (int i = 0; i < 10; i++) {
            System.out.print(m1.lanciabile());
        }

        System.out.println("\nLanci dado");
        Dado d1 = new Dado();
        for (int i = 0; i < 10; i++) {
            System.out.print(d1.lanciabile());
        }
    }
}
