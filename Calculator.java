import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter no. 2 : ");
		int b = sc.nextInt();
		int res;
		
		System.out.println("\n Menu: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n Enter your choice: ");
		int ch = sc.nextInt();

		switch(ch){		
		case 1:
			res = a + b;
			System.out.println("Addition of"+a+" and "+b+" is : "+res);
			break;
		case 2:
			res = a - b;
			System.out.println("Subtraction of "+a+" and "+b+" is: "+res);
			break;
		case 3:
			res = a * b;
			System.out.println("Multiplication of "+a+" and "+b+" is: "+res);
			break;
		case 4:
			res = a / b;
			System.out.println("Division of"+a+" and "+b+" is: "+res);
			break;
		default:
			System.out.println("Invalid choice...");
			break;
		}

	}

}

/* output:
Enter no. 1 : 
20
Enter no. 2 : 
4

 Menu: 
1. Addition 
2. Subtraction 
3. Multiplication 
4. Division 
 Enter your choice: 
3
Multiplication of 20 and 4 is: 80
*/
