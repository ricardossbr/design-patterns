package creational.builder.impl;

import creational.builder.AbstractMeal;

import java.math.BigDecimal;

public class Rice extends AbstractMeal {


    public Rice(String kindRice, BigDecimal price, Integer quantity) {
        super(kindRice, price, quantity);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
