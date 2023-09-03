package com.example.near;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SeekBar simpleSeekBar= (SeekBar) findViewById(R.id.seekBar);
        TextView distance_view = (TextView) findViewById(R.id.km_view);
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                distance_view.setText(String.valueOf(i)+"Km");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Button next_button = (Button) findViewById(R.id.button);
        next_button.setOnClickListener(new View.OnClickListener()
        {    public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
        });
    }
}