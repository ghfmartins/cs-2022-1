package org.example;

/**
 * Define uma instância de Endereço
 * Author Gustavo Martins
 * Date 15/07/2022
 */
public class Endereco {
    private int numero;
    private String Complemento;
    private int CEP;
    private Bairro bairro;
    private Logradouro logradouro;
    private TipoEndereco tipoEndereco;

    /**
     * Construtor de endereço.
     */
    public Endereco() {
    }

    /**
     * Retorna o número do endereço.
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do endereço.
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém o complemento do endereço.
     * @return
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * Define o complemento do endereço.
     * @param complemento
     */
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    /**
     * Obtém o cep do endereço.
     * @return
     */
    public int getCEP() {
        return CEP;
    }

    /**
     * Define o cep do endereço.
     * @param CEP
     */
    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    /**
     * Obtém umas instância de bairro do endereço.
     * @return
     */
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * Define umas instância de Bairro para o endereço.
     * @param bairro
     */
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    /**
     * Obtém uma instância de Logradouro para o endereço.
     * @return
     */
    public Logradouro getLogradouro() {
        return logradouro;
    }

    /**
     * Define uma instância de Logradouro para o endereço.
     * @param logradouro
     */
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Obtém uma instância de TipoEndereço para o endereço.
     * @return
     */
    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    /**
     * Define uma instância de TipoEndereço para o endereço.
     * @param tipoEndereco
     */
    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
