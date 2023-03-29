package array.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public void displayStack() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String ");
        String name = sc.nextLine();

        Stack stack = new Stack();

        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));
        }
        System.out.println(stack);

        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }
        if (name.equals(reverseString)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
    }

}
