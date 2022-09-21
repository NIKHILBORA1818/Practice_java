//fibonacci

public class Main {

	public static void main(String[] args) {
		int ft = 0, st = 1;
		int nt = 0;
		int n = 10 , i = 1;
		System.out.println("Fibonacci series of "+n+" numbers is");

		while(i <= n) {
			System.out.print(ft +", ");
			nt = ft + st;
			ft = st;
			st = nt;
			i++;
			
		}
		System.out.println("\nFibonacci series of "+n+" numbers is: "+nt);
	}

}

/* Output:
Fibonacci series of 10 numbers is
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
Fibonacci series of 10 numbers is: 89
*/
