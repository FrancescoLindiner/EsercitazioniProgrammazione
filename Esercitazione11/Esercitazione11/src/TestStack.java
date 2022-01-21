public class TestStack{
	public static void main(String[] args){
		Stack<String> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
	
		try{
			s1.push("Ciao");
			s1.push("Chiesa");
			s1.push("Casa");
			s1.push("Albero");
			s1.push("Televisione");
			s1.push("Stufa");
		}catch(MyStackException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Primo Stack: ");
		s1.stampa();
		
		try{
			for(int i = 0; i<10; i++){
				System.out.println(s1.pop());
			}	
		}catch(MyStackException e){
			e.printStackTrace();
		}
		
		try{
			s2.push(1);
			s2.push(2);
			s2.push(3);
			s2.push(4);
			s2.push(5);
			s2.push(6);
		}catch(MyStackException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Secondo Stack: ");
		s2.stampa();
	}
}
