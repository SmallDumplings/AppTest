package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





public class Question2 extends AppCompatActivity {
    TextView text;
    Button save2, next2;
    EditText et;
    String a = null;
    String b = "Double var=double.MAX_VALUE;";
    String c = "Double var = double.MAX_VALUE;";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        text = findViewById(R.id.text);
        save2 = findViewById(R.id.save2);
        next2 = findViewById(R.id.next2);
        et = findViewById(R.id.et);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question2.this, Question3.class);
                startActivity(intent);
                checked();

            }
        });
        save2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = et.getText().toString();
            }
        });
    }
    public void checked(){
        if(a.equals(b) || b.equals(c)){
            FinalActivity.fin++;
        }
    }


}