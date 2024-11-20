package creational.builder;

import java.math.BigDecimal;

public abstract class AbstractMeal implements MealComposite{
    protected final String description;
    protected final BigDecimal price;
    protected final Integer quantity;

    public AbstractMeal(String description, BigDecimal price, Integer quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract BigDecimal getPrice();
}
