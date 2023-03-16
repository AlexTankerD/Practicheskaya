package com.example.practicheskaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText answer1;
    EditText answer2;
    EditText answer3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = (EditText)findViewById(R.id.Answer1);
        answer2 = (EditText)findViewById(R.id.Answer2);
        answer3 = (EditText)findViewById(R.id.Answer3);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Подтверждение вашего ответа", Snackbar.LENGTH_LONG);
                GoActivity2();
            }
        });
    }

    private void GoActivity2()
    {
        Intent intent = new Intent (this, MainActivity2.class);
        intent.putExtra("Sex", answer1.getText().toString());
        intent.putExtra("Ceiling", answer2.getText().toString());
        intent.putExtra("Patronymic", answer3.getText().toString());
        startActivity(intent);
    }
}