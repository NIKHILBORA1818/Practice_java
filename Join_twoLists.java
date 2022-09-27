//Join Two Lists

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<>();
		l1.add("mik");
		
		List<String> l2 = new ArrayList<>();
		l2.add("pk");
		
		List<String> res = new ArrayList<>();
		res.addAll(l1);
		res.addAll(l2);
		
		System.out.println("List 1: "+l1);
		System.out.println("List 2: "+l2);
		System.out.println("Result: "+res);
		
	}
}

/* output:
List 1: [mik]
List 2: [pk]
Result: [mik, pk]
*/
