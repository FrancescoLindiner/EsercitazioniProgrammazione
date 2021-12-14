import java.util.ArrayList;

public class Principale2 {
    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();
        
        Persona p1 = new Persona("Mario", "Rossi", 20);
        Persona p2 = new Persona("Luigi", "Verdi", 45);
        Persona p3 = new Persona("Francesco", "Bianchi", 42);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);

        System.out.println(persone.size());

        System.out.println(persone.get(0).toString());
        persone.remove(1);

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i).toString());
        }

        persone.clear();
        System.out.println(persone.size());
    }
}
