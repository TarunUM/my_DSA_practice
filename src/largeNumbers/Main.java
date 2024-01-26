package largeNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BD();
        //Get Java Version
//        System.out.println(System.getProperty("java.version"));
    }

    static void BI(){
        BigDecimal a = BigDecimal.valueOf((Long.MAX_VALUE));
        BigDecimal b = BigDecimal.valueOf(Long.MIN_VALUE);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.compareTo(b));
        System.out.println(a.add(b));
        System.out.println(a.multiply(b.negate()));
        System.out.println(a.pow(100));
        BigInteger ans = BigInteger.ONE;
        for (int i = 2; i < 100; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        System.out.println(ans);
    }

    static void BD(){
        Double x = 0.03, y = 0.04;
        System.out.println(y-x);
        System.out.println(0.04 - 0.03);


        BigDecimal a = BigDecimal.valueOf((Float.MAX_VALUE));
        BigDecimal b = BigDecimal.valueOf(Float.MIN_VALUE);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println("a is greater if returned value is 1 " +a.compareTo(b));
        System.out.println("Compare to " +a.compareTo(a.add(BigDecimal.ONE)));
        System.out.println(a.multiply(b.negate()));
        System.out.println(a.pow(100));
        BigInteger ans = BigInteger.ONE;
        for (int i = 2; i < 100; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
    }
}
