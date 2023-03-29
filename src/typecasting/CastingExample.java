package typecasting;

public class CastingExample {

    public void wideningCasting(){
        int a = 5;
        System.out.println("Before casting = " + a);
        float b = a;
        System.out.println("after casting = " + b);
    }
    public void narrowingCasting(){
        float f = 5.6f;
        System.out.println("Before casting = " + f);
        int a = (int) f;
        System.out.println("after casting = " + a);
    }
}
