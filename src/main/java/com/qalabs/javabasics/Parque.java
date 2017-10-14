package com.qalabs.javabasics;

public class Parque {

    public static void main(String[] args){

        ClaseBicicleta bici1 = new ClaseBicicleta();
        ClaseBicicleta bici2 = new ClaseBicicleta();

        bici1.setRueda(2);
        bici2.setRueda(3);

        System.out.println("La Bici1 tiene total de ruedas:"+bici1.getRueda());
        System.out.println("La Bici 2 tiene total de ruedas:"+bici2.getRueda());

        bici1.acelerar();


    }
}
