package top.bhfz.adapter;

import java.io.IOException;

/**
 * @author Davy
 * @date 2021/11/6
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========PrintBanner Test=========");
        Print print = new PrintBanner("Hello");
        print.printStrong();
        print.printWeek();
        System.out.println("==========FileProperties Test=========");
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
