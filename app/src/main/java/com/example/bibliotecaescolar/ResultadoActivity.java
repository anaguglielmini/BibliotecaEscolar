package com.example.bibliotecaescolar;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
            Intent intent = getIntent();
            String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
            String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_VALOR);
            String messageComp = "Nome: " + message + "\n" + "Número do telefone: " + message2;
            TextView txtResposta = new TextView(this);
            txtResposta.setTextSize(30);
            txtResposta.setText(messageComp);
            setContentView(txtResposta);
        }
    }

