//count digits in integer
public class Main {

	public static void main(String[] args) {
		int number = 2354, count = 0;
		while(number != 0) {
			number /= 10;
			++count;
		}
		System.out.println("Toral digits is: "+count);
	}
}
		
/* Output:
Total digits is: 4
*/
