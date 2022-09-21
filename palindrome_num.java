//palindrome number
public class Main{
	public static void main(String args[]) {
		int num = 232, r = 0, rem;
		int n1 = num;
		while(num!=0) {
			rem = num % 10;
			r = r * 10 + rem;
			num /= 10;
		}
		if(n1 == r) {
			System.out.println("Both numbers are palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
}

/* output:
Both numbers are palindrome

*/
