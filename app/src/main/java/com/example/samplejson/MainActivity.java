package com.example.samplejson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            JSONObject obj = new JSONObject();
            obj.put("valor1", "valor");
            obj.put("int1", 1);

            JSONArray arr = new JSONArray();
            String s = "teste";
            arr.put(s);

            obj.put("arr", arr);

            Log.d("teste", obj.toString());
        } catch (Exception e) {
            Log.d("exception", e.toString());
        }

    }
}