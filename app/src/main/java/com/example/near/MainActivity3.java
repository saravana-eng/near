package com.example.near;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    ListView notification_list;
    String notification_content[]
            = { "Send SMS", "Turn On my AC",
            "Turn On my Heater", "Send my location via whatsapp"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        notification_list  = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity3.this,R.layout.notification, R.id.textView2,notification_content);
        notification_list.setAdapter(arrayAdapter);

        Button next_button = (Button) findViewById(R.id.StartButton);
        next_button.setOnClickListener(new View.OnClickListener()
        {    public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            finish();
        }
        });

    }
}