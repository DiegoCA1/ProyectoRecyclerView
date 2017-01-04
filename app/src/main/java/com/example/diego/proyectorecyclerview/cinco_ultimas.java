package com.example.diego.proyectorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class cinco_ultimas extends AppCompatActivity {
    ArrayList<InfoMascota> InfoMascota;
    private RecyclerView milistalistview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco_ultimas);



        Toolbar toolbar = (Toolbar) findViewById(R.id.actionbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        milistalistview1=(RecyclerView)findViewById(R.id.milistalistview1);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        milistalistview1.setLayoutManager(llm);











    }
    public Mascota_Adaptador adaptador;
    public void inicializaradaptador()
    {
        adaptador=new Mascota_Adaptador(InfoMascota,this);
        milistalistview1.setAdapter(adaptador);
    }
    public void inicializarmascotas()
    {
        InfoMascota=new ArrayList<InfoMascota>();
        InfoMascota.add(new InfoMascota("Neneco",5,R.drawable.mascota3));
        InfoMascota.add(new InfoMascota("Meco",2,R.drawable.mascota2));
        InfoMascota.add(new InfoMascota("peluso",3,R.drawable.mascota1));
        InfoMascota.add(new InfoMascota("Perlo",4,R.drawable.mascota5));
        InfoMascota.add(new InfoMascota("Vasco",1,R.drawable.mascota4));


    }
}
