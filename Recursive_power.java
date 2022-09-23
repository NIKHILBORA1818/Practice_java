//power using recursion

public class Main{
	public static int power(int b , int e) {
		if(e != 0) {
			return (b * power(b, e - 1));
		}else {
			return 1;
		}
		
	}
	
	public static void main(String args[]) {
		int b = 2, e = 4;
		int res = power(b, e);
		System.out.println(b+"^"+e+" = "+res);
}}

/* output:
2^4 = 16

*/
