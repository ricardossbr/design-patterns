package creational.builder.impl;

import creational.builder.AbstractMeal;

import java.math.BigDecimal;

public class Beans extends AbstractMeal {

    public Beans(String dish, BigDecimal price, Integer quantity) {
        super(dish, price, quantity);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

}
