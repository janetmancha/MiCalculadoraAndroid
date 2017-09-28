package com.example.janet.micalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton r1 = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton r2 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton r3 = (RadioButton) findViewById(R.id.radioButton3);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String message;
                Intent secondActivity = new Intent(getApplicationContext(), SecondActivity.class);

                if (r1.isChecked()) {
                    secondActivity.putExtra("firstNumber",1);
                    //message = "Ha seleccionado el 1";
                } else if (r2.isChecked()) {
                    secondActivity.putExtra("firstNumber",2);
                    //message = "Ha seleccionado el 2";
                } else if (r3.isChecked()) {
                    secondActivity.putExtra("firstNumber",3);
                    //message = "Ha seleccionado el 3";
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
