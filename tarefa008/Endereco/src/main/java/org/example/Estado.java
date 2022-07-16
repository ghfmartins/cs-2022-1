package org.example;

/**
 * Define uma instância de Estado.
 * Author Gustavo Martins
 * Date 15/07/2022
 */
public class Estado {
    private String sigla;
    public String nome;
    private Pais pais;

    /**
     * Construtor da classe Estado.
     */
    public Estado() {
    }

    /**
     * Obtém a sigla do estado.
     * @return a sigla.
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Define uma sigla para o estado.
     * @param sigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * Obtém uma instância do País referente ao estado.
     * @return o País.
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Define uma instância de País para o estado.
     * @param pais
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
