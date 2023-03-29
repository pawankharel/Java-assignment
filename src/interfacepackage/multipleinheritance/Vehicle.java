package interfacepackage.multipleinheritance;

public class Vehicle implements Bike, Cycle {

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void speed() {
        System.out.println("20 km/hr");
    }

    @Override
    public void color() {
        System.out.println("RED");
    }
}
