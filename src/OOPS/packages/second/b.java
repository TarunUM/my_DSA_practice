package OOPS.packages.second;

import static OOPS.packages.second.c.message;

public class b {
    int num = 10; //default value, if not provided
    String name;

    public b(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public b(String name) {
        this.name = name;
    }

    public void greetings(){
        System.out.println("Hello World " + this.name);
        message();
    }
}
