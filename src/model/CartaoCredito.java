package model;

public class CartaoCredito implements MeioDePagamento{

    //TODO: Acrescentar possíveis atributos

    @Override
    public double processar(double valor){
        return valor*1.02;
    }

}
