package com.mago.zoologico.Funcionarios;

public abstract class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract void trabalhar();

    public String getNome() {
        return nome;
    }

    public float salario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }
}