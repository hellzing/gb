// 1zdzCGP4d9Y0VPSRUjhZBbnvrpIzFT5R   295212

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {
    public static void main(String[] args) throws IOException {


        URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=1zdzCGP4d9Y0VPSRUjhZBbnvrpIzFT5R&metric=true");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoOutput(true);
        String requestBody = "{}";

        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(httpURLConnection.getOutputStream()))) {
            bufferedWriter.write(requestBody);
        }

        try (BufferedReader bufferedReader1 = new BufferedReader(
                new InputStreamReader(httpURLConnection.getInputStream()))) {
            String temp;
            while ((temp = bufferedReader1.readLine()) != null) {
                System.out.println(temp);
            }
        }
    }
}
