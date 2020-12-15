package categories.creational.factory.abstractFactory;

public interface IHotDrinkFactory {

    IHotDrink prepare(int amount);
}

class TeaFactory implements IHotDrinkFactory{

    @Override
    public IHotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour "
                        + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}

class CoffeeFactory implements IHotDrinkFactory{

    @Override
    public IHotDrink prepare(int amount)
    {
        System.out.println(
                "Grind some beans, boil water, pour "
                        + amount + " ml, add cream and sugar, enjoy!"
        );
        return new Coffee();
    }
}