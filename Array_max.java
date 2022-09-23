//largest element in an array

public class Main{	
	public static void main(String args[]) {
		int[] arr = {2,7,4,9,8,4,1};
		int max = 0;
		for(int i: arr) {
			if(max < i) 
				max = i;
		}
		System.out.println("Largest ele. in an array is: "+max);		
}
}
/* output:
Largest ele. in an array is: 9

*/
