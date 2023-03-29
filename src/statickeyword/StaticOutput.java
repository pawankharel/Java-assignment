package statickeyword;


import java.util.Scanner;

public class StaticOutput {
    public static void main(String[] args) {
//        System.out.println(StaticExample.volumeOfCube(3));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length ");
        float length = sc.nextFloat();

        System.out.println("Enter breadth ");
        float breadth = sc.nextFloat();

        System.out.println("Array Of Parameter = " + StaticExample.arrayOfParameter( length,  breadth));
    }
}
