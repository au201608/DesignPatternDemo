package FactoryMethod;

/**
 * Created by thuang on 2/2/17.
 */
public class CheesePizza extends Pizza {
    @Override
    public void addIngredients() {
        name = "Cheese Pizza";
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
