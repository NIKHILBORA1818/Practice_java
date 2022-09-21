package Leap_year;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("Year is Leap.");
				}
			}
		}else {
			System.out.println("Not a leap year.");
		}
		

	}

}

/* Output:
Year is Leap.
*/
