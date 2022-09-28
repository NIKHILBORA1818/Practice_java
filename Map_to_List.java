//convert map to list
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "a");
		mp.put(2, "b");
		mp.put(3, "c");
		mp.put(4, "d");
		
		List<Integer> keyL = new ArrayList<>(mp.keySet());
		List<String> val = new ArrayList<>(mp.values());
		
		System.out.println("keys: "+keyL);
		System.out.println("values: "+val);

	}

}

/* output:
keys: [1, 2, 3, 4]
values: [a, b, c, d]
*/
