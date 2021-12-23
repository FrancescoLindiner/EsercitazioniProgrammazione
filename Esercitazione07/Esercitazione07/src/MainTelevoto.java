import java.util.Scanner;

public class MainTelevoto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GestioneInputTelevoto inputTelevoto = new GestioneInputTelevoto();

        while (true) {
            System.out.println(
                    "1 per inserisci un voto\n2 per stampare i voti fino ad ora\n3 per stampare i voti di ogni cantante");
            int opzione = input.nextInt();
            switch (opzione) {
                case 1:
                    inputTelevoto.inserisciVoto();
                    break;
                case 2:
                    inputTelevoto.stampa();
                    break;

                case 3:

                    break;
                default:
                    break;
            }
        }
    }
}
