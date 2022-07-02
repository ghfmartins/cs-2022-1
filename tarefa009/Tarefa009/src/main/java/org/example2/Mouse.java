package org.example2;

public class Mouse extends Produto{
    private String tipo;

    public Mouse(String tipo, String descricao){
        super.setDescricao(descricao);
        this.tipo = tipo;
    }
    public String getDescricao() {
        return tipo + ", " + super.getDescricao();
    }
}
