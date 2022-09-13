package by.incubator.task2;

import by.incubator.Main;

import java.net.*;
import java.net.MalformedURLException;
import java.net.URL;

public class NewClass {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        String filePath = "file:///D: // javaprog // fortask2 // out // example.jar";
        URL url = new URL(filePath);
        URLClassLoader myClassLoader = new URLClassLoader(new URL[]{url});
        Class myClass = myClassLoader.loadClass("by.incubator.Main");

        try {
            Main instance = (Main) myClass.newInstance();

            instance.main(new String[]{});
        } catch (InstantiationException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}