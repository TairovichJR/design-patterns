package open_closed_principle;

import java.util.List;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        //Open for extension, closed for modification => open for extending new classes and implementing existing interfaces
        //but closed for modifying existing interface or final logics

        Product apple = new Product("Apple",Color.GREEN, Size.SMALL, Condition.GOOD);
        Product hulk = new Product("Hulk",Color.GREEN, Size.HUGE, Condition.OK);
        Product toyLizard = new Product("Toy Lizard",Color.GREEN, Size.SMALL, Condition.GOOD);
        Product gum = new Product("Gums",Color.GREEN, Size.SMALL, Condition.OK);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE, Condition.GOOD);
        Product house = new Product("House",Color.BLUE, Size.LARGE, Condition.VERY_GOOD);

        Product laptop = new Product("Laptop",Color.BLUE, Size.MEDIUM, Condition.VERY_BAD);
        Product tv = new Product("TV",Color.GREEN, Size.LARGE, Condition.OK);
        Product table = new Product("Table",Color.BLUE, Size.LARGE, Condition.GOOD);
        Product phone = new Product("Phone",Color.BLUE, Size.SMALL, Condition.AWESOME);

        List<Product> products = List.of(apple, tree, house, hulk, toyLizard, gum);

        ProductFilter filter = new ProductFilter();

        Stream<Product> f1 = filter.filter(products, new ColorSpecification(Color.GREEN));

        f1.forEach(System.out::println);

        System.out.println("Filter by 2 specifications");

        Stream<Product> f2 = filter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.LARGE)));
        f2.forEach(System.out::println);

        System.out.println("Filtering with multiple conditions");
        filter.filter(products, new MultipleSpecifications<>(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.LARGE),
                new ConditionSpecification(Condition.GOOD)
        )).forEach(System.out::println);


    }
}
