package secondProgram.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstNumber, secondNumber;
		
		System.out.println("Type in the first value");
		firstNumber = scan.nextInt();
		
		System.out.println("Type in the second value");
		secondNumber = scan.nextInt();
		
		int sumResult = sum(firstNumber, secondNumber);
		int subtractionResult = subtraction(firstNumber, secondNumber);
		float divisionResult = division(firstNumber, secondNumber);
		int multiplicationResult = multiplication(firstNumber, secondNumber);
		
		System.out.println(sumResult);
		System.out.println(subtractionResult);
		System.out.println(divisionResult);
		System.out.println(multiplicationResult);
		
	}
	
	public static int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public static int subtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public static int multiplication(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public static float division(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}
}
