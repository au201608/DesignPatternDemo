package AbstractFactory;

/**
 * Created by thuang on 2/3/17.
 */
public class MozzarellaCheese implements Cheese{
    public MozzarellaCheese() {
        prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}
