import java.util.ArrayList;

public class PositiveIntegerSet {

    private ArrayList<Integer> interi;


    public PositiveIntegerSet(int... varInteri) {
        interi = new ArrayList<>();
        for (int i : varInteri) {
            interi.add(i);
        }
    }

    public PositiveIntegerSet union(PositiveIntegerSet s) {
        PositiveIntegerSet positiveIntegerSet = new PositiveIntegerSet();

        for (int e : interi) {
            positiveIntegerSet.insertElement(e);
        }

        for (int e : s.interi) {
            positiveIntegerSet.insertElement(e);
        }
    

        return positiveIntegerSet;
    }

    public PositiveIntegerSet intersection(PositiveIntegerSet s) {
        PositiveIntegerSet intersectionOfIntegerSet = new PositiveIntegerSet();

        for (int i = 0; i < Math.max(interi.size(), s.size()); i++) {
            if(s.containsElement(interi.get(i))){
                intersectionOfIntegerSet.insertElement(interi.get(i));
            }
        }
        return intersectionOfIntegerSet;
    }

    public PositiveIntegerSet difference(PositiveIntegerSet s) {
        PositiveIntegerSet differnceOfIntegerSet = new PositiveIntegerSet();

        for (int i = 0; i < interi.size(); i++) {
            differnceOfIntegerSet.deleteElement(i);
        }

        return differnceOfIntegerSet;
    }

    public void insertElement(int k){
        interi.add(k);
    }

    public void deleteElement(int k){
        for (int i = 0; i < interi.size(); i++) {
            if (interi.get(i)==k) {
                interi.remove(k);
            }
        }
    }

    public boolean containsElement(int k){
        boolean isContained=false;
        for (int i = 0; i < interi.size(); i++) {
            if(k==interi.get(i)) {
                isContained = true;
            }else{
                isContained=false;
            }
        }
        return isContained;
    }

    public int size(){
        return interi.size();
    }

    public void stampa(){
        for(int i = 0; i<interi.size(); i++){
            System.out.print(interi.get(i)+" ");
        }
    }

    public boolean equals(){
        return false;
    }

    public int compareTo(){
        return 0;
    }   


}
