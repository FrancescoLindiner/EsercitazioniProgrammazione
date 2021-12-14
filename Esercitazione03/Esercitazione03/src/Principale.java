public class Principale {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNome("Francesco");
        persona1.setCognome("Lindiner");
        persona1.setEta(20);

        Persona persona2 = new Persona();
        persona2.setNome("Mario");
        persona2.setCognome("Rossi");
        persona2.setEta(43);

        Persona persona3;
        persona3=persona1;

        System.out.println(persona1.toString());
        System.out.println(persona3.toString());

        persona3.setNome("Luigi");
        System.out.println(persona1.toString());
    }
}
