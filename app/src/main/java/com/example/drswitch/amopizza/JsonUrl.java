package com.example.drswitch.amopizza;

import android.os.AsyncTask;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by DrSwitch on 02.02.2018.
 */

public class JsonUrl extends AsyncTask<String, String, String> {

    @Override
    protected String doInBackground(String... strings) {
        JsonParser parser = new JsonParser();
        String jsonString="";

        try {
            URL oracle = new URL(strings[0]); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            in.readLine();
            System.out.println("Начало" + in.readLine());
            while ((inputLine = in.readLine()) != null) {
                JsonArray a = (JsonArray) parser.parse(inputLine);
                System.out.println("какая-то inputLine = " + inputLine);

                // Loop through each item
                for (Object o : a) {
                    JSONObject datos = (JSONObject)o;
                    System.out.println("какая-то датос"+datos);
                }
            }
            System.out.println("Конец");
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

}
