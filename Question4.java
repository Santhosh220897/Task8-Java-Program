package task8;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// task8 -Question4 Swapping of two values
		
		int a ;
		int b ;
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the value of a");
	    
	    a = sc.nextInt();
	    
	    System.out.println("Enter the value of b");
	    
	    b = sc.nextInt();
	    
		
		// before swapping
		System.out.println("1.first number = "+a +" 2.Second number ="+b);
		
		int swap = a;
		a =b;
		b = swap;
		
		//After swapping
		System.out.println("1.first number = "+a +" 2.Second number ="+b);
		
		
	
	}

}
