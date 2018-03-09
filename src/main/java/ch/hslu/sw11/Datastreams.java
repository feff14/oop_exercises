package ch.hslu.sw11;

import java.io.*;
import java.nio.charset.Charset;

public class Datastreams {
    public static void writeToFile(String file, String text) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charset.forName("UTF-8"))))) {
            pw.println(text);
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Exception");
        }
    }

    public static void readFromFile(String path) {
        if (new File(path).exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), Charset.forName("UTF-8")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        //Datastreams.writeToFile("test.txt", "Dies ist ein Test");
        //Datastreams.readFromFile("test.txt");
        TemperatureFileReader.readFile("/Users/flaviolazzarini/Documents/HSLU/OOP/oop_exercises/src/main/java/ch/hslu/sw11/files/netatmo-export-201608-201610.csv");
    }
}