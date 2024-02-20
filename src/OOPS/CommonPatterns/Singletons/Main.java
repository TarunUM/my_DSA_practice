package OOPS.CommonPatterns.Singletons;

public class Main {
    public static void main(String[] args) {
        PlatfromService singleton1 = PlatfromService.getSingleton1();
        System.out.println(System.getProperty("os.name"));
    }
}
