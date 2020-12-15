package categories.creational.factory.challenge;

public class PersonFactory {

    private int id = 0;
    public Person createPerson(String name)
    {
        return new Person(id++, name);
    }
}

class Demo{
    public static void main(String[] args) {


        PersonFactory personFactory = new PersonFactory();

        Person jack = personFactory.createPerson("Jack");
        Person helen = personFactory.createPerson("Helen");
        Person omon = personFactory.createPerson("Omon");

        System.out.println(jack);
        System.out.println(helen);
        System.out.println(omon);

    }
}