package top.bhfz.adapter;

/**
 * @author Davy
 * @date 2021/11/6
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
