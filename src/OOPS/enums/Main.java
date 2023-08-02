package OOPS.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Week.Monday);
    }

    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for : " + this);
        }
    }
}
