package open_closed_principle;

public class ConditionSpecification implements Specification<Product>{

    private Condition condition;

    public ConditionSpecification(Condition condition) {
        this.condition = condition;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getCondition() == condition;
    }
}
