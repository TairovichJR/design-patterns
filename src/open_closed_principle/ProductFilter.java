package open_closed_principle;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }


    //Bad Implementation, because for every new filter, we are creating a new method
//    public Stream<Product> filterByColor(List<Product> products, Color color){
//        return products.stream().filter(p -> p.getColor() == color);
//    }
//
//    public Stream<Product> filterBySize(List<Product> products, Size size){
//        return products.stream().filter(p -> p.getSize() == size);
//    }
//
//    public Stream<Product> filterByColorAndSize(List<Product> products, Size size, Color color){
//        return products.stream().filter(p -> p.getSize() == size && p.getColor() == color);
//    }

}
