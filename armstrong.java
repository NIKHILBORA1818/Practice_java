//Armstrong number
public class Main{
	public static void main(String args[]) {
		int num = 153, r = 0;
		int rem;
		int orn = num;
		while(orn!=0) {
			rem = orn % 10;
			r += Math.pow(rem, 3);
			orn /= 10;
		}
		if(r==num)
			System.out.println(num+" is an armstrong number");
		else
			System.out.println(num+" Not a armstong number");
	}
}

/* output:
153 is an armstrong number

*/
