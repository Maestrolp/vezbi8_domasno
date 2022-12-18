package domasno2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Glavna {

	public static void main(String[] args) {
		try
		{
			BufferedReader citac = new BufferedReader(new InputStreamReader(System.in));
			String z = citac.readLine();
			
			Recnik r = new Recnik();
			r.vnesiZbor();
			r.translate(z);
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

	}

}
