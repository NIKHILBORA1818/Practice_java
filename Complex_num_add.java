//complex no. addition

public class Main {

	double real;
	double imag;
	
	public Main(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main n1 = new Main(2.4, 3.1),
			 n2 = new Main(4.5, 2.9),
			 temp;
		temp = add(n1, n2);
		System.out.println("Addition of given 2 complex no. is:\n "+temp.real+" "+temp.imag+"i");

}
	public static  Main add(Main n1, Main n2) {
		Main temp = new Main(0.0, 0.0);
		temp.real = n1.real + n2.real;
		temp.imag = n1.imag + n2.imag;
		
		return temp;
	}
	
}

/* output
Addition of given 2 complex no. is:
 6.9 6.0i
*/
