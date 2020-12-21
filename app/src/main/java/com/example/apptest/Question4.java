package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class Question4 extends AppCompatActivity {
    TextView text2, text3;
    CheckBox checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);//ответы 1,4,6
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question4.this, FinalActivity.class);
                startActivity(intent);
                checked();
            }
        });
    }
    public void checked(){
        if(checkBox.isChecked()&& checkBox4.isChecked()&&checkBox6.isChecked()&& !checkBox3.isChecked() && !checkBox2.isChecked() && !checkBox5.isChecked()){
           FinalActivity.fin++;
        }
    }
}