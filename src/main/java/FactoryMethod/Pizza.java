package FactoryMethod;

/**
 * Created by thuang on 2/2/17.
 */
public abstract class Pizza {
    protected String name;
    public abstract void addIngredients();
    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes: " + name);
    }
}
