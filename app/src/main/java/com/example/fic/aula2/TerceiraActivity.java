package com.example.fic.aula2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TerceiraActivity extends AppCompatActivity {

    private TextView txtMensagem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        Bundle dados = getIntent().getExtras();
        String nomeDigitado = dados.getString("nome");

        txtMensagem2 = (TextView) findViewById(R.id.txtMensagemTerceira);
        txtMensagem2.setText("Você digitou " + nomeDigitado);
    }
}
