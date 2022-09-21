//Find LCM of two Numbers
public class Main {

	public static void main(String[] args) {
		int a = 12, b = 15,  gcd = 1;
		
		for(int i = 1; i <= a && i <= b; ++i) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}}
		int lcm = (a * b) / gcd;
		
			System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
	
	}
}
		
/* Output:
LCM of 12 and 15 is: 60
*/
