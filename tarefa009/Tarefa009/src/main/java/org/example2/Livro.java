package org.example2;

public class Livro extends Produto{
    private String autor;

    public Livro(String autor, String descricao) {
        super.setDescricao(descricao);
        this.autor = autor;
    }

    public String getDescricao(){
        return autor + ", " + super.getDescricao();
    }
}
