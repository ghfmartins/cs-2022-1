package org.example;

/**
 * Define uma instância de Logradouro.
 * Author Gustavo Martins
 * Date 15/07/2022
 */
public class Logradouro {
    private String nome;

    /**
     * Construtor da classe Logradouro.
     */
    public Logradouro() {
    }

    /**
     * Obtém o nome do logradouro
     * @return o nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define um nome para o logradouro.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
