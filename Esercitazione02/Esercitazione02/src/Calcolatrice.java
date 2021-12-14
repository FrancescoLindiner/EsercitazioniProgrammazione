public class Calcolatrice {
    
    double[] generaVettore(int L){
        double[] vettore = new double[L];
        for (int i = 0; i < vettore.length; i++) {
            vettore[i]=Math.random()*1000;
        }
        return vettore;
    }

    double[] sommaVettori(double[] a, double[] b){
        if(a.length==b.length){
            double[] vettoreSomma = new double[a.length];
            for (int i = 0; i < vettoreSomma.length; i++) {
                vettoreSomma[i]=a[i]+b[i];
            }
            return vettoreSomma;
        }
        
        return a;
        
    }

    double[] concatenaVettori(double[] a, double[] b){
        int pos=0;
        double[] vettoreConcatenato = new double[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            vettoreConcatenato[pos]=a[i];
            pos++;
        }
        for (int j = 0; j < b.length; j++) {
            vettoreConcatenato[pos]=b[j];
            pos++;
        }
        return vettoreConcatenato;
    }

    void stampaVettori(double[] a){
        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
