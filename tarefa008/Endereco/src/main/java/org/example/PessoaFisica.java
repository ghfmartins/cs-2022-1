package org.example;

import java.util.Date;

/**
 * Define uma instância de Pessoa Física
 */
public class PessoaFisica {

    private String nome;
    private String sexo;
    private Date dataNascimento;

    /**
     * Construtor da classe Pessoa Física.
     */
    public PessoaFisica() {
    }

    /**
     * Obtém o nome da pessoa física.
     * @return o nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define um nome para a pessoa física.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o sexo da pessoa física.
     * @return o sexo.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define um sexo para a pessoa física.
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtém a data de nascimento da pessoa física.
     * @return a data de nascimento.
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define uma data de nascimento para a pessoa física.
     * @param dataNascimento
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
