package FactoryMethod;

/**
 * Created by thuang on 2/2/17.
 */
public class PepperPizza extends Pizza {
    @Override
    public void addIngredients() {
        name = "Pepper Pizza";
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
