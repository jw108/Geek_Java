package HomeWork.SEMINAR_2;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class TASK_2 {
    public static void main(String[] args) throws Exception {
        String [] arrayData =  ReadLineFromFile("HomeWork/SEMINAR_2/dataForTask2.txt");
        for(int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
            saveToFile(PrintLine(arrayData[i]).toString());
        }
    }
    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line5.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
            }
        return result;
    }
    public static String [] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
            }
        br.close();
        String [] listData = new String [size];
       
        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
            }
        br1.close();
        return listData;
    
    }
    public static void saveToFile(String args) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("HomeWork/SEMINAR_2/log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        String path = "HomeWork/SEMINAR_2/output.txt";
        try (FileWriter fWriter = new FileWriter(path, true)) {
            fWriter.append(args);
            fWriter.append("\n");
            fWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        fileHandler.close();
    }
}
