package AbstractFactory;

/**
 * Created by thuang on 2/3/17.
 */
public class TomatoSauce implements Sauce {
    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce...");
    }
}
