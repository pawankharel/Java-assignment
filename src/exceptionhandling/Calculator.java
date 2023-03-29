package exceptionhandling;

import java.util.Scanner;

public class Calculator {

    public void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number ");
        int secondNumber = sc.nextInt();

        try {
            System.out.println("Division of two number is " + (firstNumber / secondNumber));
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("Cannot divide by Zero = " + e);
        } finally {
            System.out.println("It is always executed.");
        }

    }

    public void displayAge(int age) throws ArithmeticException{
        if (age < 20) {
            throw new ArithmeticException("TeenAge");
        }else {
            System.out.println("Good to go...");
        }
    }
}
