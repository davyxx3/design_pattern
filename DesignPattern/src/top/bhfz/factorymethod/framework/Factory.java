package top.bhfz.factorymethod.framework;

/**
 * @author Davy
 * @date 2021/11/29
 */
public abstract class Factory {
    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
