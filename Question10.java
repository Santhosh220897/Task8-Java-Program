package task8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Task8 - Question10 - Count no of digits in a integer
		
		int count = 0;
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		
		value = sc.nextInt();
		
		
		for(;value > 0; value /= 10, count++);
		
		System.out.println("count of digits :" +count);
		
		
	
	}

}
