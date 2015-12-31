import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;


import javax.net.ssl.HttpsURLConnection;

public class WeeklyProductScoring {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("dress");
		p1.setPrice(1250);
		p1.setQuantity(50);
		Product p2 = new Product();
		p2.setName("shoe");
		p2.setPrice(650);
		p2.setQuantity(200);
		Product p3 = new Product();
		p3.setName("bracelet");
		p3.setPrice(120);
		p3.setQuantity(120);
		Product p4 = new Product();
		p4.setName("ring");
		p4.setPrice(50);
		p4.setQuantity(500);
		Product p5 = new Product();
		p5.setName("scarf");
		p5.setPrice(75);
		p5.setQuantity(175);

		Product[] plist;
		plist = new Product[]{p1, p2, p3, p4, p5};

		int[] products;
		products = new int[]{4,3,2,6,7};

		for(int i : products) {
			System.out.println(i);
		}
		Object obj = new Object();

		for(Product r : plist) {
			System.out.println(r.getPrice());
			System.out.println(r.getQuantity());
		}

		String jsonString = "{\"stat\": { \"sdr\": \"aa:bb:cc:dd:ee:ff\", \"rcv\": \"aa:bb:cc:dd:ee:ff\", \"time\": \"UTC in millis\", \"type\": 1, \"subt\": 1, \"argv\": [{\"type\": 1, \"val\":\"stackoverflow\"}]}}";
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONObject newJSON = jsonObject.getJSONObject("stat");
        System.out.println(newJSON.toString());
        jsonObject = new JSONObject(newJSON.toString());
        System.out.println(jsonObject.getString("rcv"));
       System.out.println(jsonObject.getJSONArray("argv"));

	}

}

/*


*/