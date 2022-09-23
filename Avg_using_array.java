//avg. using array

public class Main{	
	public static void main(String args[]) {
		double[] arr = {23.4, 54.2, 78,5, 19,5};
		double res = 0;
		
		for(double i: arr) {
			res += i;
		}
		double avg = res / arr.length;
		System.out.println("avg. of numbers is: "+avg);
		
}
}

/* output:
avg. of numbers is: 30.766666666666666

*/
