package com.qalabs.javabasics;

public class AssertionExample5 {

    public int substract(int A, int B){

     return A -B;
    }

    public static void main(String[] args){

        AssertionExample5 objeto = new AssertionExample5();
        System.out.println(objeto.substract(50,20));
        assert objeto.substract(1,0)>5:"1 no es menor que 5";
    }

}
