//reveres a number
public class Main {

	public static void main(String[] args) {
		int number = 2354, r = 0;
		System.out.println("Original number is: "+number);
		while(number!=0) {
			int dig = number % 10;
			r = r * 10 + dig;
			number /= 10;
		}
		System.out.println("Reveresed number is: "+r);
	}
}				
		
/* output:
Original number is: 2354
Reveresed number is: 4532
*/
