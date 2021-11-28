package top.bhfz.templatemethod;

import java.io.InputStream;

/**
 * @author Davy
 * @date 2021/11/28
 */
public class Main {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('M');
        StringDisplay stringDisplay = new StringDisplay("Hello, world!");
        charDisplay.display();
        stringDisplay.display();
    }
}
