//Concatenate Two Arrays

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {41,12,53};
		int[] a2 = {34,25,16};
		
		int reslen = a1.length + a2.length;
		
		int[] res = new int[reslen];
		int pos = 0;
		for(int ele : a1) {
			res[pos] = ele;
			pos++;
		}
				
		for(int ele : a2) {
			res[pos] = ele;
			pos++;
		}
		
		System.out.println(Arrays.toString(res));
	}

}

/* output:
[1, 2, 3, 4, 5, 6]
*/
