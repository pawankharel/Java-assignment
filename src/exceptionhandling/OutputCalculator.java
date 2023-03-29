package exceptionhandling;

public class OutputCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
//        calculator.calculate();
        try{
            calculator.displayAge(10);
        }catch(ArithmeticException e){
            System.out.println("Age is less than 20");
        }
    }
}
