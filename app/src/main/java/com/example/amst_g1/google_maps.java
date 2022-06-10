package com.example.amst_g1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class google_maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico_lineal);
    }
    public void regresar(View view) {
        Intent intent = new Intent(this, menu_ingreso.class);
        startActivity(intent);
    }
}