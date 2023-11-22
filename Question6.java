package task8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Task8 - Question6 - Print the Factorial for given number
		
		int inputNum;
		
		long factorialNum =1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input value:");
		
		inputNum = sc.nextInt();
		
		for (int i = 1; i <= inputNum; i++){
		
		factorialNum *= i;
		
		}
		
		System.out.println("Factorial Number is "+factorialNum);
		
		
		

	}

}
