package interface_segregation_principle;

public class PhotoCopier2 implements MultiFunctionDevice{

    //Another way of implementing an interface which already extends multiple interfaces

    @Override
    public void print(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
