package org.example;

/**
 * Define uma instância de Cidade
 * Author Gustavo Martins
 * Date 15/07/2022
 */
public class Cidade {
    private String nome;
    private Estado estado;

    /**
     * Construtor da classe cidade.
     */
    public Cidade() {
    }

    /**
     * Método que retorna o nome da cidade.
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que define o nome da cidade.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna uma instância de Estado.
     * @return
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Método que define uma instância de Estado.
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
