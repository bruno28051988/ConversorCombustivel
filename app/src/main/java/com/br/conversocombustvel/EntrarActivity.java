package com.br.conversocombustvel;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntrarActivity extends AppCompatActivity {

    private EditText valorAlcool;
    private EditText valorGasolina;
    private TextView txtConversao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);


        valorAlcool = findViewById(R.id.alcool);
        valorGasolina = findViewById(R.id.gasolina);
        txtConversao = findViewById(R.id.txtConversao);

    }

    public void verificar(View view){
        Double precoAlcool = Double.parseDouble(valorAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(valorGasolina.getText().toString());
        Double resultado = precoAlcool / precoGasolina;

        if (resultado >= 0.7){
                txtConversao.setText("Melhor abastecer com GASOLINA!!");
        }else{
            txtConversao.setText("Melhor abastecer com ÁLCOOL!!");
        }




    }


}