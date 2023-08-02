package OOPS.interfaces;

public class Medias implements Media{
    @Override
    public void start() {
        System.out.println("I start media as normal start");
    }

    @Override
    public void stop() {
        System.out.println("I start media as normal stop");
    }
}
