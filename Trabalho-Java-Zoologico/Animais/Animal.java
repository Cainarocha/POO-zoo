package com.mago.zoologico.Animais;

public abstract class Animal {
    private String nome;
    private int idade;
    private char genero;

    public Animal(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    
    
    public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public char getGenero() {
		return genero;
	}



	public void setGenero(char genero) {
		this.genero = genero;
	}



	public abstract void fazerBarulho();

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + ", genero=" + genero + "]";
	}
}
