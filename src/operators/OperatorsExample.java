package operators;

import java.util.Scanner;

public class OperatorsExample {

    public void arithmeticOperatorSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        System.out.println("Sum is : " + (a + b));
    }

    public void arithmeticOperatorMultiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        System.out.println("Multiplication is : " + (a * b));
    }

    public void displayName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("Pawan")) {
            System.out.println("Your Name is : " + name);
        } else {
            System.out.println("Invalid Name");
        }


    }

}
