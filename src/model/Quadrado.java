package model;

import java.util.Comparator;

public class Quadrado implements AreaCalculavel, Comparable<Quadrado>{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado,2);
    }

    @Override
    public void teste(){
        System.out.println("Aqui é diferente...");
    }

    @Override
    public int compareTo(Quadrado o) {
        if(lado > o.lado) return 1;
        if(lado < o.lado) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
