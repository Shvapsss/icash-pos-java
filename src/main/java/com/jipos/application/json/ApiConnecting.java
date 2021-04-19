package com.jipos.application.json;

import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

@SpringComponent
@UIScope
public class ApiConnecting {
    private String result;
    @Value("${baseUrl}")
    private String baseUrl;

    public String postJson(String url, String content) {

        try{
            HttpURLConnection connection = connection(baseUrl+url,"POST",true);

            OutputStream out = connection.getOutputStream();
            out.write(content.getBytes(StandardCharsets.UTF_8));
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
            }else {
                setResult("Fail " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            }
            connection.disconnect();
            setResult(bout.toString());

        }catch (IOException e) {
            e.printStackTrace();
            setResult(e.getMessage());
        }

        return result;
    }
    public String getJson(String url) throws IOException {
        try {
        HttpURLConnection connection = connection(baseUrl+url,"GET",false);
        StringBuilder s = new StringBuilder();
        if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                s.append(line);
            }
            in.close();
            connection.disconnect();
            setResult(s.toString());
        } else {
            setResult("Fail " + connection.getResponseCode() + ", " + connection.getResponseMessage());
            //System.out.print("Fail " + connection.getResponseCode() + ", " + connection.getResponseMessage());
        }
        } catch (IOException e) {
            e.printStackTrace();
            setResult(e.getMessage());
//            cause.getMessage();
//            cause.printStackTrace();
        }
        return result;
    }

    private HttpURLConnection connection(String url,String method,boolean doOutput) {
        HttpURLConnection connect = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod(method);
            connection.setDoOutput(doOutput);
            connection.setUseCaches(false);
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            connection.connect();
            connect = connection;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connect;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

