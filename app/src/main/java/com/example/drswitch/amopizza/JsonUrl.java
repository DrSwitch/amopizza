package com.example.drswitch.amopizza;

import android.os.AsyncTask;

import com.example.drswitch.amopizza.entity.Category;
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

    public JsonUrl(MyCustomCallBack callback) {
        this.callback = callback;
    }

    @Override
    protected String doInBackground(String... strings) {
        JsonParser parser = new JsonParser();
        String jsonString="";

        try {
            //System.out.println("Стринг = " + strings[0]);
            URL url = new URL(strings[0]); // URL to Parse
            URLConnection yc = url.openConnection();

            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            String inputString = "";
            //System.out.println("Начало " + in.toString());
            while ((inputLine = in.readLine()) != null) {
                inputString += inputLine;
                //System.out.println("какая-то inputLine = " + inputLine);
            }
           // System.out.println("Конец inputString = " + inputString);
            jsonString = inputString;
            in.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    private MyCustomCallBack callback;

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        //System.out.println("s = " + s);

        if(callback!=null)
            callback.outputInfo(s);
    }

    public interface MyCustomCallBack
    {
        public void outputInfo(String jsonString);
    }
}
