package com.company;

import java.io.File;
import java.nio.file.Paths;
import java.util.*;

/**
 * Home Work number 5
 * Exceptions and Errors
 */
public class Main {

    public static void main(String[] args) {


       FileManager fileManager = new FileManager();
        Properties properties = new Properties();
        System.out.println(properties.stringPropertyNames());
        fileManager.deleteFile("s.txt");
        fileManager.readFile("a.txt");
       // fileManager.deleteFile("c.txt");
       // fileManager.deleteFile("s.txt");
   //     fileManager.showAllFilesDirectories();
        //fileManager.showFilesInCurrentDirectory();









    }


}
