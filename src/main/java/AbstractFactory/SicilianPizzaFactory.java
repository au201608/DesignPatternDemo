package AbstractFactory;

import Common.PizzaType;
import FactoryMethod.BasePizzaFactory;
import FactoryMethod.Pizza;

/**
 * Created by thuang on 2/3/17.
 */
public class SicilianPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new SicilianToppingFactory();
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(toppingFactory);
                break;
            case PEPPER:
                pizza = new PepperoniPizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
