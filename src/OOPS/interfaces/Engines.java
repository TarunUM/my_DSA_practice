package OOPS.interfaces;

public class Engines implements Engine{
    @Override
    public void start(String name) {
        System.out.printf("I start %s engine", name);
    }

    @Override
    public void stop() {
        System.out.println("I start as normal stop");
    }

    @Override
    public void acceleration() {
        System.out.println("I start as normal accelerate");
    }
}
