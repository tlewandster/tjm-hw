package pl.tlewandster.task12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Exercise_10 {
    static void main() {
        Supplier<String> codeSupplier = ()->{
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int randomIndex = (int) (Math.random()*chars.length());
                code.append(chars.charAt(randomIndex));
            }
            return code.toString();
        };
        String[] codes = new String[10];
        for (int i = 0; i < codes.length; i++) {
            codes[i] = codeSupplier.get();
        }
        System.out.println(Arrays.toString(codes));
    }
}

