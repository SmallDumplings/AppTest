package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
    static int fin = 0;
    Button result;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        text = findViewById(R.id.text);
        result = findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              setText();
            }
        });
    }
    public void setText(){
        switch(fin) {
            case 1:
                text.setText("Не, ну хоть что-то 1/3");
                break;
            case 2:
                text.setText("Хорошая работа, Олег, 2/3");
                break;
            case 3:
                text.setText("Oмайгадб, да вы крейзи, вы прошли тест на 3/3");
                break;
            case 0:
                text.setText("Ну да, ну да... 0/3");
                break;
            default:
                text.setText("Вы не доконца прошли тест");
                break;


        }
    }
}