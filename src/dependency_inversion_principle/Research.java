package dependency_inversion_principle;

import org.javatuples.Triplet;

import java.util.List;

public class Research {
    public Research(Relationships relationships)
    {
        // high-level: find all of john's children
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getValue0().getName().equals("John")
                        && x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called " + ch.getValue2().getName()));
    }

    public Research(RelationshipBrowser browser)
    {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.getName());
    }
}
