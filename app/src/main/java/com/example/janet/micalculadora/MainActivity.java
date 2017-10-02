package com.example.janet.micalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton r1 = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton r3 = (RadioButton) findViewById(R.id.radioButton3);

        Random random = new Random();
        final Integer r1Int = random.nextInt(9) + 1;
        r1.setText(r1Int.toString());
        final Integer r2Int = random.nextInt(9) + 1;
        r2.setText(r2Int.toString());
        final Integer r3Int = random.nextInt(9) + 1;
        r3.setText(r3Int.toString());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String message;
                Intent secondActivity = new Intent(getApplicationContext(), SecondActivity.class);

                if (r1.isChecked()) {
                    secondActivity.putExtra("firstNumber",r1Int);
                } else if (r2.isChecked()) {
                    secondActivity.putExtra("firstNumber",r2Int);
                } else if (r3.isChecked()) {
                    secondActivity.putExtra("firstNumber",r3Int);
                } else {
                    message = "Debes seleccionar algun numero";
                    Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
                    return;
                }

                startActivity(secondActivity);
            }
        });
    }
}
