package interface_segregation_principle;

public class JustAPrinter implements Printer{

    @Override
    public void print(Document document) {
        //implement only print method, that is it
    }
}
