package model;

import java.io.Serializable;

public interface AreaCalculavel {

    double calcularArea();

    default void teste(){
        System.out.println("OK");
    }

    static void teste2(){
        System.out.println("Ok 2");
    }

}
