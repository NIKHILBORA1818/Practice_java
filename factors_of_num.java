//factors of a number

public class Main{
	public static void main(String args[]) {
		int n = 60, i = 1;
		System.out.println("All the factors of "+n+" are: ");
		
		while(i <= n) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
			i++;
		}	
}}

/* output:
All the factors of 60 are: 
1 2 3 4 5 6 10 12 15 20 30 60 
*/
