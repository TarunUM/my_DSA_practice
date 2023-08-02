package OOPS.interfaces;

public class Car {
    private Engines engines;
    private Brake brakes;
    private Medias medias;

    public Car(Engines engines, Brake brakes, Medias medias) {
        this.engines = new Engines();
        this.brakes = new Brake();
        this.medias = new Medias();
    }

    public Engines getEngines() {
        return engines;
    }

    public Brake getBrakes() {
        return brakes;
    }

    public Medias getMedias() {
        return medias;
    }
}
