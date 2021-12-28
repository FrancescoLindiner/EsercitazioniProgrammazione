import java.util.ArrayList;

public class GestioneAbbonati {
    ArrayList<Abbonato> abbonati = new ArrayList<>();

    public void aggiungi(Abbonato abbonato){
        abbonati.add(abbonato);
    }

    public void cancella(Abbonato abbonato){
        for (Abbonato a : abbonati) {
            if (a.equals(abbonato)) {
                abbonati.remove(abbonato);
                System.out.println("Abbonato cancellato\n");
            }
        }
    }

    public void stampa(){
        for (Abbonato abbonato : abbonati) {
            if(abbonato instanceof Abbonato){
                System.out.println(abbonato.toString());
            }else{
                AbbonatoPremium aPremium = (AbbonatoPremium)abbonato;
                System.out.println(aPremium.toString());
            }
        }
    }

    public void setSconto(Abbonato a, int sconto) {

        for (Abbonato abbonato : abbonati) {
            if (abbonato.equals(a)) {
                a.setSconto(sconto);     
            }
        }
    }
}
