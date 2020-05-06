import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreatorTest {

    private ConcreteCreator cf;

    @BeforeEach
    void setUp() throws Exception {
        cf = new ConcreteCreator();
        cf.doSomething();
    }

    @Test
    void test() {
        Product p1 = cf.factoryMethod("con1");
        p1.setX(1);
        p1.setY(2);
        p1.setZ(3);
        Assert.assertTrue("X=1", 1==p1.getX());
        Assert.assertTrue("Y=2", 2==p1.getY());
        Assert.assertTrue("Z=3", 3==p1.getZ());
        System.out.println(p1.toString());
        Product p2 = cf.factoryMethod("con2");
        p2.setX(4);
        p2.setY(5);
        p2.setZ(6);
        Assert.assertTrue("X=4", 4==p2.getX());
        Assert.assertTrue("Y=5", 5==p2.getY());
        Assert.assertTrue("Z=6", 6==p2.getZ());
        System.out.println(p2.toString());

        try {
        Product p3 = cf.factoryMethod("con3");
        Assert.assertTrue("Shouldn't get here",false);
        } catch (IllegalArgumentException e) {
            Assert.assertTrue("con3","con3".equals(e.getMessage()));
        }

        
    }

}
