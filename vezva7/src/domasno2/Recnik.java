package domasno2;
import java.util.Map;
import java.util.HashMap;

public class Recnik {
	Map<String, String> recnik = new HashMap<String, String>();
	
	public void vnesiZbor()
	{
		recnik.put("Hello", "Здраво");
		recnik.put("Mother", "Мајка");
		recnik.put("One", "Еден");
		recnik.put("Two", "Два");
		recnik.put("Five", "Пет");
	}
	public void translate (String z) 
	{
		if (recnik.containsKey(z))
		{
			System.out.println(recnik.get(z));
		}
		else
			System.out.println("Seuste ne postoi takov zbor vo recnikot");
			
	}
	

}
