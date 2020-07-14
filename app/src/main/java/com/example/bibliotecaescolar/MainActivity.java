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
    public final static String EXTRA_MESSAGE_LIVRO = "com.example.bibliotecaescolar.MESSAGE_LIVRO";
    public final static String EXTRA_MESSAGE_DATA = "com.example.bibliotecaescolar.MESSAGE_DATA";
    public final static String EXTRA_MESSAGE_DATA2 = "com.example.bibliotecaescolar.MESSAGE_DATA2";

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

        EditText txtLivro = (EditText)findViewById(R.id.txtLivro);
        String msg_livro = txtLivro.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_LIVRO, msg_livro);

        EditText txtEmp = (EditText)findViewById(R.id.txtEmp);
        String data = txtEmp.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_DATA, data);

        EditText txtDev = (EditText)findViewById(R.id.txtDev);
        String data_dev = txtDev.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_DATA2, data_dev);

        startActivity(intent);
    }
}
