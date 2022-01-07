public class TestRazionale {
    public static void main(String[] args) {
        Razionale razionale = new Razionale(1, 4);

        razionale.somma(new Razionale(1, 0));

        System.out.println(razionale.toString());
    }
}
