//multiplication table

public class Main {

	public static void main(String[] args) {
		int num = 9, i = 1;
		int res = 1;
		while(i <= 10) {
			res = num * i;
			i++;
		}
		System.out.println("Mutiplication table of "+num+" is: "+res);
	}

}

/* Output:
Mutiplication table of 9 is: 90
*/
