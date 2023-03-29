package array.arraylist;

import java.util.ArrayList;

public class StudentUseCaseImpl {

    public void studentMethod(){
        ArrayList<Student> students = new ArrayList<>();

        Student student = new Student(); // creating obj of string class
        student.setId(12);
        student.setName("Java");

        Student student1 = new Student();
        student1.setId(13);
        student1.setName("Python");

        students.add(student);
        students.add(student1);
        System.out.println(students);

    }
}
