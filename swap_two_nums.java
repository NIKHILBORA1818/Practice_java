//Swap Two Numbers

public class Main {

	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 45;
		System.out.println("Before swap: ");
		System.out.println("First number is: "+num1);
		System.out.println("Second number is: "+num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("\nAfter swap: ");
		System.out.println("First number is: "+num1);
		System.out.println("Second number is: "+num2);

	}

}

/* Output:
Before swap: 
First number is: 23
Second number is: 45

After swap: 
First number is: 45
Second number is: 23
/*
