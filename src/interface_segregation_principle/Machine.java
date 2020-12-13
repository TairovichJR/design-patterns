package interface_segregation_principle;


public interface Machine {

    void print(Document document);
    void scan(Document document);
    void fax(Document document);
}

class OldFashionedPrinter implements Machine{

    //This is an old fashioned printer which can only print documents
    // but cannot fax or scan. So we need to segregate Machine interface its responsibilities
    //to various other interfaces, and let this OldFashionedPrinter implement only what is necessary
    @Override
    public void print(Document document) {
         // CAN PROVIDE IMPLEMENTATION
    }

    @Override
    public void scan(Document document) {
        //CANNOT PROVIDE IMPL
    }

    @Override
    public void fax(Document document) {
        //CANNOT PROVIDE IMPL
    }
}

class MultiFunctionPrinter implements Machine{

    //Just because this class is a model multi-machine printer, it can implement
    //all the abstract methods of Machine interface

    @Override
    public void print(Document document) {
        //implement here
    }

    @Override
    public void scan(Document document) {
        //implement here
    }

    @Override
    public void fax(Document document) {
        //implement here
    }
}