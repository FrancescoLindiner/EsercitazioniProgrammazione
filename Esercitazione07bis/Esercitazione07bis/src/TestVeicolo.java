public class TestVeicolo {
    public static void main(String[] args) {
        Automobile automobile = new Automobile(new Vettore2D(10, 10), new Vettore2D(0, 40), new Vettore2D(0, 2), 1000, "GA123DC");
        Bicicletta bicicletta = new Bicicletta(new Vettore2D(), new Vettore2D(10, 0), new Vettore2D(), "MTX");
        Ciclomotore ciclomotore = new Ciclomotore(new Vettore2D(), new Vettore2D(20, 20), new Vettore2D(), 500, 67288);

        automobile.muovi(1);
        bicicletta.muovi(1);
        ciclomotore.muovi(1);

        System.out.println(automobile.posizione());
        System.out.println(bicicletta.posizione());
        System.out.println(ciclomotore.posizione());
    }
}
