
public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod(String selection) {
        switch(selection) {
        case "con1":
            return (Product)new ConcreteProduct();
        case "con2":
            return (Product)new ConcreteProduct2();
        default:
            throw new IllegalArgumentException(selection);
        }
    }

}
