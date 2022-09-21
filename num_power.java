//power of number
public class Main {

	public static void main(String[] args) {
		int number = 4, e = 3;
		long res = 1;
		while(e!=0) {
			res = res*number;
			--e;
		}
		System.out.println("Result: "+res);
	}
}

/* Output:
Result: 64
*/
