package com.example.plogging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String selectedBtn = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button Start = findViewById(R.id.start_button);
        final Button Quit = findViewById(R.id.quit_button);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedBtn = "start";
                Start.setBackgroundResource(R.drawable.btn_selected_color);
                Quit.setBackgroundResource(R.drawable.btn_color);
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });

        Quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedBtn = "quit";
                Quit.setBackgroundResource(R.drawable.btn_selected_color);
                Start.setBackgroundResource(R.drawable.btn_color);
                finish();
                System.exit(0);
            }
        });

    }
}