package OOPS.principles.inheritance;

public class BoxPrice extends BoxWeight{
    int price;

    public BoxPrice() {
//        super() - called by default
        this.price = -1;
    }

    public BoxPrice(int price) {
//        super() - called by default
        this.price = price;
    }

    public BoxPrice(int sides, int weight, int price) {
        super(sides, weight);
        this.price = price;
    }

    public BoxPrice(int weight, int price) {
        super(weight);
        this.price = price;
    }

    public BoxPrice(int l, int w, int h, int weight, int price) {
        super(l, w, h, weight);
        this.price = price;
    }

    public BoxPrice(Box other, int weight, int price) {
        super(other, weight);
        this.price = price;
    }

    public BoxPrice(BoxWeight other, int price) {
        super(other);
        this.price = price;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }
}
