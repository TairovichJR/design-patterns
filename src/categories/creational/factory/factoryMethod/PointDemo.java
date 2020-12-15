package categories.creational.factory.factoryMethod;

public class PointDemo {
    public static void main(String[] args) {

        Point p1 = Point.cartesianPoint(2, 3);

        Point p2 = Point.polarPoint(2, 3);

    }
}
