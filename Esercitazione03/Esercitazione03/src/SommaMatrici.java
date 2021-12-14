public class SommaMatrici {
    public static void main(String[] args) {
        int[][] matrice1 = new int[3][5];
        int[][] matrice2 = new int[3][5];

        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1.length; j++) {
                matrice1[i][j]=(int) (Math.random()*100);
                matrice2[i][j]=(int) (Math.random()*100);
            }
        }
        System.out.println("Matrice 1");
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1.length; j++) {
                System.out.print(matrice1[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\n\nMatrice 2");
        for (int i = 0; i < matrice2.length; i++) {
            for (int j = 0; j < matrice2.length; j++) {
                System.out.print(matrice2[i][j]+" ");
            }
            System.out.print("\n");
        }

        int[][] matriceSomma = new int[3][5];
        for (int i = 0; i < matriceSomma.length; i++) {
            for (int j = 0; j < matriceSomma.length; j++) {
                matriceSomma[i][j]=matrice1[i][j]+matrice2[i][j];
            }
        }
        System.out.println("\n\nMatrice somma");
        for (int i = 0; i < matriceSomma.length; i++) {
            for (int j = 0; j < matriceSomma.length; j++) {
                System.out.print(matriceSomma[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
