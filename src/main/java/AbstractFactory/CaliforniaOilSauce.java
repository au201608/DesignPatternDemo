package AbstractFactory;

/**
 * Created by thuang on 2/3/17.
 */
public class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Parparing California oil sauce...");
    }
}
