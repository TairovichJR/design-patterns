package open_closed_principle;

public class Product {
    private String name;
    private Color color;
    private Size size;
    private Condition condition;

    public Product(String name, Color color, Size size, Condition condition) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
