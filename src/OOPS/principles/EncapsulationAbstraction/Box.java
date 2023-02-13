package OOPS.principles.EncapsulationAbstraction;

public class Box {

    // Data Hiding
    private int l;
    private int w;

    // It is used to set data by hiding data
    public void setL(int l) {
        this.l = l;
    }

    public void setW(int w) {
        this.w = w;
    }

    // It is used to get data by hiding data
    public int getL() {
        return l;
    }

    public int getW() {
        return w;
    }

    public Box() {
        // By default Constructor
    }
}
