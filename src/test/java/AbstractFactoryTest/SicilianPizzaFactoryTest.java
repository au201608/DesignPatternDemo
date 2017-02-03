package AbstractFactoryTest;

import AbstractFactory.SicilianPizzaFactory;
import Common.PizzaType;
import FactoryMethod.BasePizzaFactory;
import FactoryMethod.Pizza;
import org.junit.Test;

/**
 * Created by thuang on 2/3/17.
 */
public class SicilianPizzaFactoryTest {
    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza(PizzaType.CHEESE);
        Pizza pepperPizza = pizzaFactory.createPizza(PizzaType.PEPPER);
    }
}
