package zadaca1;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer, String> maps =new HashMap<Integer, String>(); // deklariranje
		
		maps.put(1, "Zdravo");		// vmetnuvanje
		maps.put(2, "Pak zdravo");	// vmetnuvanje
		
		System.out.println(maps);	// pecatenje na kluc i vrednost
		
		System.out.println(maps.keySet());	//pecatenje na klucevi
		System.out.println(maps.keySet()); //pecatenje na vrednost
		
		//primer
		for (Map.Entry<Integer, String> entry : maps.entrySet())
		{
			System.out.println(entry.getKey() +"/" + entry.getValue());
		}
		
		Iterator iter = maps.entrySet().iterator();
		while (iter.hasNext())
		{
			Map.Entry entry = (Map.Entry) iter .next();
			System.out.println(entry.getKey() +"/" +entry.getValue());
		}
		
	}

}
