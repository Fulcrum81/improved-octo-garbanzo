package shapes;

public class Rectangle extends Shape {

    private int sizeA;
    private int sizeB;

    public Rectangle(int a, int b) {
        sizeA = a;
        sizeB = b;
    }

    @Override
    public double getArea() {
        return sizeA * sizeB;
    }
}
