package com.example.amst_g1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.getbase.floatingactionbutton.FloatingActionButton;

public class menu_ingreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ingreso);

        //FloatingActionButton menuBotones = findViewById(R.id.openMenu);
        FloatingActionButton botCalen = (FloatingActionButton) findViewById(R.id.idcalendario);
        FloatingActionButton botGra = (FloatingActionButton) findViewById(R.id.idgrafico);
        FloatingActionButton botYou = (FloatingActionButton) findViewById(R.id.idyoutube);
        FloatingActionButton botMapas = (FloatingActionButton) findViewById(R.id.idmapas);


        botMapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                google_maps(view);
            }
        });

        botYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vid(view);
            }
        });

        botCalen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calen(view);
            }
        });

        botGra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grafic_lineal(view);
            }
        });
    }

    public void google_maps(View view) {
        Intent intent = new Intent(this, google_maps.class);
        startActivity(intent);
    }

    public void calen(View view) {
        Intent intent = new Intent(this, calendar_view.class);
        startActivity(intent);
    }

    public void grafic_lineal(View view) {
        Intent intent = new Intent(this, grafico_lineal.class);
        startActivity(intent);
    }

    public void vid(View view) {
        Intent intent = new Intent(this, video_view.class);
        startActivity(intent);
    }
}