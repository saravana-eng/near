package com.example.near;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        Button next_button = (Button) findViewById(R.id.next_button);
        next_button.setOnClickListener(new View.OnClickListener()
        {    public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
        });
    }
}