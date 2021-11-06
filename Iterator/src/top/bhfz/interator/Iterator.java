package top.bhfz.interator;

/**
 * @author Davy
 * @date 2021/11/6
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
