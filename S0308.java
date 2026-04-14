package jumptojava;
import java.util.HashMap;
public class S0308 {
	public static void main(String[] arg) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people","사람");
		map.put("baseball", "야구");
		System.out.println(map.keySet());
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
		System.out.println(map.remove("people"));
		System.out.println(map.size());
	}
}
