package creational.builder.impl;

import creational.builder.AbstractMeal;
import creational.builder.MealComposite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MealBox implements MealComposite {

    private final List<AbstractMeal> meals = new ArrayList<>();

    @Override
    public BigDecimal getPrice() {
        return this.meals.stream().map(AbstractMeal::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void addMeal(List<AbstractMeal> meals) {
        this.meals.addAll(meals);
    }

    public void addMeal(AbstractMeal meals) {
        this.meals.add(meals);
    }
}
