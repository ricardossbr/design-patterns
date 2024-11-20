package creational.builder;

import creational.builder.impl.*;

import java.math.BigDecimal;
import java.util.Arrays;

public class CompositeTest {

    public static void main(String[] args) {

        /* Without Builder
        final var rice = new Rice("arroz biro biro", new BigDecimal("10.50"), 100);
        final var bean = new Beans("Feijao de corda", new BigDecimal("7.50"), 100);
        final var desert = new Desert("Pudim", new BigDecimal("17.50"), 100);
        final var drink = new Desert("Suco Laranja", new BigDecimal("10.50"), 300);

        final var mealBox = new MealBox();
        mealBox.addMeal(Arrays.asList(rice, bean, desert, drink));
        final BigDecimal price = mealBox.getPrice();
        System.out.println(price);
        */

        /*
        * With Builder
        */


        final MealBox box = new MealBuilderImpl()
                                .makeFood()
                                .makeBeverage()
                                .makeDesert()
                                .builder();

        final BigDecimal price = box.getPrice();
        System.out.println(price);


    }
}
