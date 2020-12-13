package open_closed_principle;

public class MultipleSpecifications<T> implements Specification<T> {

    private Specification<T>[] specs;

    public MultipleSpecifications(Specification<T> ... specs) {
        this.specs = specs;
    }

    @Override
    public boolean isSatisfied(T item) {
        for (Specification<T> spec : specs){
            if (!spec.isSatisfied(item)) return false;
        }
        return true;
    }
}
