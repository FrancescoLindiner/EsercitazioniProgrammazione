import java.util.ArrayList;
import java.util.List;

public class Stack<T>{
	private List<T> stack;
	
	public Stack(){
		stack = new ArrayList<>();
	}
	
	public void push(T o) throws MyStackException{
		if(!isFull()){
			stack.add(o);
		}else{
			throw new MyStackException("Stack Pieno");
		}
	}
	
	public T pop() throws MyStackException{
		if(!isEmpty()){
			return stack.remove(stack.size()-1);
		}else{
			throw new MyStackException("Stack vuoto");
		}
	}
	
	public boolean isFull(){
		if(stack.size()==5) return true;
		return false;
	}
	
	public boolean isEmpty(){
		if(stack.size()==0) return true;
		return false;
	}
	
	public void stampa(){
		System.out.println(stack);
	}
}
