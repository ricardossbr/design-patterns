package creational.builder.impl;

import creational.builder.AbstractMeal;

import java.math.BigDecimal;

public class Desert extends AbstractMeal {

    public Desert(String kindDesert, BigDecimal price, Integer quantity) {
        super(kindDesert, price, quantity);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
