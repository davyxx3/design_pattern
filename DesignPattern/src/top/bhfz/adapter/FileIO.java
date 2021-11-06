package top.bhfz.adapter;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Davy
 * @date 2021/11/6
 */
public interface FileIO {
    void readFromFile(String fileName) throws IOException;

    void writeToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
