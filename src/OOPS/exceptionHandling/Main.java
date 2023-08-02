package OOPS.exceptionHandling;

import java.util.Optional;

public class Main {
    public static void main(String[] args) throws MyException{
        int a = 5;
        int b = 0;
        int c = divide(a,b);
        System.out.println(c);
    }

    static int divide(int a, int b) throws MyException{
        try {
            return a / b;
        } catch (RuntimeException e){
            throw new MyException("checked exception");
        }
    }
}
