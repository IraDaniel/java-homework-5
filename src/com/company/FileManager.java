package com.company;

import java.io.*;
import java.util.List;

/**
 * Created by Ira on 14.01.2016.
 */
public class FileManager {

    public File[] getAllFilesDirectories(){
        String dirPath = "/";
        File f = new File(dirPath);
        File[] files = f.listFiles(); // SecurityException

        return files;
    }

    public boolean readFile(String fileName){
        File file = new File(fileName);
        if(file.exists() && file.canRead()){
            try(FileReader fileReader = new FileReader(file)){
                char[] buffer = new char[(int)file.length()];
                fileReader.read(buffer);
                System.out.println(new String(buffer));
                return true;
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }


        }
        System.out.println("file not found");
        return false;
    }
    public void showFile(File file){

    }

    public void showAllDirectories(){
        String dirPath = "/";
        File f = new File(dirPath);
        File[] files = f.listFiles();
        for(int i = 0; i < files.length; i++){
            if(files[i].isDirectory()){
                System.out.println(files[i]);
            }

        }

    }

    public void showFilesInCurrentDirectory(){
        String dirPath = ".";
        File f = new File(dirPath);
        File[] files = f.listFiles();
        for(int i = 0; i < files.length; i++){
            if(files[i].isFile()){
                System.out.println(files[i]);
            }

        }
    }

    /**
     * Дозапись информацию в конец файла, если файл не найден, то создать и записать
     * @param fileName имя файла
     * @param info информация, которую хотим добавить
     */
    public void appendToFile(String fileName, String info){
        try(FileWriter writer = new FileWriter(fileName, true))
        {
            writer.write(info);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    public void deleteFile(String fileName){
        File file = new File(fileName);
        file.delete();

    }


}
