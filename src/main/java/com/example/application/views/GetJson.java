package com.example.application.views;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetJson {
    String url = "http://5.134.218.202:7374/api/1/getallinfo";
    private String result;

    public String getJson() {

        HttpURLConnection connection = null;
        try {
            // Основная логика
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            connection.connect();


            StringBuilder s = new StringBuilder();

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    s.append(line);
                }

                //System.out.print(s.toString());
               result = s.toString();
            } else {

                System.out.print("Fail " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }

        } catch (Throwable cause) {
            cause.printStackTrace();

            if (connection != null) {
                connection.disconnect();
            }
        }
        return result;
    }
}
