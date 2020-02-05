package com.pacosignes.xistaco;

public class Xiste {

    private int id;
    private String texto;

    public Xiste(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }
    public Xiste(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
