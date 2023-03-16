package com.example.practicheskaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView answers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        answers = (TextView)findViewById(R.id.Answers);


        Intent intent = getIntent();

        String sex = intent.getStringExtra("Sex");
        String ceiling = intent.getStringExtra("Ceiling");
        String patronymic = intent.getStringExtra("Patronymic");
        answers.setText("Ваше пол: " + sex + "\nВаш потолок: " + ceiling+ "\nВаше отчество: " + patronymic);
    }
}