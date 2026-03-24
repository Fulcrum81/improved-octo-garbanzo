package shapes;

public class Circle extends Shape implements Countable {
    private int raduis;

    public Circle(int raduis) {
        this.raduis = raduis;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raduis, 2);
    }

    @Override
    public double count() {
        return 0;
    }
}
