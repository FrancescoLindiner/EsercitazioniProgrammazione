import java.util.ArrayList;
import java.util.Scanner;

public class StudenteInterattivo {
    public static void main(String[] args) {
        Appello appello = new Appello();
        Singleton singletonInput = Singleton.getIstance();
        while (true) {
            System.out.println(
                "1)Inserisci uno studente\n2)Cercare uno studente in base al nome e cognome\n3)Cercare uno studente in base alla matricola\n4)Cancellare uno studente in base alla matricola\n5)Stampa l'intera lista\n6)Cancella l'intera lista\n7)Esci");
            System.out.print("Inserisci un'opzione: ");
            int opzione = singletonInput.insertInteger("Inserisci un'opzione: ");
            switch (opzione) {
                case 1:
                    appello.insertStudent();
                break;
                case 2:
                    appello.cercaStudente();
                default:
                    break;
            }
        }
    }
}
