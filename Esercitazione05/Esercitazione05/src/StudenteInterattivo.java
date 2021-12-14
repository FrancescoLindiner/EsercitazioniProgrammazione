import java.util.ArrayList;
import java.util.Scanner;

public class StudenteInterattivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Studente> studenti = new ArrayList<>();

        while (true) {
            System.out.println(
                "1)Inserisci uno studente\n2)Cercare uno studente in base al nome e cognome\n3)Cercare uno studente in base alla matricola\n4)Cancellare uno studente in base alla matricola\n5)Stampa l'intera lista\n6)Cancella l'intera lista\n7)Esci");
            System.out.print("Inserisci un'opzione: ");
            int opzione = input.nextInt();
            switch (opzione) {
                case 1:
                System.out.print("Inserisci nome, cognome, matricola: ");
                String nome=input.next();
                String cognome=input.next();
                long matricola=input.nextLong();
                System.out.print("Inserisci giorno di nascita: ");
                int giornoNascita=input.nextInt();
                System.out.print("Inserisci mese di nascita: ");
                int meseNascita = input.nextInt();
                System.out.print("Inserisci anno di nascita: ");
                int annoNascita=input.nextInt();
                Data dataNascita=new Data(giornoNascita, meseNascita, annoNascita);
                Studente studente = new Studente(nome, cognome, matricola, dataNascita);
                studenti.add(studente);
                break;
                default:
                    break;
            }
        }
    }
}
