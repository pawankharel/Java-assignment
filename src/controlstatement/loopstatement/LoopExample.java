package controlstatement.loopstatement;

import java.util.Scanner;

public class LoopExample {

    public void displayLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello...!");
        }
    }

    public void displayForLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Name = " + name);
        }
    }

    public void displayWhileLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for multiplication ");
        int number = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + number * i);
            i++;
        }
    }

    public void displayDoWhileLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for multiplication ");
        int number = sc.nextInt();
        int i = 1;
        do {
            System.out.println(number + " * " + i + " = " + number * i);
            i++;
        } while (i <= 10);
    }


}
