
package Assignment3_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class TemperatureReader {

    public static void main(String[] args) {

        String fileUrl = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        double totalTemperature = 0;
        int count = 0;

        try {
            URL url = new URL(fileUrl);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String line = reader.readLine();

            String[] headings = line.replace("\uFEFF", "").split(";");

            int temperatureColumn = -1;

            for (int i = 0; i < headings.length; i++) {
                if (headings[i].contains("UlkoTalo")) {
                    temperatureColumn = i;
                    break;
                }
            }

            if (temperatureColumn == -1) {
                System.out.println("UlkoTalo column was not found.");
                reader.close();
                return;
            }

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(";");

                if (values.length > temperatureColumn) {

                    if (values[0].startsWith("01.01.2023")) {

                        String temperature = values[temperatureColumn]
                                .replace(",", ".");

                        double temp = Double.parseDouble(temperature);

                        totalTemperature += temp;
                        count++;
                    }
                }
            }

            reader.close();

            if (count > 0) {
                double average = totalTemperature / count;

                System.out.println("Number of measurements: " + count);
                System.out.println("Average temperature: " + average + " °C");
            } else {
                System.out.println("No measurements found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
