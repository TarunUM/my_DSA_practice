package OOPS.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engines(), new Brake(), new Medias());
        car.getEngines().start("Car");
        System.out.println();
        car.getBrakes().start("Car");
    }
}
