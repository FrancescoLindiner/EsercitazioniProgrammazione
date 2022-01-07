import java.util.Map;
import java.util.HashMap;

public class MainMap2{
	public static void main(String[] args){
		Map<String, Shape> map = new HashMap<>();
		
		map.put("rettangolo1", new Rectangle("Black", true, 12.0, 14.0));
		map.put("rettangolo2", new Rectangle("Blue", false, 14.0, 15.0));
		map.put("quadrato1", new Square("Brown", true, 15.0));
		map.put("quadrato2", new Square("Yellow", false, 10.0));
		map.put("cerchio1", new Circle("Violet", true, 5.0)); 
		
		System.out.println(map.get("rettangolo1"));
		System.out.println(map.get("rettangolo2"));
		System.out.println(map.get("quadrato1"));
		System.out.println(map.get("quadrato2"));
		System.out.println(map.get("cerchio1"));
	}
}
