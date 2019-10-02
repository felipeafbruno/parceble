package com.ems.aula03;

import android.content.Intent;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {
    TextView saida;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        saida = findViewById(R.id.txtSaida);

        Intent it = getIntent();
        saida.setText(it.getStringExtra("nome"));

    }
}
