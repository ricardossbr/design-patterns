package creational.builder.impl;

import creational.builder.AbstractMeal;

import java.math.BigDecimal;

public class Drink extends AbstractMeal {

    public Drink(String kindDrink, BigDecimal price, Integer quantity) {
        super(kindDrink, price, quantity);
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
