package top.bhfz.factorymethod.idcard;

import top.bhfz.factorymethod.framework.Product;

/**
 * @author Davy
 * @date 2021/11/29
 */
public class IDCard extends Product {

    private final String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
}
