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
        test4();
        test5();
        test6();
        test7();
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
        arr = new String[]{"X", "Y"};
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
        Double[] data1 = {2.0, 2.0};
        Double[] data2 = {2.001, 1.999};
        double eps = 0.01;
        System.out.println("data1 = " + Arrays.toString(data1));
        System.out.println("data2 = " + Arrays.toString(data2));
        System.out.println("eps = " + eps);
        Stats<Number> data1Stats = new Stats<>(data1);
        Stats<Number> data2Stats = new Stats<>(data2);
        System.out.println("data1Stats.hasSameMean(data2Stats,eps) = " + data1Stats.hasSameMean(data2Stats, eps));

        printTestHeading("Test3.3");
        Integer[] empty = {};
        try {
            Stats<Integer> emptyStats = new Stats<>(empty);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void test4() {
        printTestHeading("Test 4.1");
        String[] exampleArr1 = {"aa", "b", "ccc"};
        System.out.println(Arrays.toString(exampleArr1));
        Pair<?, ?> result1 = MinMax.minMax(exampleArr1);
        System.out.printf("min = %s, max = %s%n", result1.first(), result1.second());

        printTestHeading("Test 4.2");
        Integer[] exampleArr2 = {5, 5, -1, 10, 10};
        System.out.println(Arrays.toString(exampleArr2));
        Pair<?, ?> result2 = MinMax.minMax(exampleArr2);
        System.out.printf("min = %s, max = %s%n", result2.first(), result2.second());

        printTestHeading("Test 4.3");
        Integer[] exampleArr3 = {42};
        System.out.println(Arrays.toString(exampleArr3));
        Pair<?, ?> result3 = MinMax.minMax(exampleArr3);
        System.out.printf("min = %s, max = %s%n", result3.first(), result3.second());

        printTestHeading("Test 4.3");
        Integer[] exampleArr4 = {1, null, 2};
        System.out.println(Arrays.toString(exampleArr4));
        Pair<?, ?> result4 = null;
        try {
            result4 = MinMax.minMax(exampleArr4);
            System.out.printf("min = %s, max = %s%n", result4.first(), result4.second());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void test5() {
        printTestHeading("Test 5.1");
        String[] example1 = {null, "a", null, "b", "a"};
        System.out.println(Arrays.toString(example1));
        System.out.println("indexOf(null) = " + ArrayUtils.indexOf(example1, null));
        System.out.println("lastIndexOf(null) = " + ArrayUtils.lastIndexOf(example1, null));
        System.out.println("indexOf('a') = " + ArrayUtils.indexOf(example1, "a"));
        System.out.println("lastIndexOf('a') = " + ArrayUtils.lastIndexOf(example1, "a"));

        printTestHeading("Test 5.2");
        String[] example2 = {"x", "y"};
        System.out.println(Arrays.toString(example2));
        System.out.println("indexOf('zzz') = " + ArrayUtils.indexOf(example2, "zzz"));
    }

    static void test6() {
        printTestHeading("Test 6.1");
        Integer[] arrA = {1, null, 3};
        Integer[] arrB = {1, null, 3};
        System.out.println("arrA = " + Arrays.toString(arrA));
        System.out.println("arrB = " + Arrays.toString(arrB));
        System.out.println("arraysEqual(arrA, arrB) = " + ArrayUtils.arraysEqual(arrA, arrB));

        printTestHeading("Test 6.2");
        Integer[] arrC = {1, 2, 3};
        System.out.println("arrA = " + Arrays.toString(arrA));
        System.out.println("arrC = " + Arrays.toString(arrC));
        System.out.println("arraysEqual(arrA, arrC) = " + ArrayUtils.arraysEqual(arrA, arrC));

        printTestHeading("Test 6.3");
        String[] arrD = {"x"};
        String[] arrE = {null};

        System.out.println("arrD = " + Arrays.toString(arrD));
        System.out.println("arrE = " + Arrays.toString(arrE));
        System.out.println("arraysEqual(arrD, arrE) = " + ArrayUtils.arraysEqual(arrD, arrE));
        System.out.println("arraysEqual(null, null) = " + ArrayUtils.arraysEqual(null, null));
    }

    static void test7() {
        printTestHeading("Test 7.1");
        Triple<String, Integer, Boolean> exampleTriple1 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> exampleTriple2 = Triple.of("id", 42, true);
        Triple<String, Integer, Boolean> exampleTriple3 = Triple.of("id", 43, true);
        System.out.println("t1 = " + exampleTriple1);
        System.out.println("t2 = " + exampleTriple2);
        System.out.println("t3 = " + exampleTriple3);
        System.out.println("t1.equals(t2) = " + exampleTriple1.equals(exampleTriple2));
        System.out.println("t1.equals(t3) = " + exampleTriple1.equals(exampleTriple3));

        printTestHeading("Test 7.2");
        System.out.println("t1.first() = " + exampleTriple1.first());
        System.out.println("t1.second() = " + exampleTriple1.second());
        System.out.println("t1.third() = " + exampleTriple1.third());

        printTestHeading("Test 7.3");
        Triple<String, String, String> exampleTriple = Triple.of("A", "B", "C");
        System.out.println("exampleTriple = " + exampleTriple);
    }
}
