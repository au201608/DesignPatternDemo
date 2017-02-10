package BuilderPattern;

/**
 * Created by thuang on 2/6/17.
 */
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
