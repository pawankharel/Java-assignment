package oop.inheritance.singleinheritance;

public class Cat extends Animal{
    public Cat(){
        super();
    }
    public String child = "This is child class: ";
    public String name = "cat ";

    public void displaySuper(){
        System.out.println(name); //child class name
        System.out.println(super.name); //parent class instance variable
        super.animalColor(); //calls parent class method
    }

}
