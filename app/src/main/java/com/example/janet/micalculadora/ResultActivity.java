package com.example.janet.micalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        final TextView textView = (TextView) findViewById(R.id.textResult);
        final Button buttonEmpezar = (Button) findViewById(R.id.buttonEmpezar);
        final Button buttonSalir = (Button) findViewById(R.id.buttonSalir);

        Integer suma = getIntent().getIntExtra("suma",0);
        textView.setText(suma.toString());

        findViewById(R.id.buttonEmpezar).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent maintActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(maintActivity);
            }
        });
    }
}
