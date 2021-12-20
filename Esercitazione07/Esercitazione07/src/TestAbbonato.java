public class TestAbbonato {
    public static void main(String[] args) {
        Abbonato abbonato1 = new Abbonato("Mario", "Rossi", 15, new Data(05, "Luglio", 2001), 20);
        Abbonato abbonato2 = new Abbonato("Luigi", "Neri", 34, new Data(07, "Agosto", 1990), 0);

        System.out.println(abbonato1.toString());
        System.out.println("--------------------------------");
        System.out.println(abbonato2.toString());

        abbonato1.setSconto(60);
        abbonato1.calcolaSconto(300);
        System.out.println(abbonato1.toString());

        AbbonatoPremium abbonatoPremium = new AbbonatoPremium("Francesco", "Lindiner", 20, new Data(05, "Luglio", 2001), 30, 130);
        System.out.println(abbonatoPremium.toString());
        abbonatoPremium.calcolaAcquisti(300);
        System.out.println(abbonatoPremium.toString());
        abbonatoPremium.usaOmaggio();
        System.out.println(abbonatoPremium.toString());

    }
}
