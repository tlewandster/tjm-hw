package pl.tlewandster.task10;

import java.util.Arrays;

import static pl.tlewandster.ConsoleColors.BLUE_BOLD;
import static pl.tlewandster.ConsoleColors.RESET;

@SuppressWarnings({"JavaPrintToLogpoint", "unused"})
public class Test {
    static void main() {
        test1();
        test2();
        test3();
    }

    static void printTestHeading(String heading) {
        System.out.println("\n" + BLUE_BOLD + heading + RESET);
    }

    static void test1() {
        printTestHeading("Test 1.1");
        Pair<Integer, String> testPair1 = Pair.of(1, "a");
        Pair<Integer, String> testPair2 = Pair.of(1, "a");
        Pair<Integer, String> testPair3 = Pair.of(1, "b");
        boolean testPair1EqualsTestPair2 = testPair1.equals(testPair2);
        boolean testPair1EqualsTestPair3 = testPair1.equals(testPair3);
        boolean testPair1HashcodeToTestPair2Hashcode = testPair1.hashCode() == testPair2.hashCode();
        System.out.println("testPair1EqualsTestPair2 = " + testPair1EqualsTestPair2);
        System.out.println("testPair1EqualsTestPair3 = " + testPair1EqualsTestPair3);
        System.out.println("testPair1HashcodeToTestPair2Hashcode = " + testPair1HashcodeToTestPair2Hashcode);

        printTestHeading("Test 1.2");
        Pair<Integer, String> testPair4 = Pair.of(null, "x");
        System.out.println("testPair4.first() = " + testPair4.first());
        System.out.println(testPair4);

        printTestHeading("Test 1.3");
        Pair<String, String> testPair5 = Pair.of("A", "B");
//        testPair5.first = "B";
        System.out.println("java: first has private access in pl.tlewandster.task10.Pair");
    }

    static void test2() {
        printTestHeading("Test 2.1");
        String[] arr = {"A", "B", "C"};
        ArrayUtils.swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));

        printTestHeading("Test 2.2");
        Integer[] nums = {1, 2, 3};
        try {
            ArrayUtils.swap(nums, -1, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ArrayUtils.swap(nums, 0, 3);
        } catch (Exception e) {
            System.out.println(e);
        }

        printTestHeading("Test 2.3");
        arr = new String[] {"X", "Y"};
        ArrayUtils.swap(arr, 1, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void test3() {
        printTestHeading("Test 3.1");
        Integer[] data = {1, 2, 3, 4};
        System.out.println("data = " + Arrays.toString(data));
        Stats<Number> integerStats = new Stats<>(data);
        System.out.println("integerStats.mean() = " + integerStats.mean());
        System.out.println("integerStats.variance() = " + integerStats.variance());

        printTestHeading("Test 3.2");
        Double[] data1 = {2.0,2.0};
        Double[] data2 = {2.001,1.999};
        double eps = 0.01;
        System.out.println("data1 = " + Arrays.toString(data1));
        System.out.println("data2 = " + Arrays.toString(data2));
        System.out.println("eps = " + eps);
        Stats<Number> data1Stats = new Stats<>(data1);
        Stats<Number> data2Stats = new Stats<>(data2);
        System.out.println("data1Stats.hasSameMean(data2Stats,eps) = " + data1Stats.hasSameMean(data2Stats, eps));

        printTestHeading("Test3.3");
        Integer[] empty = {};
        Stats<Integer> emptyStats = new Stats<>(empty);



    }
}
