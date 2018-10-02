package com.digitalhouse.ciclodevidaapp;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView texto1;
    private EditText nomeUsuario;
    private NumberPicker numeroDeFotos = null;
    private TextView textoValorFinal;
    private EditText numeroTelefone;
    private EditText email;
    private TextView texto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate Acontecendo", Toast.LENGTH_LONG).show();
        Log.e("MainActivity", "onCreate foi chamado");
        texto1 = findViewById(R.id.aceitou);
        nomeUsuario = findViewById(R.id.nomeUsuario);
        numeroDeFotos = findViewById(R.id.numeroDeFotos);
        numeroDeFotos.setMaxValue(100);
        numeroDeFotos.setMinValue(0);
        numeroDeFotos.setWrapSelectorWheel(false);
        textoValorFinal = findViewById(R.id.valorDaCompra);
        numeroTelefone = findViewById(R.id.telefone);
        texto3 = findViewById(R.id.texto3);

    }




    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
        Log.e("MainActivity", "onStart foi chamado");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Acontecendo", Toast.LENGTH_LONG).show();
        Log.e("MainActivity", "onResume foi chamado");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause acontecendo", Toast.LENGTH_LONG).show();
        Log.e("MainActivity", "onPause foi chamado");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop acontecendo", Toast.LENGTH_LONG).show();
        Log.e("MainActivity", "onStop foi chamado");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy acontecendo agora bumm", Toast.LENGTH_LONG).show();
        Log.e("MainActivity", "onDestroy foi chamado");

    }



    public void aceitar(View view) {

        Integer orcamento = (numeroDeFotos.getValue()*12);
        texto1.setText("Obrigado, " +nomeUsuario.getText() +". Compra realizada!");
        textoValorFinal.setText("Valor total da compra: R$ "+orcamento);
        texto3.setText("As fotos serão enviadas para o e-mail cadastrado: "+email);



    }

    public void cancelar(View view) {
        texto1.setText("Compra cancelada.");
        nomeUsuario.setText("");

    }
}

