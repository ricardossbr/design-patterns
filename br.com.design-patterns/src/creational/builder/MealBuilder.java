package creational.builder;

public interface MealBuilder<T> {
    T makeFood();
    T makeBeverage();
    T makeDesert();
}
