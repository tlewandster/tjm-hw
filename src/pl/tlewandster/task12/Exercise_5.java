package pl.tlewandster.task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Exercise_5 {
    static void main() {
        UnaryOperator<List<Integer>> removeNegatives = integers -> {
            integers.removeIf(integer -> integer < 0);
            return integers;
        };
        BinaryOperator<Integer> maxOp = Integer::compareTo;

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -1, 7, -5, 10, 0));

        removeNegatives.apply(nums);
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            max = maxOp.apply(max, nums.get(i)) > 0 ? max : nums.get(i);
        }
        System.out.println(max);
    }
}

