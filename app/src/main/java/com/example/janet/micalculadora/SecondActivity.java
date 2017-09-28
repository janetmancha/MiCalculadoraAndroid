package com.example.janet.micalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton r1 = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton r3 = (RadioButton) findViewById(R.id.radioButton3);
        final int firstNumber = getIntent().getIntExtra("firstNumber",0);
        Log.d("SecondActivity","first number is " + firstNumber);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String message;
                Integer suma = 0;

                if (r1.isChecked()) {
                    suma = firstNumber + 1;
                } else if (r2.isChecked()) {
                    suma = firstNumber + 2;
                } else if (r3.isChecked()) {
                    suma = firstNumber + 3;
                }
                if (suma > 0)
                    Toast.makeText(getApplicationContext(), suma.toString(),Toast.LENGTH_SHORT).show();
                else {
                    message = "Debes seleccionar algun numero";
                    Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}

