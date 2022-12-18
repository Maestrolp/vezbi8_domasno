package domasno1;
import java.util.Map;
import java.util.HashMap;

public class Recnik {

	public static void main(String[] args) {
		Map<String, String> recnik = new HashMap<String, String>();
		
		recnik.put("Hello","Здраво");
		recnik.put("Mother", "Мајка");
		recnik.put("One", "Еден");
		recnik.put("Two", "Два");
		recnik.put("Five", "Пет");
		
		System.out.println(recnik.keySet());
		System.out.println(recnik.values());
		System.out.println(recnik);
		
		if (recnik.containsKey("hi"))
			System.out.println("Prevodot za hi e:" + recnik.get("hi"));
		else
			System.out.println("Prevod za takov zborot ne postoi");

	}

}
