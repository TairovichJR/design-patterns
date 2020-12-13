package open_closed_principle;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
