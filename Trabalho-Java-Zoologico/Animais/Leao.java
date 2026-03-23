package com.mago.zoologico.Animais;

public class Leao extends Animal implements Terrestre {

    public Leao(String nome, int idade, char genero) {
        super(nome, idade, genero);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("leao faz barulho");
    }


    @Override
    public void andar() {
        System.out.println("leão anda");
    }
}
