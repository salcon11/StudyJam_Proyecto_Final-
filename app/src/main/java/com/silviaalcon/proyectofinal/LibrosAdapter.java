package com.silviaalcon.proyectofinal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silvia Alcon on 13/11/2017.
 */

public class LibrosAdapter extends RecyclerView.Adapter<LibrosAdapter.LibrosViewHolder> {
    List<Libros> dataset;
    Context context;
    onLibrosSelectedListener onLibrosSelectedListener;

    public interface onLibrosSelectedListener{
        void onLibrosSelected(Libros libros);
    }

    public LibrosAdapter(Context context, onLibrosSelectedListener lib) {
        this.context = context;
        this.dataset = new ArrayList<>();
        onLibrosSelectedListener = lib;
    }

    @Override
    public LibrosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //creamos una vista
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_libros, parent, false);
        //devolvemos la vista
        return new LibrosViewHolder(view);
    }

    //metodo para llenar los datos de nuestras clases a nuestros items
    @Override
    public void onBindViewHolder(LibrosViewHolder holder, int position) {
        //le damos posicion
        Libros libros = dataset.get(position);
        //procedemos al llenado
        holder.materia.setText(libros.getTexto1());
        holder.imagen.setImageResource(libros.getImagen());
        holder.setOnLibrosSelectedListener(libros, onLibrosSelectedListener);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class LibrosViewHolder extends RecyclerView.ViewHolder {
        View cardView;
        ImageView imagen;
        TextView materia;

        public LibrosViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.item_CardView_Materias);
            imagen = itemView.findViewById(R.id.itemCV_imgli);
            materia = itemView.findViewById(R.id.itemCV_txtli);
        }

        public void setOnLibrosSelectedListener(final Libros libros, final onLibrosSelectedListener onLibrosSelectedListener) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onLibrosSelectedListener.onLibrosSelected(libros);
                }
            });
        }
    }

    public void setDataset(List<Libros> libroses) {
        if (libroses == null){
            dataset = new ArrayList<>();
        }else{
            dataset = libroses;
        }
        //nos dice que la lista se va a actualizar
        notifyDataSetChanged();
    }



















}
