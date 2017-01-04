package com.example.diego.proyectorecyclerview;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Diego on 1/1/2017.
 */

public class Mascota_Adaptador extends RecyclerView.Adapter<Mascota_Adaptador.ContactoViewHolder> { //la clase contact_Adaptador herad de RecyclerVire maneja la lista de contactos
    //pasarle la foto al elemento de abajo,pasarl el nombre


    ArrayList<InfoMascota> InfoMascota;
    Activity activity;
    public Mascota_Adaptador(ArrayList<InfoMascota> contactos,Activity activity)

    {
        this.InfoMascota=contactos;
        this.activity=activity;

    }




    //inflar el layout y lo pasara al viewholder para obtener los views
    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //maneja la parte de inflar o darla vida al cardview
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_formato,parent,false);



        return new ContactoViewHolder(v);
    }

    //asocia los elementos de la lista con cada view
    @Override
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder, int position) {//aqui es donde se pasa la lista de contacto a cada elemento imgFoto,nomvrecardview,etc

        final InfoMascota contactoss=InfoMascota.get(position);
        final int likes=contactoss.getValoracion();
        contactoViewHolder.ImgFoto.setImageResource(contactoss.getFoto());
        contactoViewHolder.nombrecardview.setText(contactoss.getNombre());

       /* contactoViewHolder.ImgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,contactoss.getNombre(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(activity,cinco_ultimas.class);
                intent.putExtra("Nombre", contactoss.getNombre());
                intent.putExtra("Valoracion", contactoss.getValoracion());


                activity.startActivity(intent);

            }
        });
*/


        contactoViewHolder.btnlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Diste like a "+contactoss.getNombre(),Toast.LENGTH_SHORT).show();
                /*int val = contactoss.getValoracion() + 1;
                contactoss.setValoracion(val);*/
                contactoss.setValoracion(likes+1);


            }
        });

    }

    @Override
    public int getItemCount() {//cantidad de elemntos que contiene mi lista
        return InfoMascota.size();
    }


    //la clase contact_Adaptador herad de RecyclerVire maneja la lista de contactos
    //pasarle la foto al elemento de abajo,pasarl el nombre

    // Viewholder//nos ayuda a crear nustros objetos y asociarlo
    public static class ContactoViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView ImgFoto;
        private TextView nombrecardview;
        private ImageView btnlike;

        public ContactoViewHolder(View itemView) {
            super(itemView);
            ImgFoto=(ImageView) itemView.findViewById(R.id.mascota1);
            nombrecardview=(TextView) itemView.findViewById(R.id.nombremascota);
            btnlike=(ImageView) itemView.findViewById(R.id.huesoblanco);


        }
    }
}
