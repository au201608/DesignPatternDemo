package AbstractFactory;

import FactoryMethod.Pizza;

/**
 * Created by thuang on 2/3/17.
 */
public class PepperoniPizza extends Pizza {
    BaseToppingFactory toppingFactory;
    public PepperoniPizza(BaseToppingFactory aToppingFactory) {
        this.toppingFactory = aToppingFactory;
    }

    @Override
    public void addIngredients() {
        name = "Pepper Pizza";
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
