package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Question3 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton answ1, answ2, answ3, answ4;
    TextView quest;
    Button btn;
    //public int checkedRadioButtonId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        radioGroup = findViewById(R.id.radioGroup);
        answ1 = findViewById(R.id.answ1);
        answ2 = findViewById(R.id.answ2);
        answ3 = findViewById(R.id.answ3);
        answ4 = findViewById(R.id.answ4);
        quest = findViewById(R.id.quest);
        btn = findViewById(R.id.next);
        radioGroup.clearCheck();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question3.this, Question4.class);

                startActivity(intent);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                quest.setText("Выбор сделан");
                checked();
            }
        });

    }
    public void checked(){
        if(answ2.isChecked()){
            FinalActivity.fin++;
        }
    }
}