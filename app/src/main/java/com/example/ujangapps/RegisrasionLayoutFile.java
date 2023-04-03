package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RegisrasionLayoutFile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisrasion_layout_file);
    }

    public void pencet(View v) {
        String label = ((Button)v).getText().toString();
        Log.i("Status", label + "Telah ditekan");
    }

    public void tonjok(View v) {
        String label = ((Button)v).getText().toString();
        Log.i("Status", label + "Telah ditekan");
    }
}