package com.silviaalcon.proyectofinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PerfilAdapter.onPerfilSelectedListener{

    RecyclerView perfilRecycledView;
    PerfilAdapter perfilAdapter;
    ImageButton sobre;
    ImageButton principal;
    ImageButton biblio;
    ImageButton acad;
    MediaPlayer mp, mps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobre = (ImageButton) findViewById(R.id.botoni);
        mp = MediaPlayer.create(this, R.raw.principal);
        mps = MediaPlayer.create(this, R.raw.selected);
        principal = (ImageButton) findViewById(R.id.btn_usr);
        biblio = (ImageButton) findViewById(R.id.btn_bib);
        acad = (ImageButton) findViewById(R.id.btn_pro);


        perfilRecycledView = (RecyclerView) findViewById(R.id.item_RecyclerView);
        //cuando creamos un recycled debemos crear dos metodos
        perfilRecycledView.setHasFixedSize(true);
        //perfilRecycledView.setLayoutManager(new GridLayoutManager(this, 2));
        perfilRecycledView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        perfilAdapter = new PerfilAdapter(this, this);
        llenarDatos();
        perfilRecycledView.setAdapter(perfilAdapter);

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent sobre = new Intent(getApplicationContext(), About.class);
                startActivity(sobre);
                finish();
            }
        });

        principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        biblio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent i = new Intent(getApplicationContext(), PrincipalLibros.class);
                startActivity(i);
                finish();
            }
        });

        acad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent i = new Intent(getApplicationContext(), AcademicoActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void llenarDatos() {
        List<Perfil> lista = new ArrayList<>();

        lista.add(new Perfil(R.drawable.aruquipa, getString(R.string.NoAruquipa) , getString(R.string.RAcademico), getString(R.string.AcAruquipa), getString(R.string.RCaracter), getString(R.string.CaAruquipa)));
        lista.add(new Perfil(R.drawable.beltran, getString(R.string.NoBeltran), getString(R.string.RAcademico), getString(R.string.AcBeltran), getString(R.string.RCaracter), getString(R.string.CaBeltran)));
        lista.add(new Perfil(R.drawable.carvajal, getString(R.string.NoCarvajal), getString(R.string.RAcademico), getString(R.string.AcCarvajal), getString(R.string.RCaracter), getString(R.string.CaCarvajal)  ));
        lista.add(new Perfil(R.drawable.casilla, getString(R.string.NoCasillas), getString(R.string.RAcademico), getString(R.string.AcCasillas), getString(R.string.RCaracter), getString(R.string.CaCasillas)  ));
        lista.add(new Perfil(R.drawable.huanca, getString(R.string.NoHuanca), getString(R.string.RAcademico), getString(R.string.AcHuanca), getString(R.string.RCaracter), getString(R.string.CaHuanca)  ));
        lista.add(new Perfil(R.drawable.flores, getString(R.string.NoFlores), getString(R.string.RAcademico), getString(R.string.AcFlores), getString(R.string.RCaracter), getString(R.string.CaFlores)  ));
        lista.add(new Perfil(R.drawable.gallardo, getString(R.string.NoGallardo), getString(R.string.RAcademico), getString(R.string.AcGallardo), getString(R.string.RCaracter), getString(R.string.CaFlores)  ));
        lista.add(new Perfil(R.drawable.hurtado, getString(R.string.NoHurtado), getString(R.string.RAcademico), getString(R.string.AcHurtado), getString(R.string.RCaracter), getString(R.string.CaHurtado)  ));
        lista.add(new Perfil(R.drawable.llanque, getString(R.string.NoLlanque), getString(R.string.RAcademico), getString(R.string.AcLlanque), getString(R.string.RCaracter), getString(R.string.CaLlanque)  ));
        lista.add(new Perfil(R.drawable.memfy, getString(R.string.NoMenfy), getString(R.string.RAcademico), getString(R.string.AcMenfy), getString(R.string.RCaracter), getString(R.string.CaMenfy)  ));
        lista.add(new Perfil(R.drawable.mullisaca, getString(R.string.NoMullisaca), getString(R.string.RAcademico), getString(R.string.AcMullisaca), getString(R.string.RCaracter), getString(R.string.CaMullisaca)  ));
        lista.add(new Perfil(R.drawable.reyes, getString(R.string.NoReyes), getString(R.string.RAcademico), getString(R.string.AcReyes), getString(R.string.RCaracter), getString(R.string.CaReyes)  ));
        lista.add(new Perfil(R.drawable.tapia, getString(R.string.NoTapia), getString(R.string.RAcademico), getString(R.string.AcTapia), getString(R.string.RCaracter), getString(R.string.CaTapia)  ));
        lista.add(new Perfil(R.drawable.tarquino, getString(R.string.NoTarquino), getString(R.string.RAcademico), getString(R.string.AcTarquino), getString(R.string.RCaracter), getString(R.string.CaTarquino)  ));
        //lista.add(new Perfil(R.drawable.teran, getString(R.string.NoTeran), getString(R.string.RAcademico), getString(R.string.AcCarvajal), getString(R.string.RCaracter), getString(R.string.CaCarvajal)  ));
        lista.add(new Perfil(R.drawable.vargas, getString(R.string.NoVargas), getString(R.string.RAcademico), getString(R.string.AcVargas), getString(R.string.RCaracter), getString(R.string.CaVargas)  ));
        lista.add(new Perfil(R.drawable.zeballos, getString(R.string.NoZeballos), getString(R.string.RAcademico), getString(R.string.AcZeballos), getString(R.string.RCaracter), getString(R.string.CaZeballos)  ));
        perfilAdapter.setDataset(lista);
    }

    @Override public void onPerfilSelected(Perfil perfil) {
        mps.start();
        Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
        intent.putExtra("perfil", perfil);
        startActivity(intent);
        finish();
    }
}
