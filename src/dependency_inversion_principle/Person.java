package dependency_inversion_principle;

public class Person {

    private String name;
    // dob etc.

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
