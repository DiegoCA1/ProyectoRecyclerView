package com.example.diego.proyectorecyclerview;

import android.content.Intent;
import android.icu.text.IDNA;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<InfoMascota> InfoMascota;
    ImageView estrellas;
    RecyclerView lstmascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar MiToolbar= (Toolbar)findViewById(R.id.actionbar);
        setSupportActionBar(MiToolbar);
        inicializaradaptador();
        inicializarmascotas();
        lstmascotas=(RecyclerView) findViewById(R.id.milistalistview);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        lstmascotas.setLayoutManager(llm);
        /*InfoMascota=new ArrayList<InfoMascota>();
        InfoMascota.add(new InfoMascota("peluso",0,R.drawable.mascota1));
        InfoMascota.add(new InfoMascota("Meco",0,R.drawable.mascota2));
        InfoMascota.add(new InfoMascota("Neneco",0,R.drawable.mascota3));
        InfoMascota.add(new InfoMascota("Vasco",0,R.drawable.mascota4));
        InfoMascota.add(new InfoMascota("Perlo",0,R.drawable.mascota5));



        ArrayList<String>nombremascotas=new ArrayList<>();
        ArrayList<Integer>valmascota1=new ArrayList<>();


        for (InfoMascota InfoM:InfoMascota) {
            nombremascotas.add(InfoM.getNombre());

            
        }
        for (InfoMascota valmascota:InfoMascota) {
            valmascota1.add(valmascota.getValoracion());

        }*/

        
            
        }



    public void botonestrella()
    {
       estrellas=(ImageView)findViewById(R.id.botonestrella);
        estrellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,cinco_ultimas.class);
                startActivity(intent);

            }
        });
    }


    public Mascota_Adaptador adaptador;
    public void inicializaradaptador()
    {
        adaptador=new Mascota_Adaptador(InfoMascota,this);
        lstmascotas.setAdapter(adaptador);
    }
    public void inicializarmascotas()
    {
        InfoMascota=new ArrayList<InfoMascota>();
        InfoMascota.add(new InfoMascota("peluso",3,R.drawable.mascota1));
        InfoMascota.add(new InfoMascota("Meco",2,R.drawable.mascota2));
        InfoMascota.add(new InfoMascota("Neneco",5,R.drawable.mascota3));
        InfoMascota.add(new InfoMascota("Vasco",1,R.drawable.mascota4));
        InfoMascota.add(new InfoMascota("Perlo",4,R.drawable.mascota5));

    }


    
}
