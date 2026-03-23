package com.mago.zoologico.Animais;

public class Flamingo extends Animal implements Voador {

    public Flamingo(String nome, int idade, char genero) {
        super(nome, idade, genero);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("flamingo faz barulho");
    }

    @Override
    public void voar() {
        System.out.println("flamingo voa");
    }
}
