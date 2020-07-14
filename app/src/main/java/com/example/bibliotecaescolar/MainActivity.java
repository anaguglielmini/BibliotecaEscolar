package com.example.bibliotecaescolar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;



public class MainActivity extends AppCompatActivity {

        public final static String EXTRA_MESSAGE = "com.example.bibliotecaescolar.MESSAGE";
        public final static String EXTRA_MESSAGE_VALOR = "com.example.bibliotecaescolar.MESSAGE_VALOR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void resposta(View view) {
        Intent intent = new Intent(this, ResultadoActivity.class);
        EditText txtNome = (EditText)findViewById(R.id.txtNome);
        String message = txtNome.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        EditText txtNum = (EditText)findViewById(R.id.pnTelefone);
        String messagenum = txtNum.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_VALOR, messagenum);
        startActivity(intent);
    }
}
