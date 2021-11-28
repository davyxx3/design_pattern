package top.bhfz.templatemethod;

/**
 * @author Davy
 * @date 2021/11/28
 */
public abstract class AbstractDisplay {

    private static final int COUNT = 5;

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < COUNT; i++) {
            print();
        }
        close();
    }
}
