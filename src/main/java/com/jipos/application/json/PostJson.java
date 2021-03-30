package com.jipos.application.json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostJson {

    public  String post(String url, String content) {
        String result = "";
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setUseCaches(false);
            connection.setConnectTimeout(500);
            connection.setReadTimeout(500);

            String postData = content;

            OutputStream out = connection.getOutputStream();
            out.write(postData.getBytes("UTF-8"));
            out.flush();

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            if (connection.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST) {
                InputStream is = connection.getInputStream();
                int readCount;
                byte[] buffer = new byte[1024];
                while ((readCount = is.read(buffer)) > 0) {
                    bout.write(buffer, 0, readCount);
                }
                is.close();
            }
            connection.disconnect();
            result = bout.toString();
        } catch (IOException e) {
            //logger.error("{}", e.getMessage(), e);
        }
        return result;
    }
}
