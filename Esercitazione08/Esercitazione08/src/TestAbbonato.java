import java.util.ArrayList;

public class TestAbbonato {
    public static void main(String[] args) {
        GestioneAbbonati abbonati = new GestioneAbbonati();

        Abbonato abbonato1 = new Abbonato("Mario", "Rossi", 15, new Data(05, "Luglio", 2001), 20);
        AbbonatoPremium abbonatoPremium = new AbbonatoPremium("Francesco", "Lindiner", 20, new Data(05, "Luglio", 2001), 30, 130);
        
        abbonati.aggiungi(abbonato1);
        abbonati.aggiungi(abbonatoPremium);

        abbonati.stampa();

        abbonati.setSconto(abbonato1, 60);
        abbonato1.calcolaSconto(300);

        /*abbonato1.setSconto(60);
        abbonato1.calcolaSconto(300);

        System.out.println(abbonatoPremium.toString());
        abbonatoPremium.calcolaAcquisti(300);
        System.out.println(abbonatoPremium.toString());
        abbonatoPremium.usaOmaggio();
        System.out.println(abbonatoPremium.toString());*/
        abbonati.stampa();

    }
}
