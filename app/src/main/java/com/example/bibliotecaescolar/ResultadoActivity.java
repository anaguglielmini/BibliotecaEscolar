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
            String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_LIVRO);
            String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_DATA);
            String message5 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_DATA2);

        String messageComp = "Nome: " + message + "\n" + "\n" + "Número do telefone: " + message2
                + "\n" + "\n" + "Livro alugado: " + message3 + "\n"  + "\n" + "Data de Empréstimo: " + message4
                + "\n" + "\n" + "Data de Devolução: " + message5;

            TextView txtResposta = new TextView(this);
            txtResposta.setTextSize(20);
            txtResposta.setText(messageComp);
            setContentView(txtResposta);
        }
    }

