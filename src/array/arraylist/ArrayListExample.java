package array.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public void displayCourses(){
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Before adding to the list: "+arrayList);
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("C#");
        System.out.println("After adding to the list: "+arrayList);
        System.out.println( arrayList.get(1));

        for (String st:arrayList) {
            System.out.println("After iterating through loop "+st);

        }
        System.out.println(arrayList.contains("C"));
        arrayList.remove("C");
        System.out.println("After removing from arraylist "+arrayList);
        arrayList.set(1, "Spring");
        System.out.println("After updating from arraylist "+arrayList);

        Collections.sort(arrayList);
        System.out.println("After sorting in Ascending order "+arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("After sorting in decending order "+arrayList);

        System.out.println("Size of the list "+arrayList.size());

    }
}
