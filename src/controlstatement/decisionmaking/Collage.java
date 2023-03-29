package controlstatement.decisionmaking;

import java.util.Scanner;

public class Collage {
    public void displayId() {
        int mathMarks = 50;
        int scienceMarks = 40;

        if (mathMarks > 50 && scienceMarks > 50) {
            System.out.println("A");
        } else if (mathMarks > 30 && scienceMarks > 30) {
            System.out.println("Excellent");
        } else {
            System.out.println("failed");
        }
    }

    public void switchMarks() {
        int marks = 40;
        switch (marks) {
            case 20:
                System.out.println("D");
                break;
            case 10:
                System.out.println("F");
                break;
            case 40:
                System.out.println("A");
                break;
            default:
                System.out.println("Cannot find marks.");
        }
    }

    public void assignment() {
        Scanner sc = new Scanner(System.in);

        int passMarks = 40;

        System.out.println("Enter marks scored on Math ");
        int mathMarks = sc.nextInt();
        System.out.println("Enter marks scored on Science ");
        int scienceMarks = sc.nextInt();

        if (mathMarks >= passMarks && passMarks >= passMarks) {
            System.out.println("PASS :)");
        } else if (mathMarks <= 30 && scienceMarks >= 30) {
            System.out.println("About to PASS.");
        } else {
            System.out.println("FAILED");
        }

    }
}
