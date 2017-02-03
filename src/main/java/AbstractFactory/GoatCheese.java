package AbstractFactory;

/**
 * Created by thuang on 2/3/17.
 */
public class GoatCheese implements Cheese {
    public GoatCheese(){
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing goat cheese...");
    }
}
