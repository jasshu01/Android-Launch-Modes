package com.example.launchermodestesting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        standard
//        activities => 1 2 3
//        visiting order=> 1 2 3 2 1 3 2
//        back order => 2 3 1 2 3 2 1

//        single task (2 is single task)
//        activities => 1 2 3
//        visiting order => 1 2 3 1 3 1 3 2
//        backing order  => 2 1

//        single top (2 is single top)
//        activities => 1 2 3
//        visiting order => 1 2 3 2 2
//        backing order  => 2 3 2 1


//        single instance ( 2 is single instance)
//        activities => 1 2 3
//        visiting order => 1 3 1 3 2 1
//        backing order=> 1 3 1 3 1 2
//        visiting order => 1 3 2 3 2
//        backing order=> 2 3 3 1

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button button1_1 = findViewById(R.id.button1_1);
        Button button1_2 = findViewById(R.id.button1_2);
        Button button1_3 = findViewById(R.id.button1_3);

        button1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Staying on one", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Going to two", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        });
        button1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Going to three", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(MainActivity.this, "Staying on same page", Toast.LENGTH_SHORT).show();

    }
}