package top.bhfz.adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Davy
 * @date 2021/11/6
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName), null);
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
