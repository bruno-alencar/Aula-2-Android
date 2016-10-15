package com.example.fic.aula2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SegundaActivity extends AppCompatActivity {

    private EditText txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtNome = (EditText) findViewById(R.id.txtNome);
    }


    public void trocarClick(View view){
        Log.d("Bruno", "Digitou "+ txtNome.getText());


        Intent terceiraTela = new Intent(this, TerceiraActivity.class);
        terceiraTela.putExtra("nome",txtNome.getText().toString());
        startActivity(terceiraTela);


    }
}
