package FactoryMethod;

import Common.PizzaType;

/**
 * Created by thuang on 2/2/17.
 */
public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(PizzaType type);
}
