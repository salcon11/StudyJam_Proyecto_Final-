package com.silviaalcon.proyectofinal;

import java.io.Serializable;

/**
 * Created by Silvia Alcon on 24/10/2017.
 */

public class Perfil implements Serializable{
    private int imagen;
    private String nombre, txt1, txt2, txt3, txt4;


    public Perfil(int imagen, String nombre, String t1, String t2, String t3, String t4) {
        this.imagen = imagen;
        this.nombre = nombre;
        txt1 = t1;
        txt2 = t2;
        txt3 = t3;
        txt4 = t4;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }

    public String getTxt4() {
        return txt4;
    }

    public void setTxt4(String txt4) {
        this.txt4 = txt4;
    }
}
