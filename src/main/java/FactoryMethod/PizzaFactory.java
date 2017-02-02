package FactoryMethod;

import Common.PizzaType;

/**
 * Created by thuang on 2/2/17.
 */
public class PizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch(type)
        {
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPER:
                pizza = new PepperPizza();
                break;
            default:
                throw new IllegalArgumentException("No such pizza type.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
