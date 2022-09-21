//factorial

public class Main {

	public static void main(String[] args) {
		int n = 4;
		long fact = 1;
		for(int i = 1; i <= n; ++i) {
			fact *= i;
		}
		System.out.println("Factorial of "+n+" numbers is: "+fact);

	}

}

/* Output:
Factorial of 4 numbers is: 24
*/
