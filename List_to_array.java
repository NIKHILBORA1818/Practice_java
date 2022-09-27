//List to array convert

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aL = new ArrayList<>();
		aL.add("nik");
		aL.add("yup");
		aL.add("John");
		System.out.println("Given arraylist is: "+aL);
		
		String[] arr = new String[aL.size()];
		aL.toArray(arr);
		
		System.out.println("\nAfter conversion the String we got is: ");
		for(String ele : arr) {
			System.out.println(ele);
		}
	}
}

/* output:
Given arraylist is: [nik, yup, John]

After conversion the String we got is: 
nik
yup
John
*/
