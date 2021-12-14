public class Calcolatrice {

    double[] generaVettore(int L) {
        double[] vettore = new double[L];
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = Math.random() * 1000;
        }
        return vettore;
    }

    double[] sommaVettori(double[] a, double[] b) {
        if (a.length == b.length) {
            double[] vettoreSomma = new double[a.length];
            for (int i = 0; i < vettoreSomma.length; i++) {
                vettoreSomma[i] = a[i] + b[i];
            }
            return vettoreSomma;
        }

        return a;

    }

    double[] concatenaVettori(double[] a, double[] b) {
        int pos = 0;
        double[] vettoreConcatenato = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            vettoreConcatenato[pos] = a[i];
            pos++;
        }
        for (int j = 0; j < b.length; j++) {
            vettoreConcatenato[pos] = b[j];
            pos++;
        }
        return vettoreConcatenato;
    }

    void stampaVettori(double[] a) {
        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    double[][] generaMatrice(int R, int C) {
        double[][] matrice = new double[R][C];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                matrice[i][j] = (Math.random() * 100);
            }
        }
        return matrice;
    }

    double[][] sommaMatrici(double[][] a, double[][] b) {
        double[][] matriceSomma = new double[a.length][a.length];
        if (a.length == b.length) {
            matriceSomma = new double[a.length][a.length];
            for (int i = 0; i < matriceSomma.length; i++) {
                for (int j = 0; j < matriceSomma.length; j++) {
                    matriceSomma[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        return matriceSomma;
    }

    void stampaMatrice(double[][] a, String nome){
        System.out.println(nome);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
    }
}
