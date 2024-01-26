package StringBuffer;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        sb1.append(" World");
        System.out.println("sb1.  replace".replaceAll(" ", ""));

        StringBuffer sb2 = new StringBuffer(30);

        Random random = new Random();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
        StringBuffer sb3 = new StringBuffer();
        Arrays.stream(a).forEach((el) -> {
            sb3.append((char)(65+random.nextFloat()*26));
        });
        System.out.println(sb3);
        System.out.println(sb3.length());

//        double d = 6.623456789;
        var d = new StringBuffer("- 6.623456789");
        System.out.printf("%B%n", d);
    }
}
