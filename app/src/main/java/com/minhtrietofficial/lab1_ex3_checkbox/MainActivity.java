package com.minhtrietofficial.lab1_ex3_checkbox;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btCheck;
    private CheckBox checkbox1, checkbox2, checkbox3, checkbox4;
    private TextView textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCheck = findViewById(R.id.btCheck);
        checkbox1 = findViewById(R.id.cb1);
        checkbox2 = findViewById(R.id.cb2);
        checkbox3 = findViewById(R.id.cb3);
        checkbox4 = findViewById(R.id.cb4);
        textview3 = findViewById(R.id.tv3);

        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "The following were selected... \n";
                if (checkbox1.isChecked()) {
                    text += checkbox1.getText().toString() + ": " + true + "\n";
                } else {
                    text += checkbox1.getText().toString() + ": " + false + "\n";
                }

                if (checkbox2.isChecked()) {
                    text += checkbox2.getText().toString() + ": " + true + "\n";
                } else {
                    text += checkbox2.getText().toString() + ": " + false + "\n";
                }

                if (checkbox3.isChecked()) {
                    text += checkbox3.getText().toString() + ": " + true + "\n";
                } else {
                    text += checkbox3.getText().toString() + ": " + false + "\n";
                }

                if (checkbox4.isChecked()) {
                    text += checkbox4.getText().toString() + ": " + true + "\n";
                } else {
                    text += checkbox4.getText().toString() + ": " + false + "\n";
                }

                textview3.setText(text);
            }
        });
    }
}