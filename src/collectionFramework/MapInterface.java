package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Ram");
        student.put(2, "Hari");
        student.put(3, "Niruta");

//        using entrySet method
        System.out.println(student.entrySet());

        //using lambda expression
        student.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });

         //using for each loop
        for (Map.Entry<Integer, String> map : student.entrySet()) {
            System.out.println(map);
        }

        //using while loop
        Iterator<Map.Entry<Integer, String>> iterator = student.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
