package com.silviaalcon.proyectofinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class PrincipalLibros extends AppCompatActivity implements LibrosAdapter.onLibrosSelectedListener{

    RecyclerView librosRecycledView;
    LibrosAdapter librosAdapter;
    ImageButton sobre;
    ImageButton principal;
    ImageButton biblio;
    ImageButton acad;
    MediaPlayer mp, mps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_libros);

        mp = MediaPlayer.create(this, R.raw.principal);
        mps = MediaPlayer.create(this, R.raw.selected);
        sobre = (ImageButton) findViewById(R.id.botoni);
        principal = (ImageButton) findViewById(R.id.btn_usr);
        biblio = (ImageButton) findViewById(R.id.btn_bib);
        acad = (ImageButton) findViewById(R.id.btn_pro);

        librosRecycledView = (RecyclerView) findViewById(R.id.item_RecyView);
        //cuando creamos un recycled debemos crear dos metodos
        librosRecycledView.setHasFixedSize(true);
        //perfilRecycledView.setLayoutManager(new GridLayoutManager(this, 2));
        librosRecycledView.setLayoutManager(new LinearLayoutManager(this));

        librosAdapter = new LibrosAdapter(this, this);
        llenarDatos();
        librosRecycledView.setAdapter(librosAdapter);


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
        List<Libros> lista = new ArrayList<>();
        lista.add(new Libros(R.drawable.sem_aprimer, getString(R.string.minf111), getString(R.string.lib1111), getString(R.string.tp), getString(R.string.lib1112), getString(R.string.tp), getString(R.string.lib1113), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_aprimer, getString(R.string.minf112), getString(R.string.lib1121), getString(R.string.tp), getString(R.string.lib1122), getString(R.string.tp), getString(R.string.lib1123), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_aprimer, getString(R.string.minf113), getString(R.string.lib1131), getString(R.string.tp), getString(R.string.lib1132), getString(R.string.tp), getString(R.string.lib1133), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_bseg, getString(R.string.minf121), getString(R.string.lib1211), getString(R.string.tp), getString(R.string.lib1212), getString(R.string.tp), getString(R.string.lib1213), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_cter, getString(R.string.minf131), getString(R.string.lib1311), getString(R.string.tp), getString(R.string.lib1312), getString(R.string.tp), getString(R.string.lib1313), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_dcua, getString(R.string.minf143), getString(R.string.lib1431), getString(R.string.tp), getString(R.string.lib1432), getString(R.string.tp), getString(R.string.lib1433), getString(R.string.tp)));
        //lista.add(new Libros(R.drawable.sem_dcua, getString(R.string.minf144), getString(R.string.lib1), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_equi, getString(R.string.minf152), getString(R.string.lib1521), getString(R.string.tp), getString(R.string.lib1522), getString(R.string.tp), getString(R.string.lib1523), getString(R.string.tp)));
        //lista.add(new Libros(R.drawable.sem_equi, getString(R.string.minf153), getString(R.string.lib), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp)));
        //lista.add(new Libros(R.drawable.sem_equi, getString(R.string.mmat156), getString(R.string.), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_fsex, getString(R.string.minf161), getString(R.string.lib1611), getString(R.string.tp), getString(R.string.lib1612), getString(R.string.tp), getString(R.string.lib1613), getString(R.string.tp)));
        lista.add(new Libros(R.drawable.sem_fsex, getString(R.string.minf162), getString(R.string.lib1621), getString(R.string.tp), getString(R.string.lib1622), getString(R.string.tp), getString(R.string.lib1623), getString(R.string.tp)));
        librosAdapter.setDataset(lista);
    }


    @Override
    public void onLibrosSelected(Libros libros) {
        mps.start();
        Intent intent = new Intent(getApplicationContext(), LibrosActivity.class);
        intent.putExtra("libros", libros);
        startActivity(intent);
    }
}
