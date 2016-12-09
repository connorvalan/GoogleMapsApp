package com.example.connor.googlemapsapp;

/**
 * Created by Connor on 12/9/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;


public class SecondActivity extends Activity {
    int result=0;
    RadioGroup radGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        radGroup=(RadioGroup) findViewById(R.id.radioGroup);
        Intent i = getIntent();
        RadioListener radio = new RadioListener();
        radGroup.setOnCheckedChangeListener(radio);
    }

    public void goBack(View view){
        setResult(result);
        finish();
    }

    private class RadioListener implements RadioGroup.OnCheckedChangeListener{
        public void onCheckedChanged(RadioGroup g, int button){
            if (button == R.id.crewButton) result=0;
            else if(button == R.id.shuttleButton) result=1;
            else result=0;
        }
    }
}
