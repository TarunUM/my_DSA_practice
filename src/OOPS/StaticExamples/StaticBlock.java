package OOPS.StaticExamples;

public class StaticBlock {
    static int a = 10;
    static int b;

    static{
        System.out.println("I'm in static block");
        b = a * 5;
    }
    public static void main(String[] args) {
        //all the static block execute first and run only once
        // before ever methods inside class i.e. when class is loaded.
        System.out.println(a + " " + b);

        b += 5;
        System.out.println(a + " " + b);

        StaticBlock.b += 6;
        System.out.println(a + " " + b);

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
