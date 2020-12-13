package liskov_substitution_principle;

public class Rectangle {
    protected int width;
    protected int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
}
class Square extends Rectangle{
    private int size;

    public Square() {
    }

    public Square(int size) {
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
class Demo{
   static void useIt(Rectangle rectangle){
       int width = rectangle.getWidth();
       rectangle.setHeight(10);

       System.out.println(
               "Expected area: " + (width * 10) +
                       ", got " + rectangle.getArea()
       );
   }

    public static void main(String[] args) {

       Rectangle r = new Rectangle(2,3);
       useIt(r);

       Rectangle s = new Square();
       s.setWidth(5);
       useIt(s);


    }
}