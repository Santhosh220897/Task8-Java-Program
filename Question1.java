package task8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Task8 - Question 1
		
		int a ;
		int b ;
		int c ;
		int d ;
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println(" Please the enter the value of a");
		
		a=sc.nextInt();
		
		System.out.println(" Please the enter the value of b");
		
		b=sc.nextInt();
		
		System.out.println(" Please the enter the value of c");
		
		c=sc.nextInt();
		
		System.out.println(" Please the enter the value of d");
		
		d=sc.nextInt();
		
		if ((a+b)>(c+b)) {
			
			System.out.println("Sum of a and b is greater than the sum of c and d");
		}
		else {
			System.out.println("conditons is failed");
		}

	}

}
