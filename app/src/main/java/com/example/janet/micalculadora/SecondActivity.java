package com.example.janet.micalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final EditText editText = (EditText) findViewById(R.id.editTextNum);
        final int firstNumber = getIntent().getIntExtra("firstNumber",0);
        Log.d("SecondActivity","first number is " + firstNumber);

        findViewById(R.id.buttonSiguiente).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String message;
                try {
                    Integer suma = firstNumber + Integer.parseInt(editText.getText().toString());
                    Intent resultActivity = new Intent(getApplicationContext(), ResultActivity.class);
                    resultActivity.putExtra("suma", suma);
                    startActivity(resultActivity);
                } catch (Exception e) {
                    message = "Debes poner un numero correcto";
                    Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

