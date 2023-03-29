package oop.inheritance.singleinheritance;

public class Animal {

    public Animal(){
        System.out.println("Calling from parent.");
    }
    public String parent = "This is parent class: ";
    public String name = "Dog ";
    public void animalColor(){
        System.out.println("RED");
    }
}
