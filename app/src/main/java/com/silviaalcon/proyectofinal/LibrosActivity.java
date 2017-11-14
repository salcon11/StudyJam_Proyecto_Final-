package com.silviaalcon.proyectofinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LibrosActivity extends AppCompatActivity {
    ImageView img;
    TextView libt, lib1, des1, lib2, des2, lib3, des3;
    Button volver;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros);
        getSupportActionBar().setTitle("Bibliografia");

        img = (ImageView) findViewById(R.id.img_adpli);
        libt = (TextView) findViewById(R.id.tl);
        lib1 = (TextView) findViewById(R.id.tl_uno);
        des1 = (TextView) findViewById(R.id.tl_unod);
        lib2 = (TextView) findViewById(R.id.tl_dos);
        des2 = (TextView) findViewById(R.id.tl_dosd);
        lib3 = (TextView) findViewById(R.id.tl_tres);
        des3 = (TextView) findViewById(R.id.tl_tresd);
        mp = MediaPlayer.create(this, R.raw.back);

        Bundle bundle = getIntent().getExtras();
        Libros libros = (Libros) bundle.getSerializable("libros");

        img.setImageResource(libros.getImagen());
        libt.setText(libros.getTexto1());
        lib1.setText(libros.getTexto2());
        des1.setText(libros.getTexto3());
        lib2.setText(libros.getTexto4());
        des2.setText(libros.getTexto5());
        lib3.setText(libros.getTexto6());
        des3.setText(libros.getTexto7());

        if (libt.getText().equals("INF-111 \n Introduccion a la Informatica")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-112 \n Organizacion de Computadoras" )){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-113 \n Laboratorio de Computacion")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-121 \n Algoritmos y Programacion")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-131 \n Estructura de Datos y Algortimos")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-143 \n Taller de Programacion")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-152 \n Sistemas de Informacion Gerencial")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-161 \n Diseño y Administracion de Base de Datos")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (libt.getText().equals("INF-162 \n Analisis y Diseño de Sistemas de Informacion ")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                    startActivity(i);
                    finish();
                }
            });
        }
    }
}
