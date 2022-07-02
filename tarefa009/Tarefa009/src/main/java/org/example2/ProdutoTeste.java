package org.example2;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto mouse1 = new Mouse("Mouse gamer","muito preciso");
        Produto mouse2 = new Mouse("Mouse escritorio","ergonomico");
        Produto mouse3 = new Mouse("Mouse optico","resposta rapida");
        Produto mouse4 = new Mouse("Mouse manual","classico");
        Produto livro1 = new Livro("J R R Tolkien", "O Senhor dos Aneis: A Sociedade do Anel");
        Produto livro2 = new Livro("George Orwell", "1984");
        Produto livro3 = new Livro("George Orwell", "A revolução dos bixos");
        Produto livro4 = new Livro("J R R Tolkien", "O Hobbit");

        List<Produto> carrinho = new ArrayList<>();

        carrinho.add(mouse1);
        carrinho.add(mouse2);
        carrinho.add(mouse3);
        carrinho.add(mouse4);
        carrinho.add(livro1);
        carrinho.add(livro2);
        carrinho.add(livro3);
        carrinho.add(livro4);

        for (Produto p: carrinho) {
            System.out.println(p.getDescricao());
        }
    }
}
