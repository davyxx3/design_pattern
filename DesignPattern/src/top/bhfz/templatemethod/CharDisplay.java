package top.bhfz.templatemethod;

/**
 * @author Davy
 * @date 2021/11/28
 */
public class CharDisplay extends AbstractDisplay {

    private final char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
