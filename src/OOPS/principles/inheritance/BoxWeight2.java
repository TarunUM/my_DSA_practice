package OOPS.principles.inheritance;

public class BoxWeight2 extends Box{
    int weight2;

    BoxWeight2(){
        this.weight2 = -1;
    }

    public BoxWeight2(int weight2) {
        this.weight2 = weight2;
    }

    public BoxWeight2(int sides, int weight2) {
        super(sides);
        this.weight2 = weight2;
    }

    public BoxWeight2(int l, int w, int h, int weight2) {
        super(l, w, h);
        this.weight2 = weight2;
    }

    public BoxWeight2(int l, int w, int h, int weight, int weight2) {
        super(l, w, h, weight);
        this.weight2 = weight2;
    }

    public BoxWeight2(int l, int w, int weight2) {
        super(l, w);
        this.weight2 = weight2;
    }

    public BoxWeight2(Box other, int weight2) {
        super(other);
        this.weight2 = weight2;
    }
}
