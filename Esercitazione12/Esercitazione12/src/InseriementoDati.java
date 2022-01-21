import java.util.HashMap;
import java.util.Map;

public class InserimentoDati{
	Map<Integer, String> map = new HashMap<>();
	
	public void add(int priorita, String descrizione){
		map.put(priorita, descrizione);
	}
}
