package com.qalabs.javabasics;

public class MyClassBoxer extends MyDogExample {

    public void Morder(MyGatoExample A){
        System.out.println("Mi perro boxer "+this.getNombre()+" intento morder al gato "+A.getNombre()+" y este salio corriendo");
    }

    public static void main(String[] args){
        MyClassBoxer perro = new MyClassBoxer();
        MyGatoExample gato = new MyGatoExample();
        gato.setNombre("Bicho");
        perro.setNombre("Tosco");
        perro.Morder(gato);
    }

}
