package AbstractFactory;

import Common.PizzaType;
import FactoryMethod.BasePizzaFactory;
import FactoryMethod.PepperPizza;
import FactoryMethod.Pizza;

/**
 * Created by thuang on 2/3/17.
 */
public class GourmetPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();
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
