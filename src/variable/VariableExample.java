package variable;

public class VariableExample {
    int b = 779; //Instance variable
    static int d =559;
    public static void main(String[] args) {
        VariableExample obj = new VariableExample();
        obj.display();
        System.out.println(obj.b);
        System.out.println(VariableExample.d);
    }
    public void display(){
        int a = 5; //Local variable
        System.out.println("local variable = " + a);
        System.out.println("Instance variable = " + b);
    }
}