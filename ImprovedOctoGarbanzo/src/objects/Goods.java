package objects;

public class Goods {

    protected double price;
    protected int qty;

//    protected Goods() {
//    }

    protected int getQty() {
        return qty;
    }

    protected void setQty(int qty) {
        this.qty = qty;
    }

    protected double getPrice() {
        return price;
    }
}
