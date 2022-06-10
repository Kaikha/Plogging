package com.example.plogging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class SortingGarbage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_garbage);

        final ScrollView Scroll = findViewById(R.id.scroll);
        final TextView textView = findViewById(R.id.text);

        textView.setMovementMethod(new ScrollingMovementMethod());

        final ImageView Back = findViewById(R.id.btn_back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SortingGarbage.this, GameActivity.class);
                startActivity(intent2);

                finish();
                System.exit(0);
            }
        });

    }
}