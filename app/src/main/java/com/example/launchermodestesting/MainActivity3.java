package com.example.launchermodestesting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button button3_1 = findViewById(R.id.button3_1);
        Button button3_2 = findViewById(R.id.button3_2);
        Button button3_3 = findViewById(R.id.button3_3);

        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "Going to ONE", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);

            }
        });
        button3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "go to two", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);

            }
        });
        button3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "staying one three", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this, MainActivity3.class);
                startActivity(intent);

            }
        });



    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(MainActivity3.this, "Staying on same page", Toast.LENGTH_SHORT).show();

    }
}