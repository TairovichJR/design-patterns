package categories.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for (int i = 1; i <=10; i++){
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book "  +i);
            getBooks().add(b);
        }
    }

//    //This is shallow copying only
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//
//        return super.clone();
//    }

    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for (Book b: this.getBooks()){
            bookShop.getBooks().add(b);
        }
        return bookShop;
    }
    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
