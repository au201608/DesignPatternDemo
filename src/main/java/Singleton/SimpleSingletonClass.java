package Singleton;

/**
 * Created by thuang on 2/7/17.
 */
public class SimpleSingletonClass {
    private static SimpleSingletonClass instance = null;

    private SimpleSingletonClass() {
    }

    // thread-safe: using synchronized keyword
    public static synchronized SimpleSingletonClass getInstance() {
        if (instance == null) {
            instance = new SimpleSingletonClass();
        }
        return instance;
    }
}
