package categories.creational.prototype.challenge;

public class Point{

    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point other){
        this(other.x, other.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line{
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy() {
       return new Line(new Point(start), new Point(end));
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

class Demo{
    public static void main(String[] args) throws CloneNotSupportedException {
        Line line = new Line(new Point(1,2), new Point(1,2));

        Line line1 = line.deepCopy();
        line1.start.x = 10;
        line1.start.y = 10;
        line.end.y = 100;

        System.out.println(line);
        System.out.println(line1);
    }
}