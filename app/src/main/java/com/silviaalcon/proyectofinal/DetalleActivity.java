package com.silviaalcon.proyectofinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silvia Alcon on 24/10/2017.
 */

public class DetalleActivity extends AppCompatActivity{
    ImageView imagenDetallePerfil;
    TextView nombre, texto1, texto2, texto3, texto4;
    Button volver;
    MediaPlayer mp;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        getSupportActionBar().setTitle("Descripción");

        imagenDetallePerfil = (ImageView) findViewById(R.id.img_adp);
        nombre = (TextView) findViewById(R.id.txt_nom);
        texto1 = (TextView) findViewById(R.id.txt1_adp);
        texto2 = (TextView) findViewById(R.id.txt2_adp);
        texto3 = (TextView) findViewById(R.id.txt3_adp);
        texto4 = (TextView) findViewById(R.id.txt4_adp);
        mp = MediaPlayer.create(this, R.raw.back);

        Bundle bundle = getIntent().getExtras();
        Perfil perfil = (Perfil) bundle.getSerializable("perfil");

        imagenDetallePerfil.setImageResource(perfil.getImagen());
        nombre.setText(perfil.getNombre());
        texto1.setText(perfil.getTxt1());
        texto2.setText(perfil.getTxt2());
        texto3.setText(perfil.getTxt3());
        texto4.setText(perfil.getTxt4());


        if (nombre.getText().equals("Lic. Aruquipa Chambi Marcelo")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Ing. Beltran Villalta Cesar")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Carvajal Blanco Brigida")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Casilla Gutierrez Rene")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Huanca Quisbert Carmen Rosa")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Flores Rojas Ramiro")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Gallardo Portanda Franz Ramiro")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Hurtado Cerruto Victoria")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }

        if (nombre.getText().equals("Lic. Llanque Quispe Eufren")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Morales Rios Memfy")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Mullisaca Choque Carlos")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Reyes Pacheco Javier")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Tapia Baltazar Jose Maria")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Tarquino Peralta Celia Elena")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Teran Pomier Jorge Humberto")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Vargas Blacutt Roberto")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        if (nombre.getText().equals("Lic. Zeballos Abasto Jose Luis")){
            volver = (Button) findViewById(R.id.btn_volver);
            volver.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }

    }



}
