package dependency_inversion_principle;

import java.util.List;

public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);
}
