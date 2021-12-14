public class TestMatematica {
    public static void main(String[] args) {
        Calcolatrice miaCalcolatrice = new Calcolatrice();
        double[][] m1 = miaCalcolatrice.generaMatrice(3, 5);
        double[][] m2 = miaCalcolatrice.generaMatrice(3, 5);
        double[][] m3 = miaCalcolatrice.generaMatrice(3, 5);

        miaCalcolatrice.stampaMatrice(m1, "Matrice 1");
        miaCalcolatrice.stampaMatrice(m2, "Matrice 2");
        miaCalcolatrice.stampaMatrice(m3, "Matrice 3");

        double[][] matriceSomma1 =  miaCalcolatrice.sommaMatrici(m1, m2);
        double[][] matriceSomma2 = miaCalcolatrice.sommaMatrici(m1, m3);

        miaCalcolatrice.stampaMatrice(matriceSomma1, "Matrice somma 1");
        miaCalcolatrice.stampaMatrice(matriceSomma2, "Matrice somma 2");
    }
}
