package com.qalabs.javabasics;

public class MyClassPeleaAnimales {

    public static void  main(String[] args){
        //MyClassPeleaAnimales pelea = new MyClassPeleaAnimales();
        MyDogExample perro = new MyDogExample();
       // perro.Morder();
        MyGatoExample gato = new MyGatoExample();
       // gato.Maullar();

        perro.setNombre("Boomer");
        gato.setNombre("Bicho");
        perro.Morder(gato);
        perro.setEdad(8);
        System.out.println("La edad de "+perro.getNombre()+" en anyos perrunos es de "+perro.getEdad()*7);

    }


}
