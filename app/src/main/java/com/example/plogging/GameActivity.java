package com.example.plogging;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    private int text = 0;
    private final String text1 = "Привет! Я ваш помощник. Слышали ли вы что-нибудь о плоггинге?";
    private final String text2 = "Это новое и актуальное направление в экологии.";
    private final String text3 = "Суть в его заключается в движении и сборе мусора!";
    private final String text4 = "Правила просты: во время пробежки просто собираем мусор.";
    private final String text5 = "Я бы предложил вам попробовать это движение в симуляции, но оно всё ещё в разработке";
    private final String text6 = "Вы можете посмотреть дополнительную информацию о плоггинге и о сортировке мусора";
    private final String text7 = "Нажмите на кнопку, чтобы продолжить";

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.game_activity);

        final Button Continue = findViewById(R.id.btn_continue);
        final Button Plogging = findViewById(R.id.btn_plogging);
        final Button Sorting = findViewById(R.id.btn_sorting_garbage);
        final ImageView Back = findViewById(R.id.btn_back);
        final ImageView Robot = findViewById(R.id.robot);
        final TextView Text = findViewById(R.id.txt_dialog);

        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (text) {
                    case 0:
                        Text.setText(text1);
                        Robot.setVisibility(ImageView.VISIBLE);
                        break;

                    case 1:
                        Text.setText(text2);
                        break;

                    case 2:
                        Text.setText(text3);
                        break;

                    case 3:
                        Text.setText(text4);
                        break;

                    case 4:
                        Text.setText(text5);
                        break;
                    case 5:
                        Text.setText(text6);
                        break;
                    case 6:
                        Text.setText(text7);
                        Continue.setText("Выйти");
                        break;
                    case 7:
                        Continue.setText("Выйти");
                        Intent intent1 = new Intent(GameActivity.this, MainActivity.class);
                        startActivity(intent1);

                        finish();
                        System.exit(0);
                }
                text += 1;

            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(GameActivity.this, MainActivity.class);
                startActivity(intent2);

                finish();
                System.exit(0);
            }
        });

        Plogging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(GameActivity.this, PloggingActivity.class);
                startActivity(intent2);

                finish();
                System.exit(0);
            }
        });

        Sorting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(GameActivity.this, SortingGarbage.class);
                startActivity(intent2);

                finish();
                System.exit(0);
            }
        });


    }
}
