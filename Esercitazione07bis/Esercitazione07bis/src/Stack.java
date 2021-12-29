import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack = new ArrayList<>();

    public int getSize(){
        return stack.size();
    }

    public void push(String s){
        if(isFull())
            System.out.println("Pila piena");
        else
            stack.add(s);
        
    }

    public String pop(){
        String s="";
        for (String string : stack) {
            s = string;
        }
        stack.remove(s);
        return s;
    }

    public boolean isEmpty(){
        if (stack.size()==0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(stack.size()==100){
            return true;
        }else{
            return false;
        }
    }

    public void stampa(){
        for (String string : stack) {
            System.out.println(string + " ");
        }
    }
}