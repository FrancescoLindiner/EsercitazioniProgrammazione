public class IntegerSet {
    boolean[] dati;

    public IntegerSet(){
        dati = new boolean[100];
        for (int i = 0; i < dati.length; i++) {
            dati[i] = false;
        }
    }

    public IntegerSet unionOfInteger(IntegerSet a){
        IntegerSet unionOfIntegerSet = new IntegerSet();
        for (int i = 0; i < dati.length; i++) {
            if (this.dati[i] && a.dati[i]) {
                unionOfIntegerSet.insertElement(i);
            }
        }
        return unionOfIntegerSet;
    }

    public IntegerSet intersectionOfIntegerSet(IntegerSet a){
        IntegerSet intersectionIntegerSet = new IntegerSet();
        for (int i = 0; i < dati.length; i++) {
            if (this.dati[i] && a.dati[i])
                intersectionIntegerSet.insertElement(i);
        }
        return intersectionIntegerSet;
    }

    public void insertElement(int i){
        dati[i]=true;
    }

    public void deleteElement(int i){
        dati[i]=false;
    }

    public String toString(){
        String ret = "";
        for (int i = 0; i < dati.length; i++) {
            if (dati[i]) {
                ret = ret + i + " ";
            }
        }
        return ret;
    }
}
