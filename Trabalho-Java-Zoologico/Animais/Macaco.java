package com.mago.zoologico.Animais;

public class Macaco extends Animal implements Terrestre {

	public Macaco(String nome, int idade, char genero) {
		super(nome, idade, genero);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("macaco faz barulho");
		
	}

	public void andar() {
		System.out.println("macaco anda");
		
	}
}
