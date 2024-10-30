package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewCzas;
    TextView textViewZapisanyCzas;
    Button buttonZapisz;
    Button buttonStart;
    Button buttonPauza;
    Button buttonReset;
    int sekundy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCzas = findViewById(R.id.textViewCzas);
        textViewZapisanyCzas = findViewById(R.id.textViewZapisanyCzas);
        buttonPauza = findViewById(R.id.buttonPauza);
        buttonReset = findViewById(R.id.buttonReset);
        buttonStart = findViewById(R.id.buttonStart);
        buttonZapisz = findViewById(R.id.buttonZapisz);
        idzieCzas();
    }

    private void idzieCzas(){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                sekundy++;
                s60 = sekundy%60;
                textViewCzas.setText(String.valueOf(sekundy));
                handler.postDelayed(this,1000);
            }
        });
    }

}