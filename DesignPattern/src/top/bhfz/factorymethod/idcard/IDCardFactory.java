package top.bhfz.factorymethod.idcard;

import top.bhfz.factorymethod.framework.Factory;
import top.bhfz.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Davy
 * @date 2021/11/29
 */
public class IDCardFactory extends Factory {

    private final List<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
