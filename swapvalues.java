package Task1;

import java.util.Scanner;

public class swapvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Print original values
        System.out.println("Before swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Swap the values using an additional variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        // Print swapped values
        System.out.println("After swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

	}

}
