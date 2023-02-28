package willPackage.calculator;

import java.util.Scanner;

public class Calculator {
  public static void main (String args[]) {
    Scanner scan = new Scanner(System.in);

    int firstNumber, secondNumber;

    System.out.println("Give me the first number ");
    firstNumber = scan.nextInt();
    System.out.println("Give me the second number ");
    secondNumber = scan.nextInt();

    int sumResult = sum(firstNumber, secondNumber);
    int subtractionResult = subtract(firstNumber, secondNumber);
    float divisionResult = divide(firstNumber, secondNumber);
    int multiplicationResult = multiply(firstNumber, secondNumber);

    System.out.println("The sum result is: " + sumResult);
    System.out.println("The subtraction result is: " + subtractionResult);
    System.out.println("The division result is: " + divisionResult);
    System.out.println("The multiplication result is: " + multiplicationResult);
  }

  public static int sum(Integer first, Integer second) {
    return first + second;
  }
  public static int subtract(Integer first, Integer second) {
    return first - second;
  }
  public static float divide(Integer first, Integer second) {
    return first / second;
  }
  public static int multiply(Integer first, Integer second) {
    return first * second;
  }

}
