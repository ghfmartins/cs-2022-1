package org.example;

/**
 * Classe que define uma instância de Bairro.
 * @author Gustavo Martins
 * Data 15/07/2022
 */
public class Bairro {
    private String nome;
    private Cidade cidade;

    /**
     * Construtor da classe.
     */
    public Bairro() {
    }

    /**
     * Método que retorna o nome do bairro.
     * @return o nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do bairro.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém uma instância de Cidade para o bairro.
     * @return a Cidade.
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * Método para definir uma instância de Cidade para o bairro.
     * @param cidade
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
