package Task1;

import java.util.Scanner;

public class numberprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int num = 29;
	    boolean flag = false;
	    
	    
	    
	   Scanner scanner = new Scanner(System.in);

	        // Get two numbers from the user
	        System.out.println( "Enter the  number: ");
	        int Number = scanner.nextInt();

	  // Print original values
	        System.out.println("Enter number: " + Number);
	    // 0 and 1 are not prime numbers
	    if (Number == 0 || Number == 1) {
	        flag = true;
	    }

	    for (int i = 2; i <= Number / 2; ++i) {

	      // condition for nonprime number
	      if (Number % i == 0) {
	        flag = true;
	        break;

	}

	   }
	    if (!flag)
	        System.out.println(Number + " is a prime number.");
	      else
	        System.out.println(Number + " is not a prime number.");

	    }
	}
