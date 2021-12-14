import java.util.ArrayList;
import java.util.Scanner;

public class PersonaInterattiva extends Persona {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Persona> rubrica = new ArrayList<>();
        int opzione;
        do {
            System.out.println(
                    "1)Inserire una persona alla rubrica\n2)Cercare una persona nella rubrica\n3)Stampare la rubrica\n4)Cancellare la lista\n5)Esci");
            opzione=input.nextInt();
                    switch (opzione) {
                case 1:
                    String nome, cognome;
                    int eta;
                    System.out.print("Inserisci il nome: ");
                    nome = input.next();
                    System.out.print("Inserisci il cognome: ");
                    cognome = input.next();
                    System.out.print("Inserisci l'eta'");
                    eta = input.nextInt();
                    Persona persona = new Persona(nome, cognome, eta);
                    rubrica.add(persona);
                    break;
                case 2:
                    System.out.print("Inserisci il nome: ");
                    String nomeDaCercare = input.next();
                    boolean trovato = false;
                    for (int i = 0; i < rubrica.size(); i++) {
                        if(nomeDaCercare.equals(rubrica.get(i).getNome())){
                            System.out.println(rubrica.get(i).toString());
                            trovato=true;
                        }
                    }
                    break;
                case 3:
                    for (Persona p : rubrica) {
                        System.out.println(p.toString());
                    }
                    break;
                case 4:
                    rubrica.clear();
                    break;
                case 5:
                    System.out.println("Arrivederci");
                    break;
                default:
                    break;
            }
        }while(opzione!=5);

    }
}