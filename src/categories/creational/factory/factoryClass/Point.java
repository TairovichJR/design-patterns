package categories.creational.factory.factoryClass;

public class Point {
    private double x, y;

    private Point(double a, double b){
        this.x = a;
        this.y = b;
    }

    public static class Factory {

        public static Point cartesianPoint(double x, double y){
            return new Point(x,y);
        }

        public static Point polarPoint(double rho, double theta){
            return new Point(rho * Math.cos(theta), rho* Math.sin(theta));
        }
    }
}
