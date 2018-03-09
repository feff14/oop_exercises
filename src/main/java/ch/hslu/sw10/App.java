package ch.hslu.sw10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        TemperatureHistory history = new TemperatureHistory();

        System.out.println("Bitte Temperature eingeben ('exit' zum Beenden): ");
        input = scanner.next();
        while (!input.equals("exit")) {
            try {
                float value = Float.valueOf(input);
                history.addTemperature(new Temperature(value));
            } catch (NumberFormatException ex) {
                System.out.printf("Bitte einen gültigen Wert eingeben\n");
            } finally {
                System.out.println("Bitte Temperature eingeben ('exit' zum Beenden): ");
                input = scanner.next();
            }
        }
        System.out.println("Programm beendet.");
    }

}
