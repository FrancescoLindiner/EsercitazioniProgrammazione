public class TestNumero {
    public static void main(String[] args) {
        Razionale razionale1 = new Razionale(4, 3);
        Razionale razionale2 = new Razionale(7, 5);

        
        Razionale risAddizione = razionale1.addizione(razionale2);
        System.out.println(risAddizione.toString());

        Razionale risSottrazione = razionale1.sottrazione(razionale2);
        System.out.println(risSottrazione.toString());

        Razionale risMoltiplicazione = razionale1.moltiplicazione(razionale2);
        System.out.println(risMoltiplicazione.toString());

        Razionale risDivisione = razionale1.divisione(razionale2);
        System.out.println(risDivisione.toString());
    }
}
