package com.qalabs.javabasics;

public class ClaseBicicleta {

    int rueda;
    int volante;
    int asiento;
    int cadena;
    int frenos;

    public void setRueda(int A){
        this.rueda=A;
    }

    public int getRueda(){
        return this.rueda;
    }

    public void setVolante(int A){
        this.volante=A;
    }

    public int getVolante(){
        return this.volante;
    }

    public void setAsiento(int A){
        this.asiento=A;
    }

    public int getAsiento(){
        return this.asiento;
    }

    public void setCadena(int A){
        this.cadena=A;
    }

    public int getCadena(){
        return this.cadena;
    }

    public void setFrenos(int A){
        this.frenos=A;
    }

    public int acelerar(){
     return 5;
    }

    public int retroceder(){
        return 2;
    }

    public int frenar(){
        return 20;
    }

}