package AbstractFactoryTest;

import AbstractFactory.GourmetPizzaFactory;
import Common.PizzaType;
import FactoryMethod.BasePizzaFactory;
import FactoryMethod.Pizza;
import org.junit.Test;

/**
 In the abstract factory pattern you provide an interface to create families of related or dependent objects, but you
 do not specify the concrete classes of the objects to create. From the client point of view, it means that a client
 can create a family of related objects without knowing about the object definitions and their concrete class names.
 Abstract factory adds another level of abstraction to factory method. While factory method abstracts the way objects
 are created, abstract factory abstracts how the factories are created. The factories in turn abstracts the way objects
 are created. You will often hear the abstract factory design pattern referred to as a “factory of factories“.
 */
public class GourmetPizzaFactoryTest {
    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza(PizzaType.CHEESE);
        Pizza pepperPizza = pizzaFactory.createPizza(PizzaType.PEPPER);
    }
}

