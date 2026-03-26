package shapes;

public class Square extends Shape {

    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(size, 2);
    }

    public String sayHello() {
        return "Hello, I'm a square!";
    }
}
