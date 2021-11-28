package top.bhfz.factorymethod.idcard;

import top.bhfz.factorymethod.framework.Factory;
import top.bhfz.factorymethod.framework.Product;

/**
 * @author Davy
 * @date 2021/11/29
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = new IDCard("Davy");
        Product p2 = new IDCard("Tony");
        Product p3 = new IDCard("John");
        p1.use();
        p2.use();
        p3.use();
    }
}
