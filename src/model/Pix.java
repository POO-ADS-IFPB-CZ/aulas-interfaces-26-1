package model;

public class Pix implements MeioDePagamento{

    //TODO: acrescentar possíveis atributos

    @Override
    public double processar(double valor){
        return valor*0.9;
    }

}
