package pl.tlewandster.task11;

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
        someTwoKeyMap.put("A","B",1);
        System.out.println(someTwoKeyMap);
    }
}
