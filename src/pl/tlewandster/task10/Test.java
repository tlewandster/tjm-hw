package pl.tlewandster.task10;

public class Test {
    static void main() {
        test_1();
    }

    static void test_1(){
        System.out.println("Test 1.1");
        Pair<Integer, String> p1 = Pair.of(1, "a");
        Pair<Integer, String> p2 = Pair.of(1, "a");
        Pair<Integer, String> p3 = Pair.of(1, "b");
        boolean p1EqualsP2 = p1.equals(p2);
        boolean p1EqualsP3 = p1.equals(p3);
        boolean p1HashcodetoP2Hashcode = p1.hashCode() == p2.hashCode();
        System.out.println("p1EqualsP2 = " + p1EqualsP2);
        System.out.println("p1EqualsP3 = " + p1EqualsP3);
        System.out.println("p1HashcodetoP2Hashcode = " + p1HashcodetoP2Hashcode);
        System.out.println();

        System.out.println("Test 1.2");
        Pair<Integer, String> p4 = Pair.of(null, "x");
        System.out.println("p4.first() = " + p4.first());
        System.out.println(p4);
    }
}
