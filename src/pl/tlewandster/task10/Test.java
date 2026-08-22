package pl.tlewandster.task10;

public class Test {
    static void main() {
        test_1();
    }

    static void test_1(){
        System.out.println("Test 1.1");
        Pair<Integer, String> testPair1 = Pair.of(1, "a");
        Pair<Integer, String> testPair2 = Pair.of(1, "a");
        Pair<Integer, String> testPair3 = Pair.of(1, "b");
        boolean testPair1EqualstestPair2 = testPair1.equals(testPair2);
        boolean testPair1EqualstestPair3 = testPair1.equals(testPair3);
        boolean testPair1HashcodetotestPair2Hashcode = testPair1.hashCode() == testPair2.hashCode();
        System.out.println("testPair1EqualstestPair2 = " + testPair1EqualstestPair2);
        System.out.println("testPair1EqualstestPair3 = " + testPair1EqualstestPair3);
        System.out.println("testPair1HashcodetotestPair2Hashcode = " + testPair1HashcodetotestPair2Hashcode);
        System.out.println();

        System.out.println("Test 1.2");
        Pair<Integer, String> testPair4 = Pair.of(null, "x");
        System.out.println("testPair4.first() = " + testPair4.first());
        System.out.println(testPair4);
        System.out.println();

        System.out.println("Test 1.3");
        Pair<String, String> testPair5 = Pair.of("A", "B");
//        testPair5.first = "B";
        System.out.println("java: first has private access in pl.tlewandster.task10.Pair");
    }
}
