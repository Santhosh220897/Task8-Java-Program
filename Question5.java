package task8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Task 8 - Question 5 - check the prime number

		int num ;
		
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please the enter the num =");
		
		num = sc.nextInt();
		
		for (int i = 2; i <= num / 2; ++i) {
			
            if (num % i == 0) {
            	
                isPrime = false;
                
                break;
            }
        }
		 if (isPrime)
			 
	            System.out.println(num + " is a prime number.");
	        else
	        	
	            System.out.println(num + " is not a prime number.");
	}

}
