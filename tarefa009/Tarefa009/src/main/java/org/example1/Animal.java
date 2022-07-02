package org.example1;

public class Animal {
    private String nome;
    private int idade;
    private String som;
    private String comportamento;

    public Animal(String nome, int idade, String som, String comportamento) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
        this.comportamento = comportamento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void emitirSom() {
        System.out.println(nome + " " + som);
    }

    public void realizaAcao() {
        System.out.println(nome + " " + comportamento);
    }
}