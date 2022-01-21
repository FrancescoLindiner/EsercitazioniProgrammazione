public class MainShape{
	public static void main(String[] args){
		Square s1 = new Square("Blue", true, 5.0);
		Square s2 = new Square("Blue", true, 5.0);
		Square s3 = new Square("Yellow", true, 2.0);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
}
