package com.mago.zoologico.Animais;

public class Coruja extends Animal implements Voador {

    public Coruja(String nome, int idade, char genero) {
        super(nome, idade, genero);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("coruja faz barulho");
    }

    public void voar() {
        System.out.println("coruja voa");
    }
}
