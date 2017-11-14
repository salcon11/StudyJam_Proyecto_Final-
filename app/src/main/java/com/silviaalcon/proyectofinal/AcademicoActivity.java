package com.silviaalcon.proyectofinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AcademicoActivity extends AppCompatActivity {

    private ImageButton campus;
    private ImageButton web;
    private ImageButton face;
    private ImageButton sist;
    private Button volver;
    private Button donde;
    private Intent intent;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academico);
        getSupportActionBar().setTitle("Informacion Academica");

        campus = (ImageButton) findViewById(R.id.im_campus);
        web = (ImageButton) findViewById(R.id.im_web);
        face = (ImageButton) findViewById(R.id.im_face);
        sist = (ImageButton) findViewById(R.id.im_pag);
        donde = (Button) findViewById(R.id.btn_dircar);
        volver = (Button) findViewById(R.id.btn_volver);
        mp = MediaPlayer.create(this, R.raw.back);

        donde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                abrirGoogleMaps();
            }
        });

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });




        campus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                abrirPagina();
            }
        });

        web.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                abrirPaginaWeb();
            }


        });

        face.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                abrirPaginaface();
            }
        });

        sist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                abrirPaginaSist();
            }
        });

    }

    public void abrirPagina() {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://cv.fcpn.umsa.bo/"));
        startActivity(intent);
    }

    public void abrirPaginaWeb() {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://informatica.edu.bo/"));
        startActivity(intent);
    }

    public void abrirPaginaface() {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/groups/infoamigos/"));
        startActivity(intent);
    }

    public void abrirPaginaSist() {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://dnsia.informatica.edu.bo/"));
        startActivity(intent);
    }

    public void abrirGoogleMaps(){
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo: -16.504014, -68.130906"));
        startActivity(intent);
    }
}
