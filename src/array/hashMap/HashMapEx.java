package array.hashMap;

import java.util.HashMap;

public class HashMapEx {

    public void hashMapExample(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
//        hashMap.put(1, "C++");
        hashMap.put(2, "C++");

        System.out.println("After adding to hash map: "+hashMap);

        hashMap.remove(1);
        System.out.println("After removing to hash map: "+hashMap);

        hashMap.put(1, "Spring");
        System.out.println("After updating to hash map: "+hashMap);

        System.out.println(hashMap.isEmpty());//checks if hash map is empty or not



    }
}
