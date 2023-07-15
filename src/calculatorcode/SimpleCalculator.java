package calculatorcode;

import java.util.Scanner;

public class SimpleCalculator {

	Scanner sc = new Scanner(System.in);

	int num1;
	int num2;
	String operationRequested;
	String userChoice;

	void addTwoNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void subtractTwoNumbers() {
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void multiplyTwoNumbers() {
		int product = num1 * num2;
		System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
	}

	void divideTwoNumbers() {
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
		System.out.println("The remainder of " + num1 + " and " + num2 + " is " + remainder);
	}

	void performOperation() {
		System.out.println(".....Welcome to calc.....");
		
		System.out.println("Enter the first num");
		num1 = sc.nextInt();
		System.out.println("Enter the second num");
		num2 = sc.nextInt();
		System.out.println("Enter the opertaion you want to perform");
		operationRequested = sc.next();
		switch (operationRequested) {

		case "add":
			addTwoNumbers();
			break;

		case "subtract":
			subtractTwoNumbers();
			break;

		case "multiply":
			multiplyTwoNumbers();
			break;

		case "divide":
			if (num2 != 0) {
				divideTwoNumbers();
			} else {
				System.out.println("Division by zero is not possible");
			}
			break;

		default:
			System.out.println("Invalid Operataion Or Operation not supported");
		}
	}

	void continuity() {
		System.out.println("do you want to continue? Press Y for yes or N for no");
		userChoice = sc.next();
		while (userChoice.equals("Y")) {

			performOperation();
			System.out.println("do you want to continue? Press Y for yes or N for no");
			userChoice = sc.next();
			
		}
			System.out.println("Thanks for working with calc");
		}

	}

