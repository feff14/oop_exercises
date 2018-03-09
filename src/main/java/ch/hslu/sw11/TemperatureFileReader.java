package ch.hslu.sw11;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureFileReader {
    public static void readFile(String path){
        MeasurementHistory history = new MeasurementHistory();
        if (new File(path).exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), Charset.forName("UTF-8")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    LocalDateTime dateTime = getTimeStamp(line.split(";")[1]);
                    Float temp = Float.valueOf(line.split(";")[2]);
                    history.addMeasurement(new Measurement(Temperature.createFromCelsius(temp), dateTime));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Die höchste Temperatur wurde am" + history.min().getDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " erreicht und betrug " + history.max().getTemperature());
            System.out.println("Die tiefste Temperatur wurde am" + history.min().getDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " erreicht und betrug " + history.min().getTemperature());
            System.out.println("Die Durchschnittstemperatur beträgt " + history.averageTemperatureCelsius());
        }
    }

    private static LocalDateTime getTimeStamp(String time){
        return LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }
}