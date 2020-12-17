package categories.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        BookShop bookShop = new BookShop();
        bookShop.setShopName("Novelty");
        bookShop.loadData();

        BookShop bookShop1 = bookShop.clone();
        bookShop1.setShopName("A1");

        bookShop.getBooks().remove(2);

        System.out.println(bookShop);
        System.out.println(bookShop1);
    }
}
