package task8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Task 8 - Question 2 Find even number or odd number
		
		int a ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please the Enter the value of a");
		
		a= sc.nextInt();
		
		
		if (a% 2 == 0) {
			
			System.out.println("number is even number");
			
		}
		else {
			System.out.println("Numnber is odd number");
		}

	}

}
