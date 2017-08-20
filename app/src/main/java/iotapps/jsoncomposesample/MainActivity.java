package iotapps.jsoncomposesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//main json object
        JSONObject jsonBody = new JSONObject();

        try {//first key value pair
            jsonBody.put("firstkey", "firstvalue");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {//second
            jsonBody.put("secondkey", "secondobject");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        final String mRequestBody = jsonBody.toString();

        Log.d("Sample Json",mRequestBody);


    }
}
