package OOPS.interfaces;

public class Brake implements Brakes{
    @Override
    public void brake() {
        System.out.println("I start as normal brake");
    }

    @Override
    public void start(String name) {
        System.out.println("I start as normal engine brake");
    }

    @Override
    public void stop() {
        System.out.println("I stop as normal engine brake");
    }

    @Override
    public void acceleration() {
        System.out.println("I acceleration as normal engine brake");

    }
}
