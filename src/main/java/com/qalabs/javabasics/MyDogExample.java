package com.qalabs.javabasics;

public class MyDogExample {

    private int edad;
    private String nombre;

    void setEdad(int A){
        edad=A;
    }

    int getEdad(){
        return edad;
    }

    void setNombre(String A){
        nombre=A;
    }

    String getNombre(){
        return nombre;
    }

    public void Morder(MyGatoExample A){
        System.out.println("El perro "+this.getNombre()+" mordio al gato "+A.getNombre());
    }

}
