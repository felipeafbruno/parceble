// https://imasters.com.br/android/intents-passagem-de-parametros-entre-telas
package com.ems.aula03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.ems.aula03.databinding.ActivityMainBinding;

public class MainActivity extends Activity {
    ActivityMainBinding obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        obj = DataBindingUtil.setContentView(this, R.layout.activity_main);

        obj.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Resultado.class);
                it.putExtra("nome", obj.nome.getText().toString());
                startActivity(it);
            }
        });
    }
}



















