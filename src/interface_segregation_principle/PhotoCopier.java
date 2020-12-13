package interface_segregation_principle;

public class PhotoCopier implements Printer, Scanner{

    @Override
    public void print(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
