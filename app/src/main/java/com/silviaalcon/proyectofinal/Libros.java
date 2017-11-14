package com.silviaalcon.proyectofinal;

import java.io.Serializable;

/**
 * Created by Silvia Alcon on 13/11/2017.
 */

public class Libros implements Serializable {
    private int imagenli;
    private String texto1, texto2, texto3, texto4, texto5, texto6, texto7;


    public Libros(int imagen, String texto1, String texto2, String texto3, String texto4, String texto5, String texto6, String texto7) {
        this.imagenli = imagen;
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.texto5 = texto5;
        this.texto6 = texto6;
        this.texto7 = texto7;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public String getTexto3() {
        return texto3;
    }

    public void setTexto3(String texto3) {
        this.texto3 = texto3;
    }

    public String getTexto4() {
        return texto4;
    }

    public void setTexto4(String texto4) {
        this.texto4 = texto4;
    }

    public String getTexto5() {
        return texto5;
    }

    public void setTexto5(String texto5) {
        this.texto5 = texto5;
    }

    public String getTexto6() {
        return texto6;
    }

    public void setTexto6(String texto6) {
        this.texto6 = texto6;
    }

    public String getTexto7() {
        return texto7;
    }

    public void setTexto7(String texto7) {
        this.texto7 = texto7;
    }

    public int getImagen() {
        return imagenli;
    }

    public void setImagen(int imagen) {
        this.imagenli = imagen;
    }
}
