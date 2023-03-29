package controlstatement.jumpStatement;

import java.util.Scanner;

public class JumpExample {

    public void displayBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
//                continue;
            }
            System.out.println(i);
        }
    }
}
