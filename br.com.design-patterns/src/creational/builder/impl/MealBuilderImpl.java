package creational.builder.impl;

import creational.builder.MealBuilder;

import java.math.BigDecimal;
import java.util.Arrays;

public class MealBuilderImpl implements MealBuilder<MealBuilderImpl> {

    private MealBox box = new MealBox();

    @Override
    public MealBuilderImpl makeFood() {
        final var rice = new Rice("arroz biro biro", new BigDecimal("10.50"), 100);
        final var bean = new Beans("Feijao de corda", new BigDecimal("7.50"), 100);
        box.addMeal(Arrays.asList(rice, bean));
        return this;
    }

    @Override
    public MealBuilderImpl makeBeverage() {
        final var drink = new Drink("Suco Laranja", new BigDecimal("10.50"), 300);
        box.addMeal(drink);
        return this;
    }

    @Override
    public MealBuilderImpl makeDesert() {
        final var desert = new Desert("Pudim", new BigDecimal("17.50"), 100);
        box.addMeal(desert);
        return this;
    }

    public MealBox builder(){
        return box;
    }
}
