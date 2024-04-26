package com.example.skyhookicks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    ImageButton casita;
    ImageButton iniciosesion;
    ImageButton register;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iniciosesion= (ImageButton) findViewById(R.id.iniciarsesion);
        iniciosesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( MainActivity2.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        register=(ImageButton) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( MainActivity2.this, MainActivity3.class);
                startActivity(i);
                finish();
            }
        });
        casita=(ImageButton) findViewById(R.id.casita);
        casita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent ( MainActivity2.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}