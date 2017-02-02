package FactoryMethodTest;

import Common.PizzaType;
import FactoryMethod.BasePizzaFactory;
import FactoryMethod.Pizza;
import FactoryMethod.PizzaFactory;
import org.junit.Test;
/**
 In Java applications, you might be often using the new operator to create an object of a class. This is often fine for
 small Java programs. But when you work on large scale enterprise class applications, the amount of code to create objects
 will gradually increase and will become scattered across the application. If class names are hard coded in such code, the
 complexities of managing the code will keep increasing as you add new classes to the application. To address such concerns,
 you can use the factory method pattern.
 In the factory method pattern, you provide an interface, which can be a Java interface or an abstract class to create
 objects. A factory method in the interface defers the object creation to one or more concrete subclasses at run time.
 The subclasses implement the factory method to select the class whose objects need to be created.
 */
public class FactoryMethodTest {
    @Test
    public void testMakePizzas() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza(PizzaType.CHEESE);
        Pizza pepperPizza = pizzaFactory.createPizza(PizzaType.PEPPER);
        //Pizza otherPizza = pizzaFactory.createPizza(PizzaType.UNKNOWN);
    }

}
