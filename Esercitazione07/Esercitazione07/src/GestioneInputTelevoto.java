import java.util.ArrayList;
import java.util.Scanner;

public class GestioneInputTelevoto {

    Scanner input = new Scanner(System.in);

    ArrayList<Votante> votanti = new ArrayList<>();

    public void inserisciVoto() {

        System.out.print("Inserisci il numero di telefono: ");
        long numeroDiTelefono = input.nextLong();
        System.out.print("Inserisci il numero del cantante: ");
        int numeroCantante = input.nextInt();

        Votante nuovoVoto = new Votante(numeroDiTelefono);

        if (votanti.size() == 0) {
            votanti.add(nuovoVoto);
            System.out.println("Voto aggiunto\n\n");
        } else if (votanti.size() > 0) {
            for (Votante votante : votanti) {
                if (votante.getNumeroDiTelefono() == nuovoVoto.getNumeroDiTelefono() && votante.getNumeroVoti() < 5) {
                    nuovoVoto.setNumeroVoti(votante.getNumeroVoti());
                    Votante voto = new Votante(nuovoVoto.getNumeroDiTelefono(), nuovoVoto.getNumeroVoti());
                    votanti.add(voto);
                    System.out.println("Voto aggiunto\n\n");
                    break;
                }
            }
        } else {
            System.out.println("Voto non aggiunto\n\n");

        }
    }

    public void stampa(){
        System.out.println(votanti.toString());
    }
}
