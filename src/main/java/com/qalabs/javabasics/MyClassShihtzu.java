package com.qalabs.javabasics;

public class MyClassShihtzu extends MyDogExample{

    public void comer(){
        System.out.println(this.getNombre()+" esta comiendo");
        System.out.println(this.getNombre()+" esta cagando");
    }

    public static void main(String[] args){

        MyClassShihtzu perro= new MyClassShihtzu();
        perro.setNombre("Coco");
        System.out.println("My Shihtzu se llama "+perro.getNombre());
        perro.comer();
    }

}
