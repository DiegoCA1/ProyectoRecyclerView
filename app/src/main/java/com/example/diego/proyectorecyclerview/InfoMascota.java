package com.example.diego.proyectorecyclerview;

/**
 * Created by Diego on 1/1/2017.
 */

public class InfoMascota {
    private String nombre;
    private int valoracion;
    private int foto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public InfoMascota(String nombre, int valoracion, int foto) {
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.foto = foto;

    }
}
