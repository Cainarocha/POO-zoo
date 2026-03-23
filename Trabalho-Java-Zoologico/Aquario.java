package com.mago.zoologico;

public class Aquario extends Jaula {

    @Override
    public void limpar() {
        System.out.println("Limpando o aquario");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no aquario");
    }
}
