package task8;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Task-8 - Question9 - Check the person is senior citizen or not
		
		int age;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter your age =");
		
		age = sc.nextInt();
		
		if (age>=60) {
			
			System.out.println("You are a senior citizen");
		}
		else {
			System.out.println("you are not a senior citizen");
			
		}

	}

}
