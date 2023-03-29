package oop.encapsulation;

public class OutputStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(001);
        student.setName("Java.");

        System.out.println("student name = " + student.getName()+" Student id: "+student.getId());
    }
}

