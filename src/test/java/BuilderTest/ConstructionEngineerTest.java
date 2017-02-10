package BuilderTest;

import BuilderPattern.*;
import org.junit.Test;

/**
 The builder pattern allows you to enforce a step-by-step process to construct a complex object as a finished product.
 In this pattern, the step-by-step construction process remains same but the finished products can have different
 representations. In the context of the house building example, the step-by-step process includes the steps to create
 the foundation, structure, and roof followed by the steps to paint and furnish a house and these steps remain the same
 irrespective of the type of house to build. The finished product, which is a house, can have different representations.
 That is, it can be a concrete house, a prefabricated house, or a tree house.
 If you are familiar with the abstract factory pattern, you might have observed that both the abstract factory and builder
 patterns are similar, as both can be used to abstract object creation. But there are distinct differences between the two.
 While abstract factory emphasizes on creating a family of related objects in one go, builder is about creating an object
 through a step-by-step construction process and returning the object as the final step. In short abstract factory is
 concerned with what is made, while the builder with how it is made.
 */
public class ConstructionEngineerTest {
    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA);

        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }
}
