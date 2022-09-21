package largest_number_among_3;

public class largest_number_among_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45;
		int b = 78;
		int c = 29;
		
		if(a>b && a>c) {
			System.out.println("a is biggest.");
		}else if(a<b && b>c) {
			System.out.println("b is biggest.");
		}else {
			System.out.println("c is biggest.");
		}

	}

}

/*Output
b is biggest.
*/
