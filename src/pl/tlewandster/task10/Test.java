package pl.tlewandster.task10;

@SuppressWarnings({"JavaPrintToLogpoint", "unused"})
public class Test {
    static void main() {
        test1();
        test2();
    }

    static void test1() {
        System.out.println("Test 1.1");
        Pair<Integer, String> testPair1 = Pair.of(1, "a");
        Pair<Integer, String> testPair2 = Pair.of(1, "a");
        Pair<Integer, String> testPair3 = Pair.of(1, "b");
        boolean testPair1EqualsTestPair2 = testPair1.equals(testPair2);
        boolean testPair1EqualsTestPair3 = testPair1.equals(testPair3);
        boolean testPair1HashcodeToTestPair2Hashcode = testPair1.hashCode() == testPair2.hashCode();
        System.out.println("testPair1EqualsTestPair2 = " + testPair1EqualsTestPair2);
        System.out.println("testPair1EqualsTestPair3 = " + testPair1EqualsTestPair3);
        System.out.println("testPair1HashcodeToTestPair2Hashcode = " + testPair1HashcodeToTestPair2Hashcode);
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

    static void test2() {

    }
}
