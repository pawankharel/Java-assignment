package array;

public class ArrayEx {

    public void displayArray() {
        //int numbers[] = new int[10];
        //numbers[0] = 5;
        int numbers[] = {1, 2, 3, 4, 5};
        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i]; //indexing ma 0 aauxa (0 index ma 1 value xa )
//        }
        for (int i : numbers) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Addition of numbers[] = " + sum);
    }

    public void displayStringArray() {
        String stringArray[] = {"KIST", "NCCS", "PADHMAKANYA"};
        System.out.println("This is index 1 value " + stringArray[1]);

//        for (String s: stringArray) {
//            System.out.println(s);
//        }

        for (String s : stringArray) {
            if (s.equalsIgnoreCase("NCCS")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    //2d array
    public void multiDimensionalArray() {
        String[][] course = {{"Java ", "C ", "C++ "}, {"C# ", "Js ", "Spring "}};
        System.out.println(course[0][0]);
        System.out.println(course[0][1]);

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print(course[i][j]);
            }
        System.out.println();
    }

}
