package pl.tlewandster.task11;

import java.sql.SQLOutput;

public class Main {
    static void main() {

        tests();

        /*TwoKeyMap<String, String, Integer> grades = new NestedTwoKeyHashMap<>();
        grades.put("Alice", "Math", 5);
        grades.put("Alice", "CS", 4);
        System.out.println(grades.get("Alice", "Math")); // 5
        System.out.println(grades.row("Alice"));*/           // {Math=5, CS=4}
    }

    private static void tests() {
        TwoKeyMap<String,String,Integer> someTwoKeyMap = new NestedTwoKeyHashMap<>();
        System.out.println(someTwoKeyMap.put("A","B",1));
        System.out.println(someTwoKeyMap.put("B","B",2));
        System.out.println(someTwoKeyMap.put("B","A",3));
        System.out.println(someTwoKeyMap);
        System.out.println(someTwoKeyMap.get("A", "B"));
        System.out.println(someTwoKeyMap.get("B", "B"));
        System.out.println(someTwoKeyMap.get("B", "A"));
        System.out.println(someTwoKeyMap.remove("A","B"));
        System.out.println(someTwoKeyMap);
        System.out.println(someTwoKeyMap.containsKeys("A", "B"));
        System.out.println(someTwoKeyMap.containsKeys("B", "B"));
        System.out.println(someTwoKeyMap.containsKeys("B", "A"));
        System.out.println(someTwoKeyMap.containsValue(5));
        System.out.println(someTwoKeyMap.containsValue(3));
        System.out.println(someTwoKeyMap.entrySet().toString());
    }
}
