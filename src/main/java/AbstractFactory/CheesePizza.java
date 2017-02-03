package AbstractFactory;

import FactoryMethod.Pizza;

/**
 * Created by thuang on 2/3/17.
 */
public class CheesePizza extends Pizza {
    BaseToppingFactory toppingFactory;
    public CheesePizza(BaseToppingFactory aToppingFactory) {
        this.toppingFactory = aToppingFactory;
    }
    @Override
    public void addIngredients() {
        name = "Cheese Pizza";
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
