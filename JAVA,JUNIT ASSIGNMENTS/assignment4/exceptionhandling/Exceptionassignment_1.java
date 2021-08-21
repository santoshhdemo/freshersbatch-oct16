package exceptionhandling;

import java.util.Scanner;

public class Exceptionassignment_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Numbers for division");
		int a=sc.nextInt(), b=sc.nextInt();
		try {
			int result=a/b;
			System.out.println(" result is: "+result);

		}
		catch(ArithmeticException ae){
			System.out.println("Divisor is not zero!");
			//ae.printStackTrace();
		}
		sc.close();
	}

}
