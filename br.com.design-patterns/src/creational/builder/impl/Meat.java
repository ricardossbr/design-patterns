package creational.builder.impl;

import creational.builder.AbstractMeal;

import java.math.BigDecimal;

public class Meat extends AbstractMeal {

    public Meat(String mealName, BigDecimal price, Integer quantity) {
        super(mealName, price, quantity);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
