package array.hashset;

import java.util.HashSet;

public class HashSetEx {

    public void hashSetDisplay(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("spring");
        hashSet.add("java");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("After adding in hashset"+hashSet);

        hashSet.remove("Java");
        hashSet.add("C++");
    }

}
