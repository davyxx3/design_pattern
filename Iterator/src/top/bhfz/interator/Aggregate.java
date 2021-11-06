package top.bhfz.interator;

/**
 * @author Davy
 * @date 2021/11/6
 */
public interface Aggregate<T> {
    Iterator<T> iterator();
}
