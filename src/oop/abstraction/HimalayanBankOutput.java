package oop.abstraction;

public class HimalayanBankOutput {
    public static void main(String[] args) {
        HimalayanBank himalayanBank = new HimalayanBank();

        System.out.println("Interest rate is "+himalayanBank.getRateOfInterest()); //abstract method
        himalayanBank.display();//non-abstract method

        HimalayanBank.displayBankName();//Static method
    }
}
