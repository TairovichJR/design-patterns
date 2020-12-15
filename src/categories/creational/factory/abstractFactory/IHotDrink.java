package categories.creational.factory.abstractFactory;

public interface IHotDrink {

    void consume();
}

class Tea implements IHotDrink{

    @Override
    public void consume() {
        System.out.println("This tea is nice but I'd prefer it with milk.");
    }
}
class Coffee implements IHotDrink{

    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}
