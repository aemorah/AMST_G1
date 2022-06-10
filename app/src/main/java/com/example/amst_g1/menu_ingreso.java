package com.example.amst_g1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class menu_ingreso extends AppCompatActivity {

    FloatingActionsMenu menuBotones;
    FloatingActionButton botCalen,botYou,botMapas,botGra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ingreso);
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