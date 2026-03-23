package com.mago.zoologico;

public class Visitante {
    private String nome;
    private int idade;

    public Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters para nome e idade
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

    @Override
    public String toString() {
        return "Visitante [nome=" + nome + ", idade=" + idade + "]";
    }
}
