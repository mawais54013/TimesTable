package com.muhammadawais.timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar timesTablesSeekBar = findViewById(R.id.TimesTableSeek);
        ListView timesTablesList = findViewById(R.id.TimesTable);

        timesTablesSeekBar.setMax(20);
        timesTablesSeekBar.setProgress(10);

        
    }
}
