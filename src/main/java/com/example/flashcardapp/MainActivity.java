package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView QuestionTextview = findViewById(R.id.Question);
        TextView AnswerTextview = findViewById(R.id.Answer);
        QuestionTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuestionTextview. setVisibility(View.INVISIBLE);
                AnswerTextview.setVisibility(View.VISIBLE);

            }
        });
    }
}