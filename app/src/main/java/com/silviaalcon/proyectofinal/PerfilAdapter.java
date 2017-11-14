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
 * Created by Silvia Alcon on 24/10/2017.
 */

public class PerfilAdapter extends RecyclerView.Adapter<PerfilAdapter.PerfilViewHolder>{
    List<Perfil> dataset;
    Context context;
    onPerfilSelectedListener onPerfilSelectedListener;

    public interface onPerfilSelectedListener{
        void onPerfilSelected(Perfil perfil);
    }

    public PerfilAdapter(Context context, onPerfilSelectedListener onPerfilSelectedListener) {
        this.context = context;
        this.dataset = new ArrayList<>();
        this.onPerfilSelectedListener = onPerfilSelectedListener;
    }

    @Override
    public PerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //creamos una vista
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_perfil, parent, false);
        //devolvemos la vista
        return new PerfilViewHolder(view);
    }

    //metodo para llenar los datos de nuestras clases a nuestros items
    @Override
    public void onBindViewHolder(PerfilViewHolder holder, int position) {
        //le damos posicion
        Perfil perfil = dataset.get(position);
        //procedemos al llenado
        holder.nombre.setText(perfil.getNombre());
        holder.imagen.setImageResource(perfil.getImagen());
        holder.setOnPerfilSelectedListener(perfil, onPerfilSelectedListener);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class PerfilViewHolder extends RecyclerView.ViewHolder {
        View cardView;
        ImageView imagen;
        TextView nombre;

        public PerfilViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.itemCV_img);
            imagen = itemView.findViewById(R.id.itemCV_img);
            nombre = itemView.findViewById(R.id.itemCV_txt);
        }

        public void setOnPerfilSelectedListener(final Perfil perfil, final onPerfilSelectedListener onPerfilSelectedListener) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onPerfilSelectedListener.onPerfilSelected(perfil);
                }
            });
        }
    }

    public void setDataset(List<Perfil> perfils) {
        if (perfils == null){
            dataset = new ArrayList<>();
        }else{
            dataset = perfils;
        }
        //nos dice que la lista se va a actualizar
        notifyDataSetChanged();
    }

}




















